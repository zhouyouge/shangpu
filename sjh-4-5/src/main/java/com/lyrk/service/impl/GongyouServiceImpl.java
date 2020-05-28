package com.lyrk.service.impl;

import com.lyrk.dao.GongyouDao;
import com.lyrk.entity.*;
import com.lyrk.service.GongyouService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("GongyouService")
public class GongyouServiceImpl implements GongyouService {

    @Resource
    private GongyouDao gongyouDao;
    @Override
    public List<Breakout> getBreakout(Gongyou gongyou) {
        System.out.println("公有getbreakout  。。。。。。。");
        return gongyouDao.getBreakout( gongyou);
    }

    @Override
    public List<Tower_informationexpression> getTowner(Gongyou gongyou) {
        System.out.println("公有getTowner  。。。。。。。");
        return gongyouDao.getTowner(gongyou);
    }

    @Override
    public List<FloorInformation> getFloor(Gongyou gongyou) {
        System.out.println("公有getTowner  。。。。。。。");
        return gongyouDao.getFloor(gongyou);
    }
}
