package com.lyrk.service.impl;


import com.lyrk.dao.CommercialactivitiesDao;
import com.lyrk.entity.*;
import com.lyrk.service.CommercialactivitiesService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("CommercialactivitiesService")
public class CommercialactivitiesServiceImpl implements CommercialactivitiesService {

    @Resource
    private CommercialactivitiesDao commercialactivitiesDao;

    @Override
    public CommercialPage getCommer(CommercialParameter parameter) {
        System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        if(EmptyUtils.isEmpty(parameter)){
            parameter = new CommercialParameter();
        }else{
            if(EmptyUtils.isNotEmpty(parameter.getCommercialName())){
                parameter.setCommercialName("%"+parameter.getCommercialName()+"%");
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderBy())){
                if(parameter.getOrderBy().equals("commercialName")){
                    parameter.setOrderBy("commercialName");
                }
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderType())){
                if(parameter.getOrderType().equals("asc")){
                    parameter.setOrderType("asc");
                }
            }
            if(EmptyUtils.isEmpty(parameter.getOrderBy())){
                parameter.setOrderBy("commercialName");
            }
            if(EmptyUtils.isEmpty(parameter.getOrderType())){
                parameter.setOrderType("asc");
            }
        }
        parameter.setPageIndex((parameter.getCurPage()-1)*parameter.getPageSize());
        int count = commercialactivitiesDao.queryCommercialCount(parameter);
        List<Commercialactivities> list=commercialactivitiesDao.getCommer(parameter);
        CommercialPage page=new CommercialPage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setCommercialactivitiesList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }

    @Override
    public int queryCommercialCount(CommercialParameter parameter) {
        if(EmptyUtils.isNotEmpty(parameter.getCommercialName())){
            parameter.setCommercialName("%"+parameter.getCommercialName()+"%");
        }
        return commercialactivitiesDao.queryCommercialCount(parameter);
    }

    @Override
    public ResponseResult toUpdateCommercialactivities(Commercialactivities commercialactivities) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(commercialactivities)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            Commercialactivities commer = commercialactivitiesDao.toUpdateCommercialactivities(commercialactivities);
            if (EmptyUtils.isNotEmpty(commer)) {
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(commer);
            } else {
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult updateCommercial(Commercialactivities commercialactivities) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(commercialactivities)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            boolean flag = commercialactivitiesDao.updateCommercial(commercialactivities) > 0;
            if (flag) {
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("修改成功");
            } else {
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("修改失败");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult deleteCommercial(Commercialactivities commercialactivities) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(commercialactivities)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            boolean flag=false;
            if(deleteQian(commercialactivities).getResult()==true){
                 flag = commercialactivitiesDao.deleteCommercial(commercialactivities) > 0;
            }else{
                rs.setFlag(4);
                rs.setResult(false);
                rs.setData("业态信息正在使用无法删除");
            }
            if (flag) {
                rs.setFlag(3);
                rs.setResult(true);
                rs.setData("删除成功");
            } else {
                rs.setFlag(4);
                rs.setResult(false);
                rs.setData("业态信息删除失败");
            }
        }
        return rs;

    }

    @Override
    public ResponseResult deleteQian(Commercialactivities commercialactivities) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(commercialactivities)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            boolean booth=commercialactivitiesDao.getBooth(commercialactivities)<=0;
            boolean brandInformation=commercialactivitiesDao.getBrandInformation(commercialactivities)<=0;
            boolean tenementlnformation=commercialactivitiesDao.getTenement(commercialactivities)<=0;
            if (booth&&brandInformation&&tenementlnformation) {
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("业态信息可以删除");
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("业态信息正在使用中，不可删除");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult addCommercial(Commercialactivities commercialactivities) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(commercialactivities)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            boolean flag = commercialactivitiesDao.addCommercial(commercialactivities) > 0;
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
}
