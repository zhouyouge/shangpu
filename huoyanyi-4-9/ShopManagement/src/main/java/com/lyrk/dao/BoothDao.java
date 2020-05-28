package com.lyrk.dao;

import com.lyrk.entity.BoothParameter;
import com.lyrk.entity.Boothinformation;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("BoothDao")
public interface BoothDao {


    /**
     * 新增摊位
     */
    int addBooth(Boothinformation booth);
    /**
     * 修改前查询摊位信息
     */
    Boothinformation toUpdateBoothOut(Boothinformation booth);
    /**
     * 修改摊位信息
     */
    int  updateBoothOut(Boothinformation booth);
    /**
     * 删除
     */
    int  deleteBooth(Boothinformation booth);
    /**
            * 全查
     */
    List<Boothinformation> queryBoothList(BoothParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  BoothCount(BoothParameter parameter);
}
