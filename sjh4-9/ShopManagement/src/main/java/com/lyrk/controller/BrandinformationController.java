package com.lyrk.controller;

import com.alibaba.fastjson.JSON;
import com.lyrk.entity.*;
import com.lyrk.service.BrandinformationService;
import com.lyrk.util.EmptyUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class BrandinformationController {
    @Autowired
    private BrandinformationService brandinformationService;

    @RequestMapping(value = "/addBrandinformation",method = RequestMethod.POST)
    @ResponseBody
    public Object addBrandinformation(Brandinformation brandinformation){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(brandinformation)){
                rs=brandinformationService.addBrandinformation(brandinformation);
                rs.setData("添加成功");
                rs.setFlag(1);
                rs.setResult(true);
        }else{
            rs.setData("传参为空");
            rs.setFlag(3);
            rs.setResult(false);
        }
        return JSON.toJSON(rs);
    }
    //分页查询
    @RequestMapping(value = "queryBrandinformation",method = RequestMethod.POST)
    public String queryBrandinformation(BrandinformationParameter parameter, Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(parameter)){
            BrandinformationPage ashopricePage=brandinformationService.queryBrandinformation(parameter);
            if(EmptyUtils.isNotEmpty(ashopricePage.getBrandinformationList())){
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
        model.addAttribute("queryBrandinformation",rs);
        return "queryBrandinformation";
    }
    //显示品牌修改的界面
    @ResponseBody
    @RequestMapping(value = "toupdateBrandinformation",method = RequestMethod.POST)
    public Object toupdateBrandinformation(@Param("brandId") Integer  brandId, Model model, HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(brandId)){
                Brandinformation breakout=new Brandinformation();
                breakout.setBrandId(brandId);
                rs=brandinformationService.toupdateBrandinformation(breakout);
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
    //修改品牌信息
    @ResponseBody
    @RequestMapping(value = "updaetBrandinformation",method = RequestMethod.POST)
    public Object updaetBrandinformation(Brandinformation  brandinformation, Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(brandinformation)){
                if(brandinformation.getBrandId()!=null){
                    rs=brandinformationService.updaetBrandinformation(brandinformation);
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
        return JSON.toJSONString(rs);
    }
    //删除品牌信息
    @RequestMapping(value = "deleteBrandinformation",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBrandinformation(@Param("brandId") Integer brandId, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(brandId)){
                Brandinformation breakout=new Brandinformation();
                breakout.setBrandId(brandId);
                rs=brandinformationService.deleteBrandinformation(breakout);
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
