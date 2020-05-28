package com.lyrk.service;

import com.lyrk.entity.Disversified;
import com.lyrk.entity.DisversifiedPage;
import com.lyrk.entity.DisversifiedParameter;
import com.lyrk.entity.ResponseResult;

public interface DisversifiedService {

    /**
     * 新增多经信息
     */
    ResponseResult addDisversified(Disversified disversified);
    /**
     * 修改前查询多经信息
     */
    ResponseResult toUpdateDisversfied(Disversified disversified);
    /**
     * 修改多经信息
     */
    ResponseResult  updateDisversified(Disversified disversified);
    /**
     * 删除多经信息
     */
    ResponseResult  deleteDisversified(Disversified disversified);
    /**
     * 全查多经信息
     */
    DisversifiedPage queryDisversfiedList(DisversifiedParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  disversifedCount(DisversifiedParameter parameter);
}
