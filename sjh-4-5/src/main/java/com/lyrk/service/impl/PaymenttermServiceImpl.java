package com.lyrk.service.impl;

import com.lyrk.dao.HouseWhereDao;
import com.lyrk.dao.PaymenttermDao;
import com.lyrk.entity.*;
import com.lyrk.service.PaymenttermService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("PaymenttermService")
public class PaymenttermServiceImpl implements PaymenttermService {
    @Resource
    private PaymenttermDao paymenttermDao;

    @Override
    public ResponseResult addPaymentterm(Paymentterm paymentterm) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(paymentterm)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            boolean flag = paymenttermDao.addPaymentterm(paymentterm) > 0;
            if (flag) {
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("添加成功");
            } else {
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("添加失败");
            }
        }
        return rs;
    }

    @Override
    public PaymenttermPage queryPaymentTermList(PaymenttermParameter parameter) {
        System.out.println("breakserviceimpl queryBreakOutList******");
        System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        if(EmptyUtils.isEmpty(parameter)){
            parameter=new PaymenttermParameter();
        }else{
            if(EmptyUtils.isNotEmpty(parameter.getOrderBy())){
                if(parameter.getOrderBy().equals("getheringId")){
                    parameter.setOrderBy("getheringId");
                }
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderType())){
                if(parameter.getOrderType().equals("asc")){
                    parameter.setOrderType("asc");
                }
            }
            if(EmptyUtils.isEmpty(parameter.getOrderBy())){
                parameter.setOrderBy("getheringId");
            }
            if(EmptyUtils.isEmpty(parameter.getOrderType())){
                parameter.setOrderType("asc");
            }
        }
        parameter.setPageIndex((parameter.getCurPage()-1)*parameter.getPageSize());
        int count=paymenttermDao.towerCount(parameter);
        List<Paymentterm> list=paymenttermDao.queryTowerList(parameter);
        PaymenttermPage page=new PaymenttermPage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setPaymenttermList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }
}
