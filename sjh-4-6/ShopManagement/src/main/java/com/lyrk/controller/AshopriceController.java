package com.lyrk.controller;


import com.alibaba.fastjson.JSON;
import com.lyrk.entity.*;
import com.lyrk.service.AshopriceService;
import com.lyrk.service.TowerService;
import com.lyrk.util.EmptyUtils;
import com.lyrk.util.RandomNumer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class AshopriceController {
    @Resource
    private AshopriceService ashopriceService;


    @RequestMapping(value = "/addAshoprice",method = RequestMethod.POST)
    @ResponseBody
    public Object addAshoprice(Ashopprice ashopprice){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(ashopprice)){
            if(EmptyUtils.isNotEmpty(ashopprice.getBoothNumber())){
                 rs=ashopriceService.addAshopprice(ashopprice);
                rs.setData("添加成功");
                rs.setFlag(1);
                rs.setResult(true);
            }else{
                rs.setData("一铺一价名称为空");
                rs.setFlag(2);
                rs.setResult(false);
            }
        }else{
            rs.setData("传参为空");
            rs.setFlag(3);
            rs.setResult(false);
        }
        return JSON.toJSONString(rs);
    }


    //分页查询
    @RequestMapping(value = "/queryAshopriceList",method = RequestMethod.POST)
    public Object queryAshopriceList (AshopriceParameter parameter, Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(parameter)){
            AshopPricePage ashopricePage=ashopriceService.queryAshoppriceList(parameter);
            if(EmptyUtils.isNotEmpty(ashopricePage.getAshoppriceList())){
                rs.setData(ashopricePage);
                rs.setResult(true);
                rs.setFlag(1);
            }else{
                rs.setData("获取集合为空");
                rs.setResult(false);
                rs.setFlag(2);
            }
        }else{
            rs.setData("获取集合为空");
            rs.setResult(false);
            rs.setFlag(3);
        }
        model.addAttribute("queryAshopriceList",rs);
        return "queryAshopriceList";
    }

    //删除一铺一价信息
    @RequestMapping(value = "deleteAshoprice",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteAshoprice(@Param("ashopId") int  ashopId, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(ashopId)){
                Ashopprice ashopprice=new Ashopprice();
                ashopprice.setAshopId(ashopId);
                rs=ashopriceService.deleteAshopprice(ashopprice);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSON(rs);
    }

    //显示一铺一价修改的界面
    @ResponseBody
    @RequestMapping(value = "updateAshopriceShow",method = RequestMethod.POST)
    public Object updateAshopriceShow(@Param("ashopId") int  ashopId,Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(ashopId)){
                Ashopprice ashopprice=new Ashopprice();
                ashopprice.setAshopId(ashopId);
                rs=ashopriceService.toUpdateAshopprice(ashopprice);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSONString(rs);
    }

    //修改一铺一价信息
    @ResponseBody
    @RequestMapping(value = "updateAshoprice",method = RequestMethod.POST)
    public Object updateAshoprice(Ashopprice  ashopprice, Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(ashopprice)){
                rs=ashopriceService.updateAshopprice(ashopprice);
            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(4);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }
        return JSON.toJSONString(rs);
    }

}

