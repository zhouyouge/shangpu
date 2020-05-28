package com.lyrk.service.impl;

import com.lyrk.dao.BillDao;
import com.lyrk.dao.TowerDao;
import com.lyrk.entity.*;
import com.lyrk.service.BillService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("BillService")
public class BillServiceImpl implements BillService {

    @Resource
    private BillDao BillDao;

    @Override
    public ResponseResult addBill(Bill_informationExpression bill) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(bill)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=BillDao.addBill(bill)>0;
            if(flag){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("添加成功");
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("添加失败");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult toUpdateBillOut(Bill_informationExpression bill) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(bill)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            Bill_informationExpression tower2=BillDao.toUpdateBillOut(bill);
            if(EmptyUtils.isNotEmpty(tower2)){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(tower2);
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult updateBillOut(Bill_informationExpression bill) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(bill)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=BillDao.updateBillOut(bill)>0;
            if(flag){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("修改成功开票");
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("修改失败");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult deleteBill(Bill_informationExpression bill) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(bill)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=BillDao.deleteBill(bill)>0;
            if(flag){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("删除成功");
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("删除失败");
            }
        }
        return rs;
    }

    @Override
    public BillPage queryBillList(BillParameter parameter) {
        System.out.println("breakserviceimpl queryBreakOutList******");
        System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        if(EmptyUtils.isEmpty(parameter)){
            parameter=new BillParameter();
        }else{
            if(EmptyUtils.isNotEmpty(parameter.getOrderBy())){
                if(parameter.getOrderBy().equals("billId")){
                    parameter.setOrderBy("billId");
                }
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderType())){
                if(parameter.getOrderType().equals("asc")){
                    parameter.setOrderType("asc");
                }
            }
            if(EmptyUtils.isEmpty(parameter.getOrderBy())){
                parameter.setOrderBy("billId");
            }
            if(EmptyUtils.isEmpty(parameter.getOrderType())){
                parameter.setOrderType("asc");
            }
        }
        parameter.setPageIndex((parameter.getCurPage()-1)*parameter.getPageSize());
        int count=BillDao.BillCount(parameter);
        List<Bill_informationExpression> list=BillDao.queryBillList(parameter);
        BillPage page=new BillPage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setBillList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }

    @Override
    public int BillCount(BillParameter parameter) {
        return BillDao.BillCount(parameter);
    }
}
