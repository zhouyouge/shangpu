package com.lyrk.entity;

import java.util.List;

public class BankAccountPage extends Page {

    private List<BankAccount> bankAccountList;

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }
}
