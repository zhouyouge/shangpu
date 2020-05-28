package com.lyrk.service;

import com.lyrk.entity.*;

public interface HouseSourceService {

    /**
     * 新增楼栋
     */
    ResponseResult addHouseSource(Housingsource house);
    /**
     * 修改前查询楼栋信息
     */
    ResponseResult toUpdateHouseSourceOut(Housingsource house);
    /**
     * 修改楼栋信息
     */
    ResponseResult  updateHouseSourceOut(Housingsource house);
    /**
     * 删除
     */
    ResponseResult  deleteHouseSource(Housingsource house);
    /**
     * 全查
     */
   HouseSourcePage queryHouseSourceList(HouseSourceParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  HouseSourceCount(HouseSourceParameter parameter);
}
