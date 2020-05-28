package com.lyrk.controller;


import com.alibaba.fastjson.JSON;
import com.lyrk.entity.*;
import com.lyrk.service.FloorService;
import com.lyrk.service.TowerService;
import com.lyrk.util.EmptyUtils;
import com.lyrk.util.RandomNumer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class FloorController {
    @Resource
    private FloorService floorService;

    @RequestMapping(value = "/addFloor",method = RequestMethod.POST)
    @ResponseBody
    public Object addFloor(FloorInformation floorInformation){
        FloorInformation floorInformation1=new FloorInformation();
        Date date=new Date();
        date.getTime();
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(floorInformation)){
            if(EmptyUtils.isNotEmpty(floorInformation.getFloorName())){
                /*String aa="cc";*/
                String code = RandomNumer.getFourRandom(3);//得到一个3位的随机数据
                //String cc=aa+code;
                Integer aaa=Integer.valueOf(code);
                floorInformation.setFloorCoding(floorInformation.getFloorCoding()+aaa);
                 rs=floorService.addFloor(floorInformation);
                rs.setData("添加成功");
                rs.setFlag(1);
                rs.setResult(true);
            }else{
                rs.setData("楼层名称为空");
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
    @RequestMapping(value = "queryFloorList",method = RequestMethod.POST)
    public Object queryFloorList (FloorParameter parameter, Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(parameter)){
            FloorPage floorPage=floorService.queryFloorList(parameter);
            if(EmptyUtils.isNotEmpty(floorPage.getFloorInformationList())){
                rs.setData(floorPage);
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
        model.addAttribute("queryFloorList",rs);
        return "queryFloorList";
    }

    //删除楼层信息
    @RequestMapping(value = "deleteFloor",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteDisverfied(@Param("floorName") String  floorName , Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(floorName)){
                FloorInformation floorInformation=new FloorInformation();
                floorInformation.setFloorName(floorName);
                rs=floorService.deleteFloor(floorInformation);
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

    //显示楼层修改的界面
    @ResponseBody
    @RequestMapping(value = "updateFloorShow",method = RequestMethod.POST)
    public Object updateFloorShow(@Param("floorName") String  floorName,Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(floorName)){
                FloorInformation floorInformation=new FloorInformation();
                floorInformation.setFloorName(floorName);
                rs=floorService.toUpdateFloor(floorInformation);
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

    //修改楼层信息
    @ResponseBody
    @RequestMapping(value = "updateFloor",method = RequestMethod.POST)
    public Object updateFloor(FloorInformation  floorInformation, Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(floorInformation)){
                rs=floorService.updateFloor(floorInformation);
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
