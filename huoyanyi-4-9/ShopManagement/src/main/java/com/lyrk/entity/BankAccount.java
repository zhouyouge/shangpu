package com.lyrk.entity;

import java.util.Date;

public class BankAccount {


    private  Integer bankId;	                 //int	10	主键id
    private String bankName  ;          //varchar	20	开户行名称*
    private String bankaccount ;     //varchar	20	开户账号*
    private String bankrownum;        //varchar	20	开户行号*
    private String bankName2;          //varchar	20	开户行名称*
    private String bankaccount2;        //varchar	20	开户账号*
    private String bankrownum2;        //varchar	20	开户行号*
    private String   breakId;	                //int	10	外键
    private Date startTime;
    private Date outTime;

    public Integer getBankId() {
        return bankId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public String getBreakId() {
        return breakId;
    }

    public void setBreakId(String breakId) {
        this.breakId = breakId;
    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getBankrownum() {
        return bankrownum;
    }

    public void setBankrownum(String bankrownum) {
        this.bankrownum = bankrownum;
    }

    public String getBankName2() {
        return bankName2;
    }

    public void setBankName2(String bankName2) {
        this.bankName2 = bankName2;
    }

    public String getBankaccount2() {
        return bankaccount2;
    }

    public void setBankaccount2(String bankaccount2) {
        this.bankaccount2 = bankaccount2;
    }

    public String getBankrownum2() {
        return bankrownum2;
    }

    public void setBankrownum2(String bankrownum2) {
        this.bankrownum2 = bankrownum2;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }
}
