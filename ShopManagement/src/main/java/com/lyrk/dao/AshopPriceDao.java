package com.lyrk.dao;

import com.lyrk.entity.Ashopprice;
import com.lyrk.entity.AshopriceParameter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AshopPriceDao")
public interface AshopPriceDao {

    /**
     * 新增一铺一价信息
     */
     int addAshopprice(Ashopprice ashopprice);
    /**
     * 修改前查询一铺一价信息
     */
    Ashopprice toUpdateAshopprice(Ashopprice ashopprice);
    /**
     * 修改一铺一价信息信息
     */
    int  updateAshopprice(Ashopprice ashopprice);
    /**
     * 删除一铺一价信息
     */
    int  deleteAshopprice(Ashopprice ashopprice);
    /**
     * 全查一铺一价信息
     */
    List<Ashopprice> queryAshoppriceList(AshopriceParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  AshoppriceCount(AshopriceParameter parameter);
    /**
     * 批量
     */
    int addAshopprice1(Ashopprice ashopprices);
    List<Ashopprice> getAshopirceList();
}
