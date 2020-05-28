package com.lyrk.controller;


import com.alibaba.fastjson.JSON;
import com.lyrk.entity.*;
import com.lyrk.service.TenementService;
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
public class TenemtController {
    @Resource
    private TenementService tenementService;


    @RequestMapping(value = "/addTement",method = RequestMethod.POST)
    @ResponseBody
    public Object addTement(Tenementlnformation tenement){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(tenement)){
            if(EmptyUtils.isNotEmpty(tenement.getTenantName())){
                String aa="CCZH";
                String code = RandomNumer.getFourRandom(3);//得到一个3位的随机数据
                //String cc=aa+code;
                Integer aaa=Integer.valueOf(code);
                tenement.setTenantCoding(tenement.getTenantCoding()+aaa);
                 rs=tenementService.addTenement(tenement);
                rs.setData("添加成功");
                rs.setFlag(1);
                rs.setResult(true);
            }else{
                rs.setData("楼栋名称为空");
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
    @RequestMapping(value = "/queryTenementList",method = RequestMethod.POST)
    public Object queryTementList (TenementParameter parameter, Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(parameter)){
            TenementPage tenemntPage=tenementService.queryTenementList(parameter);
            if(EmptyUtils.isNotEmpty(tenemntPage.getTenementlnformationList())){
                rs.setData(tenemntPage);
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
        model.addAttribute("queryTementList",rs);
        return "queryTementList";
    }
}
