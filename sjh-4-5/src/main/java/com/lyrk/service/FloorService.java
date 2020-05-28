package com.lyrk.service;

import com.lyrk.entity.*;

public interface FloorService {

    /**
     * 新增楼栋
     */
    ResponseResult addFloor(FloorInformation floor);
    /**
     * 修改前查询楼栋信息
     */
    ResponseResult toUpdateFloor(FloorInformation floor);
    /**
     * 修改楼栋信息
     */
    ResponseResult  updateFloor(FloorInformation floor);
    /**
     * 删除
     */
    ResponseResult  deleteFloor(FloorInformation floor);
    /**
     * 全查
     */
    FloorPage queryFloorList(FloorParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  FloorCount(FloorParameter parameter);
}
