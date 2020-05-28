package com.lyrk.service.impl;

import com.lyrk.dao.TenementDao;
import com.lyrk.dao.TowerDao;
import com.lyrk.entity.*;
import com.lyrk.service.TenementService;
import com.lyrk.service.TowerService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("TenementService")
public class TenementServiceImpl implements TenementService {
    @Resource
    private TenementDao tenementDao;

    @Override
    public ResponseResult addTenement(Tenementlnformation tenement) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(tenement)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=tenementDao.addTenement(tenement)>0;
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
    public ResponseResult toUpdateTenement(Tenementlnformation tenement) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(tenement)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            Tenementlnformation tenement2=tenementDao.toUpdateTenement(tenement);
            if(EmptyUtils.isNotEmpty(tenement2)){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(tenement2);
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult updateTenement(Tenementlnformation tenement) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(tenement)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=tenementDao.updateTenement(tenement)>0;
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
    public ResponseResult deleteTenement(Tenementlnformation tenement) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(tenement)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=tenementDao.deleteTenement(tenement)>0;
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
    public TenementPage queryTenementList(TenementParameter parameter) {
        System.out.println("breakserviceimpl queryBreakOutList******");
        if(EmptyUtils.isEmpty(parameter)){
            parameter=new TenementParameter();
            System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        }else{
            if(EmptyUtils.isNotEmpty(parameter.getTenantName())){
                parameter.setTenantName("%"+parameter.getTenantName()+"%");
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderBy())){
                if(parameter.getOrderBy().equals("tenantName")){
                    parameter.setOrderBy("tenantName");
                }
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderType())){
                if(parameter.getOrderType().equals("asc")){
                    parameter.setOrderType("asc");
                }
            }
            if(EmptyUtils.isEmpty(parameter.getOrderBy())){
                parameter.setOrderBy("tenantName");
            }
            if(EmptyUtils.isEmpty(parameter.getOrderType())){
                parameter.setOrderType("asc");
            }
        }
        parameter.setPageIndex((parameter.getCurPage()-1)*parameter.getPageSize());
        int count=tenementDao.TenementCount(parameter);
        List<Tenementlnformation> list=tenementDao.queryTenementList(parameter);
        TenementPage page=new TenementPage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setTenementlnformationList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }

    @Override
    public int TenementCount(TenementParameter parameter) {
        if(EmptyUtils.isNotEmpty(parameter)){
            parameter.setTenantName("%"+parameter.getTenantName()+"%");
        }
        return tenementDao.TenementCount(parameter);
    }
}
