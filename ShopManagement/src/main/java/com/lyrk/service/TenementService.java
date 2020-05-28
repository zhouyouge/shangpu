package com.lyrk.service;

import com.lyrk.entity.*;

import java.util.List;

public interface TenementService {





    /**
     * 新增租户
     */
    ResponseResult addTenement(Tenementlnformation tenement);
    /**
     * 修改前查询租户息
     */
    ResponseResult toUpdateTenement(Tenementlnformation tenement);
    /**
     * 修改租户信息
     */
    ResponseResult  updateTenement(Tenementlnformation tenement);
    /**
     * 删除租户信息
     */
    ResponseResult  deleteTenement(Tenementlnformation tenement);
    /**
     * 全查租户信息
     */
    TenementPage queryTenementList(TenementParameter parameter);
    /**
     * 全查租户的数据总条数
     */
    int  TenementCount(TenementParameter parameter);

}
