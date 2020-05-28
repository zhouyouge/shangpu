package com.lyrk.service.impl;

import com.lyrk.dao.TowerDao;
import com.lyrk.entity.*;
import com.lyrk.service.TowerService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("TowerService")
public class TowerServiceImpl implements TowerService {
    @Resource
    private TowerDao towerDao;

    @Override
    public ResponseResult addTower(Tower_informationexpression tower) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(tower)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=towerDao.addTower(tower)>0;
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
    public ResponseResult toUpdateTowerOut(Tower_informationexpression tower) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(tower)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            Tower_informationexpression tower2=towerDao.toUpdateTowerOut(tower);
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
    public ResponseResult updateTowerOut(Tower_informationexpression tower) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(tower)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=towerDao.updateTowerOut(tower)>0;
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
    public ResponseResult deleteTower(Tower_informationexpression tower) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(tower)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=towerDao.deleteTower(tower)>0;
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
    public TowerPage queryTowerList(TowerParameter parameter) {
        System.out.println("breakserviceimpl queryBreakOutList******");
        System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        if(EmptyUtils.isEmpty(parameter)){
             parameter=new TowerParameter();
        }else{
            if(EmptyUtils.isNotEmpty(parameter.getTowerName())){
                parameter.setTowerName("%"+parameter.getTowerName()+"%");
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderBy())){
                if(parameter.getOrderBy().equals("breakoutName")){
                    parameter.setOrderBy("breakoutName");
                }
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderType())){
                if(parameter.getOrderType().equals("asc")){
                    parameter.setOrderType("asc");
                }
            }
            if(EmptyUtils.isEmpty(parameter.getOrderBy())){
                parameter.setOrderBy("breakoutName");
            }
            if(EmptyUtils.isEmpty(parameter.getOrderType())){
                parameter.setOrderType("asc");
            }
        }
        parameter.setPageIndex((parameter.getCurPage()-1)*parameter.getPageSize());
        int count=towerDao.towerCount(parameter);
        List<Tower_informationexpression> list=towerDao.queryTowerList(parameter);
        TowerPage page=new TowerPage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setTowerList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }

    @Override
    public int towerCount(TowerParameter parameter) {
        if(EmptyUtils.isNotEmpty(parameter.getTowerName())){
            parameter.setTowerName("%"+parameter.getTowerName()+"%");
        }
        return towerDao.towerCount(parameter);
    }

    //删除楼栋前查询器信息
    @Override
    public boolean getFloor(Tower_informationexpression towner) {
        if(EmptyUtils.isNotEmpty(towner)){
           boolean flag= towerDao.getFloor(towner)>0;
            if(flag){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}
