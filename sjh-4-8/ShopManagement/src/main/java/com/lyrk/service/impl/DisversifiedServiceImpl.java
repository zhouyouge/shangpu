package com.lyrk.service.impl;

import com.lyrk.dao.DisversifiedDao;
import com.lyrk.entity.*;
import com.lyrk.service.DisversifiedService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("DisversifiedService")
public class DisversifiedServiceImpl implements DisversifiedService {
    @Resource
    private DisversifiedDao disversifiedDao;
    @Override
    public ResponseResult addDisversified(Disversified disversified) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(disversified)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=disversifiedDao.addDisversified(disversified)>0;
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
    public ResponseResult toUpdateDisversfied(Disversified disversified) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(disversified)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            Disversified disversified1=disversifiedDao.toUpdateDisversfied(disversified);
            if(EmptyUtils.isNotEmpty(disversified1)){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(disversified1);
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult updateDisversified(Disversified disversified) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(disversified)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=disversifiedDao.updateDisversified(disversified)>0;
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
    public ResponseResult deleteDisversified(Disversified disversified) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(disversified)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=disversifiedDao.deleteDisversified(disversified)>0;
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
    public DisversifiedPage queryDisversfiedList(DisversifiedParameter parameter) {
        System.out.println(" queryDisversfiedList******");
        System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        if(EmptyUtils.isEmpty(parameter)){
            parameter=new DisversifiedParameter();
        }else{
            if(EmptyUtils.isNotEmpty(parameter.getDiversifiedName())){
                parameter.setDiversifiedName("%"+parameter.getDiversifiedName()+"%");
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderBy())){
                if(parameter.getOrderBy().equals("diversifiedName")){
                    parameter.setOrderBy("diversifiedName");
                }
            }
            if(EmptyUtils.isNotEmpty(parameter.getOrderType())){
                if(parameter.getOrderType().equals("asc")){
                    parameter.setOrderType("asc");
                }
            }
            if(EmptyUtils.isEmpty(parameter.getOrderBy())){
                parameter.setOrderBy("diversifiedName");
            }
            if(EmptyUtils.isEmpty(parameter.getOrderType())){
                parameter.setOrderType("asc");
            }
        }
        parameter.setPageIndex((parameter.getCurPage()-1)*parameter.getPageSize());
        int count=disversifiedDao.disversifedCount(parameter);
        List<Disversified> list=disversifiedDao.queryDisversfiedList(parameter);
        DisversifiedPage page=new DisversifiedPage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setDisversifiedList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }

    @Override
    public int disversifedCount(DisversifiedParameter parameter) {
        if(EmptyUtils.isNotEmpty(parameter.getDiversifiedName())){
            parameter.setDiversifiedName("%"+parameter.getDiversifiedName()+"%");
        }
        return disversifiedDao.disversifedCount(parameter);
    }
}
