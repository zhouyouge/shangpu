package com.lyrk.service.impl;

import com.lyrk.dao.YusuanDao;
import com.lyrk.entity.ResponseResult;
import com.lyrk.entity.Yusuan;
import com.lyrk.service.YusuanService;
import com.lyrk.util.EmptyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service("YusuanService")
public class YusuanServiceImpl implements YusuanService {
    @Resource
    private YusuanDao yusuanDao;
    @Override
    public ResponseResult Yusuan1(Yusuan yusuan) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(yusuan)){
            boolean flag2=EmptyUtils.isNotEmpty(yusuan.getErYue());
            boolean flag3=EmptyUtils.isNotEmpty(yusuan.getSanYue());
            boolean flag4=EmptyUtils.isNotEmpty(yusuan.getSiYue());
            boolean flag5=EmptyUtils.isNotEmpty(yusuan.getWuYue());
            boolean flag6=EmptyUtils.isNotEmpty(yusuan.getLiuYue());
            boolean flag7=EmptyUtils.isNotEmpty(yusuan.getNian());
            if(flag2&&flag3&&flag4&&flag5&&flag6&&flag7){
                rs.setData(yusuanDao.Yusuan1(yusuan));
                rs.setFlag(6);
                rs.setResult(true);
                return rs;
            }else if(flag2&&flag3&&flag4&&flag5&&flag7){
                yusuan.setLiuYue(null);
                rs.setData(yusuanDao.Yusuan1(yusuan));
                rs.setFlag(5);
                rs.setResult(true);
                return rs;
            }else if(flag2&&flag3&&flag4&&flag7){
                yusuan.setLiuYue(null);
                yusuan.setWuYue(null);
                rs.setData(yusuanDao.Yusuan1(yusuan));
                rs.setFlag(4);
                rs.setResult(true);
                return rs;
            }else if(flag2&&flag3&&flag7){
                yusuan.setLiuYue(null);
                yusuan.setWuYue(null);
                yusuan.setSiYue(null);
                rs.setData(yusuanDao.Yusuan1(yusuan));
                rs.setFlag(3);
                rs.setResult(true);
                return rs;
            }else if(flag2&&flag7){
                yusuan.setLiuYue(null);
                yusuan.setWuYue(null);
                yusuan.setSiYue(null);
                yusuan.setSanYue(null);
                rs.setData(yusuanDao.Yusuan1(yusuan));
                rs.setFlag(2);
                rs.setResult(true);
                return rs;
            }else if(flag7){
                yusuan.setLiuYue(null);
                yusuan.setWuYue(null);
                yusuan.setSiYue(null);
                yusuan.setSanYue(null);
                yusuan.setErYue(null);
                rs.setData(yusuanDao.Yusuan1(yusuan));
                rs.setFlag(1);
                rs.setResult(true);
                return rs;
            }else{
                rs.setData(new ArrayList<Yusuan>());
                rs.setFlag(0);
                rs.setResult(false);
                return rs;
            }
        }else{
            rs.setData(new ArrayList<Yusuan>());
            rs.setFlag(1);
            rs.setResult(false);
            return rs;
        }
    }
    @Override
    public ResponseResult Yusuan2(Yusuan yusuan) {
        ResponseResult rs=new ResponseResult();
        if(EmptyUtils.isNotEmpty(yusuan.getNian())){
            yusuan.setNian(yusuan.getNian()+"-%");
        }
        if(EmptyUtils.isNotEmpty(yusuan)){
            boolean flag8=EmptyUtils.isNotEmpty(yusuan.getBaYue());
            boolean flag9=EmptyUtils.isNotEmpty(yusuan.getJiuYue());
            boolean flag10=EmptyUtils.isNotEmpty(yusuan.getShiYue());
            boolean flag11=EmptyUtils.isNotEmpty(yusuan.getShiyiYue());
            boolean flag12=EmptyUtils.isNotEmpty(yusuan.getShierYue());
            boolean flag13=EmptyUtils.isNotEmpty(yusuan.getNian());
            if(flag8&&flag9&&flag10&&flag11&&flag12&&flag13){
                rs.setData(yusuanDao.Yusuan2(yusuan));
                rs.setFlag(12);
                rs.setResult(true);
                return rs;
            }else if(flag8&&flag9&&flag10&&flag11&&flag13){
                yusuan.setLiuYue(null);
                rs.setData(yusuanDao.Yusuan2(yusuan));
                rs.setFlag(11);
                rs.setResult(true);
                return rs;
            }else if(flag8&&flag9&&flag10&&flag13){
                yusuan.setLiuYue(null);
                yusuan.setWuYue(null);
                rs.setData(yusuanDao.Yusuan2(yusuan));
                rs.setFlag(10);
                rs.setResult(true);
                return rs;
            }else if(flag8&&flag9&&flag13){
                yusuan.setLiuYue(null);
                yusuan.setWuYue(null);
                yusuan.setSiYue(null);
                rs.setData(yusuanDao.Yusuan2(yusuan));
                rs.setFlag(9);
                rs.setResult(true);
                return rs;
            }else if(flag8&&flag13){
                yusuan.setLiuYue(null);
                yusuan.setWuYue(null);
                yusuan.setSiYue(null);
                yusuan.setSanYue(null);
                rs.setData(yusuanDao.Yusuan2(yusuan));
                rs.setFlag(8);
                rs.setResult(true);
                return rs;
            }else if(flag13){
                yusuan.setLiuYue(null);
                yusuan.setWuYue(null);
                yusuan.setSiYue(null);
                yusuan.setSanYue(null);
                yusuan.setErYue(null);
                rs.setData(yusuanDao.Yusuan2(yusuan));
                rs.setFlag(7);
                rs.setResult(true);
                return rs;
            }else{
                rs.setData(new ArrayList<Yusuan>());
                rs.setFlag(0);
                rs.setResult(false);
                return rs;
            }
        }else{
            rs.setData(new ArrayList<Yusuan>());
            rs.setFlag(7);
            rs.setResult(false);
            return rs;
        }
    }
}
