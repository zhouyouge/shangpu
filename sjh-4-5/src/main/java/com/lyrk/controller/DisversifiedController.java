package com.lyrk.controller;


import com.alibaba.fastjson.JSON;
import com.lyrk.entity.*;
import com.lyrk.service.AshopriceService;
import com.lyrk.service.DisversifiedService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;

@Controller
public class DisversifiedController {
    @Resource
    private DisversifiedService disversifiedService;


    @RequestMapping(value = "/addDisversfied",method = RequestMethod.POST)
    @ResponseBody
    public Object addDisversfied(Disversified disversified){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(disversified)){
            if(EmptyUtils.isNotEmpty(disversified.getDiversifiedName())){
                 rs=disversifiedService.addDisversified(disversified);
                rs.setData("添加成功");
                rs.setFlag(1);
                rs.setResult(true);
            }else{
                rs.setData("多经信息名称为空");
                rs.setFlag(2);
                rs.setResult(false);
            }
        }else{
            rs.setData("传参为空");
            rs.setFlag(3);
            rs.setResult(false);
        }
        return JSON.toJSON(rs);
    }


    //分页查询
    @RequestMapping(value = "queryDisversifiedList",method = RequestMethod.POST)
    public String queryDisversifiedList (DisversifiedParameter parameter, Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(parameter)){
            DisversifiedPage ashopricePage=disversifiedService.queryDisversfiedList(parameter);
            if(EmptyUtils.isNotEmpty(ashopricePage.getDisversifiedList())){
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
        model.addAttribute("queryDisverfiedList",rs);
        return "queryDisverfiedList";
    }



}
