package com.lyrk.service.impl;


import com.lyrk.dao.BreakOutDao;
import com.lyrk.entity.*;
import com.lyrk.service.BreakOutService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("BreakOutService")
public class BreakOutServiceImpl implements BreakOutService {
    @Resource
    private BreakOutDao breakOutDao;

   /* @Override
    public ResponseResult addBreak(Breakout Breakout) {
        System.out.println("breakserviceimpl add******");
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(Breakout)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=breakOutDao.addBreak(Breakout)>0;
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
    }*/
   @Override
   public boolean addBreak(Test Breakout) {
       System.out.println("breakserviceimpl add******");
       if(EmptyUtils.isEmpty(Breakout)){
           return false;
       }else{
           if(EmptyUtils.isNotEmpty(Breakout)){
               if(EmptyUtils.isEmpty(breakOutDao.toUpdateBreakOut(Breakout))){
                   return breakOutDao.addBreak(Breakout)>0;
               }else{
                   return false;
               }
           }else{
               return false;
           }
       }
   }

    @Override
    public BreakPage queryBreakOutList(BreakParameter parameter) {
        System.out.println("breakserviceimpl queryBreakOutList******");
        System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        if(EmptyUtils.isEmpty(parameter)){
            parameter=new BreakParameter();
        }else{
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
        int count=breakOutDao.queryCount(parameter);
        List<Breakout> list=breakOutDao.queryBreakOutList(parameter);
        BreakPage page=new BreakPage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setBreakoutList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }

    @Override
    public Test toUpdateBreakOut(Test breakout) {
      /*  System.out.println("breakserviceimpl toUpdateBreakOut******");
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(breakout)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            Test breakout2=breakOutDao.toUpdateBreakOut( breakout);
            if(EmptyUtils.isNotEmpty(breakout2)){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(breakout2);
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("查询未空");
            }
        }
        return rs;*/
        System.out.println("breakserviceimpl toUpdateBreakOut******");
        return breakOutDao.toUpdateBreakOut(breakout);
    }

    @Override
    public ResponseResult  updateBreakOut(Breakout breakout) {
        System.out.println("breakserviceimpl updateBreakOut******");
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(breakout)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=breakOutDao.updateBreakOut(breakout)>0;
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
    public ResponseResult deleteBreakOut(Breakout breakout) {
        System.out.println("breakserviceimpl deleteBreakOut******");
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(breakout)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=breakOutDao.deleteBreakOut(breakout)>0;
            if(flag){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("删除成功");
            }else{
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData("删除失败");
            }
        }
        return rs;
    }

}
