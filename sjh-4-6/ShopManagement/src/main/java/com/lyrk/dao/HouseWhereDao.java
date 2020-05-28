package com.lyrk.dao;

import com.lyrk.entity.HouseWhereParameter;
import com.lyrk.entity.Housinggodown;

import java.util.List;

public interface HouseWhereDao {

        /**
         * 新增楼栋
         */
        int addHouseWhere(Housinggodown house);
        /**
         * 修改前查询楼栋信息
         */
        Housinggodown toUpdateHouseWhereOut(Housinggodown house);
        /**
         * 修改楼栋信息
         */
        int  updateHouseWhereOut(Housinggodown house);
        /**
         * 删除
         */
        int  deleteHouseWhere(Housinggodown house);
        /**
         * 全查
         */
        List<Housinggodown> queryHouseWhereList(HouseWhereParameter parameter);
        /**
         * 全查的数据总条数
         */
        int  HouseWhereCount(HouseWhereParameter parameter);
}
