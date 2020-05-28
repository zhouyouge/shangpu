package com.lyrk.service.impl;

import com.lyrk.dao.AshopPriceDao;
import com.lyrk.dao.TenementDao;
import com.lyrk.entity.*;
import com.lyrk.service.AshopriceService;
import com.lyrk.service.TenementService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("AshopriceService")
public class AshopriceServiceImpl implements AshopriceService {
    @Resource
    private AshopPriceDao ashopPriceDao;

    @Override
    public ResponseResult addAshopprice(Ashopprice ashopprice) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(ashopprice)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=ashopPriceDao.addAshopprice(ashopprice)>0;
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
    public ResponseResult toUpdateAshopprice(Ashopprice ashopprice) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(ashopprice)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            Ashopprice ashopprice1=ashopPriceDao.toUpdateAshopprice(ashopprice);
            if(EmptyUtils.isNotEmpty(ashopprice1)){
                rs.setFlag(2);
                rs.setResult(true);
                rs.setData(ashopprice1);
            }else{
                rs.setFlag(3);
                rs.setResult(false);
                rs.setData("未查询到数据");
            }
        }
        return rs;
    }

    @Override
    public ResponseResult updateAshopprice(Ashopprice ashopprice) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(ashopprice)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=ashopPriceDao.updateAshopprice(ashopprice)>0;
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
    public ResponseResult deleteAshopprice(Ashopprice ashopprice) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isEmpty(ashopprice)){
            rs.setFlag(1);
            rs.setResult(false);
            rs.setData("传参为空");
        }else{
            boolean flag=ashopPriceDao.deleteAshopprice(ashopprice)>0;
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
    public AshopPricePage queryAshoppriceList(AshopriceParameter parameter) {
        System.out.println(" queryAshoppriceList******");
        System.out.println("param="+parameter.getCurPage()+":"+parameter.getPageSize());
        if(EmptyUtils.isEmpty(parameter)){
            parameter=new AshopriceParameter();
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
        int count=ashopPriceDao.AshoppriceCount(parameter);
        List<Ashopprice> list=ashopPriceDao.queryAshoppriceList(parameter);
        AshopPricePage page=new AshopPricePage();
        page.setOrderBy(parameter.getOrderBy());
        page.setOrderType(parameter.getOrderType());
        page.setTotalCount(count);
        page.setAshoppriceList(list);
        page.setPageSize(parameter.getPageSize());
        page.setCurPage(parameter.getCurPage());
        page.setTotalPageCount((count/page.getPageSize())+(count%page.getPageSize()==0?0:1));
        return page;
    }

    @Override
    public int AshoppriceCount(AshopriceParameter parameter) {
        if(EmptyUtils.isNotEmpty(parameter.getBoothNumber())){
            parameter.setBoothNumber("%"+parameter.getBoothNumber()+"%");
        }
        return ashopPriceDao.AshoppriceCount(parameter);
    }
}
