package com.lyrk.dao;

import com.lyrk.entity.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("GongyouDao")
public interface GongyouDao {
    /**
     * 查询分场信息列表
     * @return
     */
    List<Breakout> getBreakout(Gongyou gongyou);
    /**
     * 根据分场信息查询楼栋
     */
    List<Tower_informationexpression> getTowner(Gongyou gongyou);

    /**
     * 根据楼栋查楼层
     */
    List<FloorInformation> getFloor(Gongyou gongyou);

}
