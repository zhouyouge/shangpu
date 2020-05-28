package com.lyrk.service;

import com.lyrk.entity.*;

public interface BoothService {

    /**
     * 新增摊位
     * @param
     * @return
     */
    ResponseResult addBooth(Boothinformation booth);
    /**
     * 修改前查询楼栋信息
     */
    ResponseResult toUpdateBoothOut(Boothinformation booth);
    /**
     * 修改楼栋信息
     */
    ResponseResult  updateBoothOut(Boothinformation booth);
    /**
     * 删除
     */
    ResponseResult  deleteBooth(Boothinformation booth);
    /**
     * 全查
     */
    BoothPage queryBoothList(BoothParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  BoothCount(BoothParameter parameter);
}
