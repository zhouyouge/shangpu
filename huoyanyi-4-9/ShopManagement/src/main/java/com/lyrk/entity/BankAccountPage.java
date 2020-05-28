package com.lyrk.entity;

import java.util.List;

public class BankAccountPage extends Page {

    private List<BankAccount> BankAccountList;


    public List<BankAccount> getBankAccountList() {
        return BankAccountList;
    }

    public void setBankAccountList(List<BankAccount> bankAccountList) {
        BankAccountList = bankAccountList;
    }
}
