package com.lyrk.service;

import com.lyrk.entity.*;

public interface HouseWhereService {

    /**
     * 新增楼栋
     */
    ResponseResult addHouseWhere(Housinggodown house);
    /**
     * 修改前查询楼栋信息
     */
    ResponseResult toUpdateHouseWhereOut(Housinggodown house);
    /**
     * 修改楼栋信息
     */
    ResponseResult  updateHouseWhereOut(Housinggodown house);
    /**
     * 删除
     */
    ResponseResult  deleteHouseWhere(Housinggodown house);
    /**
     * 全查
     */
    HouseWherePage queryHouseWhereList(HouseWhereParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  HouseWhereCount(HouseWhereParameter parameter);

}
