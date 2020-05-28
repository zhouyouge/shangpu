package com.lyrk.controller;


import com.alibaba.fastjson.JSON;
import com.lyrk.entity.*;
import com.lyrk.service.CommercialactivitiesService;
import com.lyrk.util.EmptyUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CommercialactivitiesController {

    @Resource
    private CommercialactivitiesService commercialactivitiesService;


    //分页查询
    @RequestMapping(value = "/commerList",method = RequestMethod.POST)
    public Object commerList (CommercialParameter parameter, Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(parameter)){
            CommercialPage commerPage=commercialactivitiesService.getCommer(parameter);
            if(EmptyUtils.isNotEmpty(commerPage.getCommercialactivitiesList())){
                rs.setData(commerPage);
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
        model.addAttribute("commerList",rs);
        return "commerList";
    }

    @RequestMapping(value = "/addCommer",method = RequestMethod.POST)
    @ResponseBody
    public Object addCommer(Commercialactivities commercialactivities){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(commercialactivities)){
            if(EmptyUtils.isNotEmpty(commercialactivities.getCommercialName())){
                rs=commercialactivitiesService.addCommercial(commercialactivities);
                rs.setData("添加成功");
                rs.setFlag(1);
                rs.setResult(true);
            }else{
                rs.setData("业态名称为空");
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

    //删除一铺一价信息
    @RequestMapping(value = "deleteCommer",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteCommer(@Param("commercialId")  int commercialId,@Param("commercialName")  String commercialName, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(commercialName)){
                Commercialactivities commercialactivities=new Commercialactivities();
                commercialactivities.setCommercialId(commercialId);
                commercialactivities.setCommercialName(commercialName);
                rs= commercialactivitiesService.deleteQian(commercialactivities);
                if(rs.getResult()==true){
                    rs=commercialactivitiesService.deleteCommercial(commercialactivities);
                }else{
                    rs.setData("该业态正在使用中，无法删除");
                    rs.setResult(false);
                    rs.setFlag(4);
                }

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

    //显示业态修改的界面
    @ResponseBody
    @RequestMapping(value = "updateCommerShow",method = RequestMethod.POST)
    public Object updateCommerShow(@Param("commercialName") String  commercialName, Model model, HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(commercialName)){
                Commercialactivities commercialactivities=new Commercialactivities();
                commercialactivities.setCommercialName(commercialName);
               rs= commercialactivitiesService.deleteQian(commercialactivities);
               if(rs.getResult()==true){
                   rs=commercialactivitiesService.toUpdateCommercialactivities(commercialactivities);
               }else{
                   rs.setData("该业态正在使用中，无法修改");
                   rs.setResult(false);
                   rs.setFlag(4);
               }

            }else{
                rs.setData("传参为空");
                rs.setResult(false);
                rs.setFlag(5);
            }
        }else{
            rs.setData("用户未登录");
            rs.setResult(false);
            rs.setFlag(6);
        }
        return JSON.toJSONString(rs);
    }

    //修改摊位信息
    @ResponseBody
    @RequestMapping(value = "updateCommer",method = RequestMethod.POST)
    public Object updateCommer(Commercialactivities  commercialactivities, Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(commercialactivities)){
                rs=commercialactivitiesService.updateCommercial(commercialactivities);
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
