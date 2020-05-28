package com.lyrk.controller;


import com.alibaba.fastjson.JSON;
import com.lyrk.entity.*;
import com.lyrk.service.HouseSourceService;
import com.lyrk.service.HouseWhereService;
import com.lyrk.service.PaymenttermService;
import com.lyrk.service.TowerService;
import com.lyrk.util.EmptyUtils;
import com.lyrk.util.RandomNumer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class TowerController {
    @Resource
    private TowerService towerService;
    @Autowired
    private HouseSourceService houseSourceService;
    @Autowired
    private HouseWhereService houseWhereService;
    @Autowired
    private PaymenttermService paymenttermService;

   /* @RequestMapping(value = "/addTower",method = RequestMethod.POST)
    @ResponseBody
    public Object addTower(Tower_informationexpression tower){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(tower)){
            if(EmptyUtils.isNotEmpty(tower.getTowerName())){
                *//*String aa="cc";*//*
                String code = RandomNumer.getFourRandom(3);//得到一个3位的随机数据
                //String cc=aa+code;
                Integer aaa=Integer.valueOf(code);
                tower.setTowerCoding(tower.getTowerCoding()+aaa);
                 rs=towerService.addTower(tower);
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
    }*/
    @Transactional
   @RequestMapping(value = "/addTower",method = RequestMethod.POST)
   @ResponseBody
   public Object addTower(Tower_informationexpression tower){
       ResponseResult rs=new ResponseResult();
       if(EmptyUtils.isNotEmpty(tower)){
           if(EmptyUtils.isNotEmpty(tower.getTowerName())){
               /*String aa="cc";*/
               String code = RandomNumer.getFourRandom(3);//得到一个3位的随机数据
               //String cc=aa+code;
               Integer aaa=Integer.valueOf(code);
               tower.setTowerCoding(tower.getTowerCoding()+aaa);
               rs=towerService.addTower(tower);
               Housingsource housingsource=new Housingsource();
               housingsource.setHoseSource(tower.getHoseSource());
               housingsource.setHourseGoDown(tower.getHourseGoDown());
               housingsource.setProduceLabel(tower.getProduceLabel());
               housingsource.setPropertyOwner(tower.getPropertyOwner());
               housingsource.setPurchaserName(tower.getPurchaserName());
               houseSourceService.addHouseSource(housingsource);
               Housinggodown housinggodown=new Housinggodown();
               housinggodown.setHourseGoDown(tower.getHourseGoDown());
               housinggodown.setPurchaserName(tower.getPurchaserName());
               housinggodown.setTownerName(tower.getTownerName());
               housinggodown.setTenementId(tower.getTenementId());
               houseWhereService.addHouseWhere(housinggodown);
               Paymentterm paymentterm=new Paymentterm();
               paymentterm.setAccountName(tower.getAccountName());
               paymentterm.setAccountNumber(tower.getAccountNumber());
               paymentterm.setBankNo(tower.getBankNo());
               paymentterm.setGatheringName(tower.getGatheringName());
               paymenttermService.addPaymentterm(paymentterm);
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
    @RequestMapping(value = "/queryTowerList",method = RequestMethod.POST)
    public String queryTowerList (TowerParameter parameter, Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(parameter)){
            TowerPage towerPage=towerService.queryTowerList(parameter);
            if(EmptyUtils.isNotEmpty(towerPage.getTowerList())){
                rs.setData(towerPage);
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
        model.addAttribute("queryTownerList",rs);
        return "queryTownerList";
    }

    //房屋来源分页查询
    @RequestMapping(value = "/queryHouseSourceList",method = RequestMethod.POST)
    public String queryHouseSourceList (HouseSourceParameter parameter, Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(parameter)){
            HouseSourcePage towerPage=houseSourceService.queryHouseSourceList(parameter);
            if(EmptyUtils.isNotEmpty(towerPage.getHouseSourceList())){
                rs.setData(towerPage);
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
        model.addAttribute("queryHouseSourceList",rs);
        return "queryHouseSourceList";
    }
    //房屋去向分页查询
    @RequestMapping(value = "/queryHousingGoDownList",method = RequestMethod.POST)
    public String queryHousingGoDownList (HouseWhereParameter parameter, Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(parameter)){
            HouseWherePage towerPage=houseWhereService.queryHouseWhereList(parameter);
            if(EmptyUtils.isNotEmpty(towerPage.getHouseWhereList())){


                rs.setData(towerPage);
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
        model.addAttribute("queryHousingGoDownList",rs);
        return "queryHousingGoDownList";
    }
    //收款方分页查询
    @RequestMapping(value = "/queryPaymentTermList",method = RequestMethod.POST)
    public String queryPaymentTermList (PaymenttermParameter parameter, Model model){
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(parameter)){
            PaymenttermPage towerPage=paymenttermService.queryPaymentTermList(parameter);
            if(EmptyUtils.isNotEmpty(towerPage.getPaymenttermList())){
                rs.setData(towerPage);
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
        model.addAttribute("queryPaymentTermList",rs);
        return "queryPaymentTermList";
    }
    //删除楼栋信息
    @RequestMapping(value = "deleteTowener",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteTowener(@Param("towerName") String  towerName, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(towerName)){
                Tower_informationexpression towner=new Tower_informationexpression();
                towner.setTowerName(towerName);
                boolean flag=towerService.getFloor(towner);  //判断该楼栋下是否存在楼层信息
                if(flag){
                    Tower_informationexpression towner1=new Tower_informationexpression();
                    towner1.setTowerName(towerName);
                    rs=towerService.deleteTower(towner1);
                }else{
                    rs.setData("该楼栋下存在楼层信息，不可删除");
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
        return JSON.toJSON(rs);
    }
    //删除房屋来源信息
    @RequestMapping(value = "deleteHouseSource",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteHouseSource(@Param("houseId") Integer  houseId, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(houseId)){
                    Housingsource towner1=new Housingsource();
                    towner1.setHouseId(houseId);
                    rs=houseSourceService.deleteHouseSource(towner1);
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
        return JSON.toJSON(rs);
    }
    //删除房屋去向信息
    @RequestMapping(value = "deleteHousingGoDown",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteHousingGoDown(@Param("goHourseId") Integer  goHourseId, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(goHourseId)){
                    Housinggodown towner1=new Housinggodown();
                    towner1.setGoHourseId(goHourseId);
                    rs=houseWhereService.deleteHouseWhere(towner1);
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
        return JSON.toJSON(rs);
    }
    //删除收款方信息
    @RequestMapping(value = "deletepaymentterm",method = RequestMethod.POST)
    @ResponseBody
    public Object deletepaymentterm(@Param("getheringId") Integer  getheringId, Model model, HttpSession session){
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(getheringId)){
                    Paymentterm towner1=new Paymentterm();
                    towner1.setGetheringId(getheringId);
                    rs=paymenttermService.deletepaymentterm(towner1);

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
        return JSON.toJSON(rs);
    }

    //显示楼栋修改的界面
    @ResponseBody
    @RequestMapping(value = "updateTownerShow",method = RequestMethod.POST)
    public Object updateTownerShow(@Param("towerName") String  towerName,Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(towerName)){
                Tower_informationexpression towner=new Tower_informationexpression();
                towner.setTowerName(towerName);
                rs=towerService.toUpdateTowerOut(towner);
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

    //修改楼栋信息
    @ResponseBody
    @RequestMapping(value = "updateTowner",method = RequestMethod.POST)
    public Object updateTowner(Tower_informationexpression  towner, Model model,HttpSession session) {

        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(towner)){
                if (towner.getBreakoutName()!=""){
                    rs=towerService.updateTowerOut(towner);
                }
                if(towner.getHouseId()!=null){
                    Housingsource housingsource=new Housingsource();
                    housingsource.setHouseId(towner.getHouseId());
                    housingsource.setPurchaserName(towner.getPurchaserName());
                    housingsource.setPropertyOwner(towner.getPropertyOwner());
                    housingsource.setProduceLabel(towner.getProduceLabel());
                    housingsource.setHourseGoDown(towner.getHourseGoDown());
                    housingsource.setHoseSource(towner.getHoseSource());
                    housingsource.setGatheringId(towner.getGatheringId());
                    rs=houseSourceService.updateHouseSourceOut(housingsource);
                }
                if(towner.getGoHourseId()!=null){
                    Housinggodown housinggodown=new Housinggodown();
                    housinggodown.setGoHourseId(towner.getGoHourseId());
                    housinggodown.setTownerName(towner.getTownerName());
                    housinggodown.setPurchaserName(towner.getPurchaserName());
                    housinggodown.setTenementId(towner.getTenementId());
                    housinggodown.setHourseGoDown(towner.getHourseGoDown());
                    rs=houseWhereService.updateHouseWhereOut(housinggodown);
                }
                if(towner.getGetheringId()!=null){
                   Paymentterm paymentterm=new Paymentterm();
                   paymentterm.setGetheringId(towner.getGetheringId());
                   paymentterm.setGatheringName(towner.getGatheringName());
                   paymentterm.setBankNo(towner.getBankNo());
                   paymentterm.setAccountNumber(towner.getAccountNumber());
                   paymentterm.setAccountName(towner.getAccountName());
                   rs=paymenttermService.updatePaymentterm(paymentterm);
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
    //显示房屋来源修改的界面
    @ResponseBody
    @RequestMapping(value = "updateHousewhere",method = RequestMethod.POST)
    public Object updateHousewhere(@Param("houseId") Integer  houseId,Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(houseId)){
                Housingsource towner=new Housingsource();
                towner.setHouseId(houseId);
                rs=houseSourceService.toUpdateHouseSourceOut(towner);
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
    //显示房屋去向修改的界面
    @ResponseBody
    @RequestMapping(value = "updateChaHousingGoDown",method = RequestMethod.POST)
    public Object updateChaHousingGoDown(@Param("goHourseId") Integer  goHourseId,Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(goHourseId)){
                Housinggodown towner=new Housinggodown();
                towner.setGoHourseId(goHourseId);
                rs=houseWhereService.toUpdateHouseWhereOut(towner);

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
    //显示房屋去向修改的界面
    @ResponseBody
    @RequestMapping(value = "updateChaPaymentterm",method = RequestMethod.POST)
    public Object updateChaPaymentterm(@Param("getheringId") Integer  getheringId,Model model,HttpSession session) {
        ResponseResult rs=new ResponseResult();
        User user=(User)session.getAttribute("user");
        if(EmptyUtils.isNotEmpty(user)){
            if(EmptyUtils.isNotEmpty(getheringId)){
                Paymentterm towner=new Paymentterm();
                towner.setGetheringId(getheringId);
                rs=paymenttermService.toupdateChaPaymentterm(towner);
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
