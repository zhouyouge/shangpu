package com.lyrk.service.impl;

import com.lyrk.dao.BankAccountDao;
import com.lyrk.entity.*;
import com.lyrk.service.BankAccountService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("BankAccountService")
public class BankAccountServiceImpl implements BankAccountService {

    @Resource
    private BankAccountDao BankAccountDao;



    @Override
    public ResponseResult addBankAccount(BankAccount bank) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(bank)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=BankAccountDao.addBankAccount(bank)>0;
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
    public ResponseResult toUpdateBankAccountOut(BankAccount bank) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(bank)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            BankAccount tower3=BankAccountDao.toUpdateBankAccountOut(bank);
            if(EmptyUtils.isNotEmpty(tower3)){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(tower3);
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult updateBankAccountOut(BankAccount bank) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(bank)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=BankAccountDao.updateBankAccountOut(bank)>0;
            if(flag){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("修改成功银行");
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("修改失败");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult deleteBankAccount(BankAccount bank) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(bank)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=BankAccountDao.deleteBankAccount(bank)>0;
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
    public BankAccountPage queryBankAccountList(BankAccountParameter parameter) {
        System.out.println("breakserviceimpl queryBreakOutList******");
        System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        if(EmptyUtils.isEmpty(parameter)){
            parameter=new BankAccountParameter();
        }else{
            if(EmptyUtils.isNotEmpty(parameter.getOrderBy())){
                if(parameter.getOrderBy().equals("bankId")){
                    parameter.setOrderBy("bankId");
                }
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderType())){
                if(parameter.getOrderType().equals("asc")){
                    parameter.setOrderType("asc");
                }
            }
            if(EmptyUtils.isEmpty(parameter.getOrderBy())){
                parameter.setOrderBy("bankId");
            }
            if(EmptyUtils.isEmpty(parameter.getOrderType())){
                parameter.setOrderType("asc");
            }
        }
        parameter.setPageIndex((parameter.getCurPage()-1)*parameter.getPageSize());
        int count=BankAccountDao.BankAccountCount(parameter);
        List<BankAccount> list=BankAccountDao.queryBankAccountList(parameter);
        BankAccountPage page=new BankAccountPage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setBankAccountList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }

    @Override
    public int BankAccountCount(BankAccountParameter parameter) {
        return BankAccountDao.BankAccountCount(parameter);
    }
}
