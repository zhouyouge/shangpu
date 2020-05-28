package com.lyrk.dao;

import com.lyrk.entity.FloorInformation;
import com.lyrk.entity.FloorParameter;
import com.lyrk.entity.TowerParameter;
import com.lyrk.entity.Tower_informationexpression;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("FloorDao")
public interface FloorDao {

    /**
     * 新增楼栋
     */
     int addFloor(FloorInformation floor);
    /**
     * 修改前查询楼栋信息
     */
    FloorInformation toUpdateFloor(FloorInformation floor);
    /**
     * 修改楼栋信息
     */
    int  updateFloor(FloorInformation floor);
    /**
     * 删除
     */
    int  deleteTower(FloorInformation floor);
    /**
     * 全查
     */
    List<FloorInformation> queryFloorList(FloorParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  FloorCount(FloorParameter parameter);
}
