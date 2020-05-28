package com.lyrk.service.impl;


import com.lyrk.dao.HouseWhereDao;
import com.lyrk.entity.*;
import com.lyrk.service.HouseWhereService;
import com.lyrk.util.EmptyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("HouseWhereService")
public class HouseWhereServiceImpl implements HouseWhereService {

    @Autowired
    private HouseWhereDao HouseWhereDao;

    @Override
    public ResponseResult addHouseWhere(Housinggodown house) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(house)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            boolean flag = HouseWhereDao.addHouseWhere(house) > 0;
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
    public ResponseResult toUpdateHouseWhereOut(Housinggodown house) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(house)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            Housinggodown house2 = HouseWhereDao.toUpdateHouseWhereOut(house);
            if (EmptyUtils.isNotEmpty(house2)) {
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(house2);
            } else {
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult updateHouseWhereOut(Housinggodown house) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(house)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            boolean flag = HouseWhereDao.updateHouseWhereOut(house) > 0;
            if (flag) {
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("修改成功房屋去向");
            } else {
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("修改失败");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult deleteHouseWhere(Housinggodown house) {
        ResponseResult rs = new ResponseResult();
        if (EmptyUtils.isEmpty(house)) {
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        } else {
            boolean flag = HouseWhereDao.deleteHouseWhere(house) > 0;
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
    public HouseWherePage queryHouseWhereList(HouseWhereParameter parameter) {
        System.out.println("HouseWhereServiceimpl queryHouseWhereOutList******");
        System.out.println("param=" + parameter.getCurPage() + ":" + parameter.getPageSize());
        if (EmptyUtils.isEmpty(parameter)) {
            parameter = new HouseWhereParameter();
        } else {
            if (EmptyUtils.isNotEmpty(parameter.getOrderBy())) {
                if (parameter.getOrderBy().equals("goHourseId")) {
                    parameter.setOrderBy("goHourseId");
                }
            }
            if (EmptyUtils.isNotEmpty(parameter.getOrderType())) {
                if (parameter.getOrderType().equals("asc")) {
                    parameter.setOrderType("asc");
                }
            }
            if (EmptyUtils.isEmpty(parameter.getOrderBy())) {
                parameter.setOrderBy("goHourseId");
            }
            if (EmptyUtils.isEmpty(parameter.getOrderType())) {
                parameter.setOrderType("asc");
            }
        }
        parameter.setPageIndex((parameter.getCurPage() - 1) * parameter.getPageSize());
        int count = HouseWhereDao.HouseWhereCount(parameter);
        List<Housinggodown> list = HouseWhereDao.queryHouseWhereList(parameter);
        HouseWherePage page= new HouseWherePage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setHouseWhereList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count / page.getPageSize()) + (count % page.getPageSize() == 0 ? 0 : 1));
        return page;
    }

    @Override
    public int HouseWhereCount(HouseWhereParameter parameter) {
        return HouseWhereDao.HouseWhereCount(parameter);
    }
}