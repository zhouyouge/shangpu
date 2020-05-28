package com.lyrk.service.impl;

import com.lyrk.dao.ContractDao;
import com.lyrk.dao.TowerDao;
import com.lyrk.entity.ContractPage;
import com.lyrk.entity.ContractParameter;
import com.lyrk.entity.ResponseResult;
import com.lyrk.entity.Townercontract;
import com.lyrk.service.ContractService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ContractService")
public class ContractServiceImpl implements ContractService {

    @Resource
    private ContractDao ContractDao;

    @Override
    public boolean addContract(Townercontract town) {
        System.out.println("breakserviceimpl add******");
        if(EmptyUtils.isEmpty(town)){
            return false;
        }else{
            if(EmptyUtils.isNotEmpty(town)){
                if(EmptyUtils.isEmpty(ContractDao.toUpdateContractOut(town))){
                    return ContractDao.addContract(town)>0;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }

    }

    @Override
    public ResponseResult toUpdateContractOut(Townercontract town) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(town)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            Townercontract tower2=ContractDao.toUpdateContractOut(town);
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
    public ResponseResult updateContractOut(Townercontract town) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(town)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=ContractDao.updateContractOut(town)>0;
            if(flag){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("修改成功");
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("修改失败");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult deleteContract(Townercontract town) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(town)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=ContractDao.deleteContract(town)>0;
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
    public ContractPage queryContractList(ContractParameter parameter) {
        System.out.println("breakserviceimpl queryBreakOutList******");
        System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        if(EmptyUtils.isEmpty(parameter)){
            parameter=new ContractParameter();
        }else{
            if(EmptyUtils.isNotEmpty(parameter.getOrderBy())){
                if(parameter.getOrderBy().equals("BreakId")){
                    parameter.setOrderBy("BreakId");
                }
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderType())){
                if(parameter.getOrderType().equals("asc")){
                    parameter.setOrderType("asc");
                }
            }
            if(EmptyUtils.isEmpty(parameter.getOrderBy())){
                parameter.setOrderBy("BreakId");
            }
            if(EmptyUtils.isEmpty(parameter.getOrderType())){
                parameter.setOrderType("asc");
            }
        }
        parameter.setPageIndex((parameter.getCurPage()-1)*parameter.getPageSize());
        int count=ContractDao.ContractCount(parameter);
        List<Townercontract> list=ContractDao.queryTowerList(parameter);
        ContractPage page=new ContractPage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setContractList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }

    @Override
    public int ContractCount(ContractParameter parameter) {
        return ContractDao.ContractCount(parameter);
    }
}
