package com.lyrk.service.impl;

import com.lyrk.dao.FloorDao;
import com.lyrk.entity.*;
import com.lyrk.service.FloorService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service("FloorService")
public class FloorServiceImpl implements FloorService {
    @Resource
    private FloorDao floorDao;

    @Override
    public ResponseResult addFloor(FloorInformation floor) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(floor)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=floorDao.addFloor(floor)>0;
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
    public ResponseResult toUpdateFloor(FloorInformation floor) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(floor)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            FloorInformation floor2=floorDao.toUpdateFloor(floor);
            if(EmptyUtils.isNotEmpty(floor2)){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(floor2);
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult updateFloor(FloorInformation floor) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(floor)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=floorDao.updateFloor(floor)>0;
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
    public ResponseResult deleteFloor(FloorInformation floor) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(floor)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=floorDao.deleteTower(floor)>0;
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
    public FloorPage queryFloorList(FloorParameter parameter) {
        System.out.println("FLOORSERVICEIMPL queryFloorList******");
        System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        if(EmptyUtils.isEmpty(parameter)){
            parameter=new FloorParameter();
        }else{
            if(EmptyUtils.isNotEmpty(parameter.getFloorName())){
                parameter.setFloorName("%"+parameter.getFloorName()+"%");
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderBy())){
                if(parameter.getOrderBy().equals("floorName")){
                    parameter.setOrderBy("floorName");
                }
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderType())){
                if(parameter.getOrderType().equals("asc")){
                    parameter.setOrderType("asc");
                }
            }
            if(EmptyUtils.isEmpty(parameter.getOrderBy())){
                parameter.setOrderBy("floorName");
            }
            if(EmptyUtils.isEmpty(parameter.getOrderType())){
                parameter.setOrderType("asc");
            }
        }
        parameter.setPageIndex((parameter.getCurPage()-1)*parameter.getPageSize());
        int count=floorDao.FloorCount(parameter);
        List<FloorInformation> list=floorDao.queryFloorList(parameter);
        FloorPage page=new FloorPage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setFloorInformationList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }

    @Override
    public int FloorCount(FloorParameter parameter) {
        if(EmptyUtils.isNotEmpty(parameter.getFloorName())){
            parameter.setFloorName("%"+parameter.getFloorName()+"%");
        }
        return floorDao.FloorCount(parameter);
    }


}
