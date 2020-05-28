package com.lyrk.dao;

import com.lyrk.entity.ContractParameter;
import com.lyrk.entity.Townercontract;

import java.util.List;

public interface ContractDao {

    /**
     * 新增楼栋
     */
    int addContract(Townercontract town);
    /**
     * 修改前查询楼栋信息
     */
    Townercontract toUpdateContractOut(Townercontract town);
    /**
     * 修改楼栋信息
     */
    int  updateContractOut(Townercontract town);
    /**
     * 删除
     */
    int  deleteContract(Townercontract town);
    /**
     * 全查
     */
    List<Townercontract> queryTowerList(ContractParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  ContractCount(ContractParameter parameter);
}
