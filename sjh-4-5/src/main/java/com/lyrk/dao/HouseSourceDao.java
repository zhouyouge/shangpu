package com.lyrk.dao;

import com.lyrk.entity.HouseSourceParameter;
import com.lyrk.entity.Housingsource;
import com.lyrk.entity.TowerParameter;
import com.lyrk.entity.Tower_informationexpression;

import java.util.List;

public interface HouseSourceDao {

    /**
     * 新增楼栋
     */
    int addHouseSource(Housingsource house);
    /**
     * 修改前查询楼栋信息
     */
    Housingsource toUpdateHouseSourceOut(Housingsource house);
    /**
     * 修改楼栋信息
     */
    int  updateHouseSourceOut(Housingsource house);
    /**
     * 删除
     */
    int  deleteHouseSource(Housingsource house);
    /**
     * 全查
     */
    List<Housingsource> queryHouseSourceList(HouseSourceParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  HouseSourceCount(HouseSourceParameter parameter);

}
