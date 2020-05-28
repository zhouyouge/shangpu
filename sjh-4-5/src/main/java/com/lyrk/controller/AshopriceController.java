package com.lyrk.controller;


import com.alibaba.fastjson.JSON;
import com.lyrk.entity.*;
import com.lyrk.service.AshopriceService;
import com.lyrk.service.TowerService;
import com.lyrk.util.EmptyUtils;
import com.lyrk.util.RandomNumer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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
}
