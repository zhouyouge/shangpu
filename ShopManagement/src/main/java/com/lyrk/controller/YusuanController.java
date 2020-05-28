package com.lyrk.controller;

import com.lyrk.entity.ResponseResult;
import com.lyrk.entity.Yusuan;
import com.lyrk.service.YusuanService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class YusuanController {
    @Resource
    private YusuanService yusuanService;


    @RequestMapping(value = "/YusuanList",method = RequestMethod.POST)
    public String YusuanList(Yusuan yusuan, Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(yusuan)){
             rs=yusuanService.Yusuan1(yusuan);
             List<Yusuan> list=(ArrayList<Yusuan>)rs.getData();
            if(EmptyUtils.isNotEmpty(list)){
            }else{
                rs.setData("获取集合为空");
                rs.setResult(false);
                rs.setFlag(7);
            }
        }else{
            rs.setData("获取集合为空");
            rs.setResult(false);
            rs.setFlag(8);
        }
        model.addAttribute("queryYusuanList",rs);
        return "queryYusuanList";
    }
    @RequestMapping(value = "/YusuanList2",method = RequestMethod.POST)
    public String YusuanList2(Yusuan yusuan, Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(yusuan)){
            rs=yusuanService.Yusuan2(yusuan);
            List<Yusuan> list=(ArrayList<Yusuan>)rs.getData();
            if(EmptyUtils.isNotEmpty(list)){
            }else{
                rs.setData("获取集合为空");
                rs.setResult(false);
                rs.setFlag(7);
            }
        }else{
            rs.setData("获取集合为空");
            rs.setResult(false);
            rs.setFlag(8);
        }
        model.addAttribute("queryYusuanList",rs);
        return "queryYusuanList2";
    }
}
