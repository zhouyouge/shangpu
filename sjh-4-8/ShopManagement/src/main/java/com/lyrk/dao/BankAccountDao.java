package com.lyrk.dao;

import com.lyrk.entity.BankAccount;
import com.lyrk.entity.BankAccountParameter;


import java.util.List;

public interface BankAccountDao {

    /**
     * 新增楼栋
     */
    int addBankAccount(BankAccount bank);
    /**
     * 修改前查询楼栋信息
     */
    BankAccount toUpdateBankAccountOut(BankAccount bank);
    /**
     * 修改楼栋信息
     */
    int  updateBankAccountOut(BankAccount bank);
    /**
     * 删除
     */
    int  deleteBankAccount(BankAccount bank);
    /**
     * 全查
     */
    List<BankAccount> queryBankAccountList(BankAccountParameter parameter);

    /**
     * 全查的数据总条数
     */
    int  BankAccountCount(BankAccountParameter parameter);

}
