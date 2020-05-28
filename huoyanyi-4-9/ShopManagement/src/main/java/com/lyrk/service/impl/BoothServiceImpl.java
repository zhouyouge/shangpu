package com.lyrk.service.impl;

import com.lyrk.dao.BoothDao;
import com.lyrk.entity.*;
import com.lyrk.service.BoothService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("BoothService")
public class BoothServiceImpl implements BoothService {

    @Resource
    private BoothDao boothDao;


    @Override
    public ResponseResult addBooth(Boothinformation booth) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(booth)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            boolean flag = boothDao.addBooth(booth) > 0;
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
    public ResponseResult toUpdateBoothOut(Boothinformation booth) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(booth)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            Boothinformation tower2 = boothDao.toUpdateBoothOut(booth);
            if (EmptyUtils.isNotEmpty(tower2)) {
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(tower2);
            } else {
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult updateBoothOut(Boothinformation booth) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(booth)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            boolean flag = boothDao.updateBoothOut(booth) > 0;
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
    public ResponseResult deleteBooth(Boothinformation booth) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(booth)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            boolean flag = boothDao.deleteBooth(booth) > 0;
            if (flag) {
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("删除成功");
            } else {
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("删除失败");
            }
        }
        return rs;

    }



   @Override
    public BoothPage queryBoothList(BoothParameter parameter) {
        System.out.println("Boothserviceimpl queryBreakOutList******");
        System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        if(EmptyUtils.isEmpty(parameter)){
            parameter = new BoothParameter();
        }else{
            if(EmptyUtils.isNotEmpty(parameter.getBoothNumber())){
                parameter.setBoothNumber("%"+parameter.getBoothNumber()+"%");
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderBy())){
                if(parameter.getOrderBy().equals("boothNumber")){
                    parameter.setOrderBy("boothNumber");
                }
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderType())){
                if(parameter.getOrderType().equals("asc")){
                    parameter.setOrderType("asc");
                }
            }
            if(EmptyUtils.isEmpty(parameter.getOrderBy())){
                parameter.setOrderBy("boothNumber");
            }
            if(EmptyUtils.isEmpty(parameter.getOrderType())){
                parameter.setOrderType("asc");
            }
        }
        parameter.setPageIndex((parameter.getCurPage()-1)*parameter.getPageSize());
        int count = boothDao.BoothCount(parameter);
        List<Boothinformation> list=boothDao.queryBoothList(parameter);
        BoothPage page=new BoothPage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setBoothList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }



    @Override
    public int BoothCount(BoothParameter parameter) {
        if(EmptyUtils.isNotEmpty(parameter.getBoothNumber())){
            parameter.setBoothNumber("%"+parameter.getBoothNumber()+"%");
        }
       return boothDao.BoothCount(parameter);
    }
}
