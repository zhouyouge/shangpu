package com.lyrk.service;


import com.lyrk.entity.*;


public interface BreakOutService {


    /*ResponseResult addBreak(Breakout Breakout);*/
    boolean addBreak(Test Breakout);


    BreakPage queryBreakOutList(BreakParameter paramter);

/*    ResponseResult toUpdateBreakOut(Breakout breakout);*/
ResponseResult toUpdateBreakOut(Breakout breakout);

    ResponseResult  updateBreakOut(Breakout breakout);

    ResponseResult deleteBreakOut(Breakout breakout);

    int  towerCount(BreakParameter parameter);
    /**
     * 删除分场前查询
     * @return
     */
    ResponseResult  getBreakOut(Breakout breakout);
}
