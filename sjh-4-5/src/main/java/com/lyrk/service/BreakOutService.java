package com.lyrk.service;


import com.lyrk.entity.*;


public interface BreakOutService {


    /*ResponseResult addBreak(Breakout Breakout);*/
    boolean addBreak(Test Breakout);


    BreakPage queryBreakOutList(BreakParameter paramter);

/*    ResponseResult toUpdateBreakOut(Breakout breakout);*/
Test toUpdateBreakOut(Test breakout);

    ResponseResult  updateBreakOut(Breakout breakout);

    ResponseResult deleteBreakOut(Breakout breakout);
}
