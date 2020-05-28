package com.lyrk.dao;

import com.lyrk.entity.TenementParameter;
import com.lyrk.entity.Tenementlnformation;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("TenementDao")
public interface TenementDao {

    /**
     * 新增楼栋
     */
     int addTenement(Tenementlnformation tenement);
    /**
     * 修改前查询楼栋信息
     */
    Tenementlnformation toUpdateTenement(Tenementlnformation tenement);
    /**
     * 修改楼栋信息
     */
    int  updateTenement(Tenementlnformation tenement);
    /**
     * 删除
     */
    int  deleteTenement(Tenementlnformation tenement);
    /**
     * 全查
     */
    List<Tenementlnformation> queryTenementList(TenementParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  TenementCount(TenementParameter parameter);
}
