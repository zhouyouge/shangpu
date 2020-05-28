package com.lyrk.service;

import com.lyrk.entity.ResponseResult;
import com.lyrk.entity.TowerPage;
import com.lyrk.entity.TowerParameter;
import com.lyrk.entity.Tower_informationexpression;

import java.util.List;

public interface TowerService {

    /**
     * 新增楼栋
     */
    ResponseResult addTower(Tower_informationexpression tower);
    /**
     * 修改前查询楼栋信息
     */
    ResponseResult toUpdateTowerOut(Tower_informationexpression tower);
    /**
     * 修改楼栋信息
     */
    ResponseResult  updateTowerOut(Tower_informationexpression tower);
    /**
     * 删除
     */
    ResponseResult  deleteTower(Tower_informationexpression tower);
    /**
     * 全查
     */
    TowerPage queryTowerList(TowerParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  towerCount(TowerParameter parameter);

    /**
     * 删除楼栋信息前查询旗下是否存在楼层信息
     */
    boolean getFloor(Tower_informationexpression towner);
}
