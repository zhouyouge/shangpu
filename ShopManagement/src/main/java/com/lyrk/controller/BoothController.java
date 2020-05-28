package com.lyrk.controller;

import com.alibaba.fastjson.JSON;
import com.lyrk.entity.*;
import com.lyrk.service.BoothService;
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
public class BoothController{

    @Resource
    private BoothService boothService;
    @RequestMapping(value = "/addBooth",method = RequestMethod.POST)
    @ResponseBody
    public Object addBooth(Boothinformation booth){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(booth)){
            if(EmptyUtils.isNotEmpty(booth.getBoothNumber())){
                String aa="cc";
                String code = RandomNumer.getFourRandom(3);//得到一个3位的随机数据
                String cc=aa+code;
                booth.setBoothCoding(cc);
                rs=boothService.addBooth(booth);
                rs.setData("添加成功");
                rs.setFlag(1);
                rs.setResult(true);
            }else{
                rs.setData("摊位名称为空");
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
    @RequestMapping(value = "queryBoothList",method = RequestMethod.POST)
    public String queryBoothList (BoothParameter parameter, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)) {
            if(EmptyUtils.isNotEmpty(parameter)){
                BoothPage boothPage=boothService.queryBoothList(parameter);
                if(EmptyUtils.isNotEmpty(boothPage.getBoothList())){
                    rs.setData(boothPage);
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
                rs.setFlag(2);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(5);
        }

        model.addAttribute("queryBoothList",rs);
        return "queryBoothList";
    }

    //显示摊位修改的界面
    @ResponseBody
    @RequestMapping(value = "updateBoothShow",method = RequestMethod.POST)
    public Object updateBoothShow(@Param("boothNumber") String  boothNumber, Model model, HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(boothNumber)){
                Boothinformation boothinformation=new Boothinformation();
                boothinformation.setBoothNumber(boothNumber);
                rs=boothService.toUpdateBoothOut(boothinformation);
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

    //修改摊位信息
    @ResponseBody
    @RequestMapping(value = "updateBooth",method = RequestMethod.POST)
    public Object updateBooth(Boothinformation  boothinformation, Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(boothinformation)){
                rs=boothService.updateBoothOut(boothinformation);
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

    //删除摊位信息
    @RequestMapping(value = "deleteBooth",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBooth(@Param("boothNumber") String  boothNumber, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(boothNumber)){
                Boothinformation boothinformation=new Boothinformation();
                boothinformation.setBoothNumber(boothNumber);
                rs=boothService.deleteBooth(boothinformation);
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

}
