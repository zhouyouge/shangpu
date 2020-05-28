package com.lyrk.service;

import com.lyrk.entity.*;

import java.util.List;

public interface AshopriceService {
    /**
     * 新增一铺一价信息
     */
    ResponseResult addAshopprice(Ashopprice ashopprice);
    /**
     * 修改前查询一铺一价信息
     */
    ResponseResult toUpdateAshopprice(Ashopprice ashopprice);
    /**
     * 修改一铺一价信息信息
     */
    ResponseResult  updateAshopprice(Ashopprice ashopprice);
    /**
     * 删除一铺一价信息
     */
    ResponseResult  deleteAshopprice(Ashopprice ashopprice);
    /**
     * 全查一铺一价信息
     */
    AshopPricePage queryAshoppriceList(AshopriceParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  AshoppriceCount(AshopriceParameter parameter);
    /**
     * 批量
     */
    boolean addAshopprice1(Ashopprice ashopprices);
    List<Ashopprice> getAshopirceList();

}
