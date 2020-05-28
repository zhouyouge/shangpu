package com.lyrk.service.impl;

import com.lyrk.dao.BrandinformationDao;
import com.lyrk.dao.HouseSourceDao;
import com.lyrk.entity.*;
import com.lyrk.service.BrandinformationService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("BrandinformationService")
public class BrandinformationServiceImpl implements BrandinformationService {
    @Resource
    private BrandinformationDao brandinformationDao;

    @Override
    public ResponseResult addBrandinformation(Brandinformation brandinformation) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(brandinformation)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=brandinformationDao.addBrandinformation(brandinformation)>0;
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
    public BrandinformationPage queryBrandinformation(BrandinformationParameter parameter) {
        System.out.println("HouseServiceimpl queryHouseSourceOutList******");
        System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        if(EmptyUtils.isEmpty(parameter)){
            parameter=new BrandinformationParameter();
        }else{
            if(EmptyUtils.isNotEmpty(parameter.getOrderBy())){
                if(parameter.getOrderBy().equals("brandId")){
                    parameter.setOrderBy("brandId");
                }
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderType())){
                if(parameter.getOrderType().equals("asc")){
                    parameter.setOrderType("asc");
                }
            }
            if(EmptyUtils.isEmpty(parameter.getOrderBy())){
                parameter.setOrderBy("brandId");
            }
            if(EmptyUtils.isEmpty(parameter.getOrderType())){
                parameter.setOrderType("asc");
            }
        }
        parameter.setPageIndex((parameter.getCurPage()-1)*parameter.getPageSize());
        int count=brandinformationDao.HouseSourceCount(parameter);
        List<Brandinformation> list=brandinformationDao.queryBrandinformation(parameter);
        BrandinformationPage page=new BrandinformationPage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setBrandinformationList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }

    @Override
    public ResponseResult toupdateBrandinformation(Brandinformation breakout) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(breakout)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            Brandinformation house2=brandinformationDao.toupdateBrandinformation(breakout);
            if(EmptyUtils.isNotEmpty(house2)){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(house2);
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult updaetBrandinformation(Brandinformation brandinformation) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(brandinformation)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=brandinformationDao.updaetBrandinformation(brandinformation)>0;
            if(flag){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("修改成功品牌");
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("修改失败");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult deleteBrandinformation(Brandinformation breakout) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(breakout)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=brandinformationDao.deleteBrandinformation(breakout)>0;
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
}
