package com.lyrk.controller;


import com.lyrk.entity.Commercialactivities;
import com.lyrk.service.CommercialactivitiesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CommercialactivitiesController {

    @Resource
    private CommercialactivitiesService commercialactivitiesService;

    @RequestMapping(value = "/commerList",method = RequestMethod.GET)
    public String commerList(Model model){
        Commercialactivities commer=new Commercialactivities();
        List<Commercialactivities> list= commercialactivitiesService.getCommer(commer);
        model.addAttribute("commerLists",list);
    return "commerList";
    }

}
