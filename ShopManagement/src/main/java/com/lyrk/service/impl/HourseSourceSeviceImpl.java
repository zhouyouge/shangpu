package com.lyrk.service.impl;

import com.lyrk.dao.HouseSourceDao;
import com.lyrk.entity.*;
import com.lyrk.service.HouseSourceService;
import com.lyrk.util.EmptyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

@Service("HouseSourceService")
public class HourseSourceSeviceImpl implements HouseSourceService {

   @Autowired
    private HouseSourceDao HouseSourceDao;

    @Override
    public ResponseResult addHouseSource(Housingsource house) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(house)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=HouseSourceDao.addHouseSource(house)>0;
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
    public ResponseResult toUpdateHouseSourceOut(Housingsource house) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(house)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            Housingsource house2=HouseSourceDao.toUpdateHouseSourceOut(house);
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
    public ResponseResult updateHouseSourceOut(Housingsource house) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(house)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=HouseSourceDao.updateHouseSourceOut(house)>0;
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
    public ResponseResult deleteHouseSource(Housingsource house) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(house)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=HouseSourceDao.deleteHouseSource(house)>0;
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
    public HouseSourcePage queryHouseSourceList(HouseSourceParameter parameter) {
        System.out.println("HouseServiceimpl queryHouseSourceOutList******");
        System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        if(EmptyUtils.isEmpty(parameter)){
            parameter=new HouseSourceParameter();
        }else{
            if(EmptyUtils.isNotEmpty(parameter.getOrderBy())){
                if(parameter.getOrderBy().equals("houseId")){
                    parameter.setOrderBy("houseId");
                }
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderType())){
                if(parameter.getOrderType().equals("asc")){
                    parameter.setOrderType("asc");
                }
            }
            if(EmptyUtils.isEmpty(parameter.getOrderBy())){
                parameter.setOrderBy("houseId");
            }
            if(EmptyUtils.isEmpty(parameter.getOrderType())){
                parameter.setOrderType("asc");
            }
        }
        parameter.setPageIndex((parameter.getCurPage()-1)*parameter.getPageSize());
        int count=HouseSourceDao.HouseSourceCount(parameter);
        List<Housingsource> list=HouseSourceDao.queryHouseSourceList(parameter);
        HouseSourcePage page=new HouseSourcePage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setHouseSourceList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }

    @Override
    public int HouseSourceCount(HouseSourceParameter parameter) {
        return HouseSourceDao.HouseSourceCount(parameter);
    }
}
