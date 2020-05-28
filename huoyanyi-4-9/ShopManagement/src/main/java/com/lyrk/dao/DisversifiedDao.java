package com.lyrk.dao;


import com.lyrk.entity.Ashopprice;
import com.lyrk.entity.AshopriceParameter;
import com.lyrk.entity.Disversified;
import com.lyrk.entity.DisversifiedParameter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("DisversifiedDao")
public interface DisversifiedDao {

    /**
     * 新增多经信息
     */
    int addDisversified(Disversified disversified);
    /**
     * 修改前查询多经信息
     */
    Disversified toUpdateDisversfied(Disversified disversified);
    /**
     * 修改多经信息
     */
    int  updateDisversified(Disversified disversified);
    /**
     * 删除多经信息
     */
    int  deleteDisversified(Disversified disversified);
    /**
     * 全查多经信息
     */
    List<Disversified> queryDisversfiedList(DisversifiedParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  disversifedCount(DisversifiedParameter parameter);
}
