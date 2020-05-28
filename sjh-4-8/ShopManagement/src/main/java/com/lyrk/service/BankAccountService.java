package com.lyrk.service;

import com.lyrk.entity.*;

public interface BankAccountService {

    /**
     * 新增楼栋
     */
    ResponseResult addBankAccount(BankAccount bank);
    /**
     * 修改前查询楼栋信息
     */
    ResponseResult toUpdateBankAccountOut(BankAccount bank);
    /**
     * 修改楼栋信息
     */
    ResponseResult  updateBankAccountOut(BankAccount bank);
    /**
     * 删除
     */
    ResponseResult  deleteBankAccount(BankAccount bank);
    /**
     * 全查
     */
    BankAccountPage queryBankAccountList(BankAccountParameter parameter);
    /**
     * 全查的数据总条数
     */
     int  BankAccountCount(BankAccountParameter parameter);
}
