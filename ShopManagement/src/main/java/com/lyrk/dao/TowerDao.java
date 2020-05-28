package com.lyrk.dao;

import com.lyrk.entity.TowerParameter;
import com.lyrk.entity.Tower_informationexpression;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("TowerDao")
public interface TowerDao {

    /**
     * 新增楼栋
     */
     int addTower(Tower_informationexpression tower);
    /**
     * 修改前查询楼栋信息
     */
    Tower_informationexpression toUpdateTowerOut(Tower_informationexpression tower);
    /**
     * 修改楼栋信息
     */
    int  updateTowerOut(Tower_informationexpression tower);
    /**
     * 删除
     */
    int  deleteTower(Tower_informationexpression tower);
    /**
     * 全查
     */
    List<Tower_informationexpression> queryTowerList(TowerParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  towerCount(TowerParameter parameter);

    /**
     * 删除楼栋信息前查询旗下是否存在楼层信息,查询存在信息的数量
     */
    int getFloor(Tower_informationexpression towner);
}
