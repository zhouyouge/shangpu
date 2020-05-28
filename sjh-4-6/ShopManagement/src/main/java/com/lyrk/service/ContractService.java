package com.lyrk.service;

import com.lyrk.entity.ContractPage;
import com.lyrk.entity.ContractParameter;
import com.lyrk.entity.ResponseResult;
import com.lyrk.entity.Townercontract;

public interface ContractService {
    /**
     * 新增楼栋
     */
    boolean addContract(Townercontract town);
    /**
     * 修改前查询楼栋信息
     */
    ResponseResult toUpdateContractOut(Townercontract town);
    /**
     * 修改楼栋信息
     */
    ResponseResult  updateContractOut(Townercontract town);
    /**
     * 删除
     */
    ResponseResult  deleteContract(Townercontract town);
    /**
     * 全查
     */
    ContractPage queryContractList(ContractParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  ContractCount(ContractParameter parameter);
}
