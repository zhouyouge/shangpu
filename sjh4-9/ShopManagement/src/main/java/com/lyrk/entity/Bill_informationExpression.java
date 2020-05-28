package com.lyrk.entity;

import java.io.Serializable;
import java.util.Date;

public class Bill_informationExpression implements Serializable {
    private Integer billId;
    private String billingName;
    private String ratepayerNumber;
    private String billAddress;
    private String billPhone;
    private String bankName;
    private String billAccount;
    private double rent_taxRate;
    private String breakoutName;
    private Date bill_createtime;
    private Date bill_updatetime;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getBillingName() {
        return billingName;
    }

    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }

    public String getRatepayerNumber() {
        return ratepayerNumber;
    }

    public void setRatepayerNumber(String ratepayerNumber) {
        this.ratepayerNumber = ratepayerNumber;
    }

    public String getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress;
    }

    public String getBillPhone() {
        return billPhone;
    }

    public void setBillPhone(String billPhone) {
        this.billPhone = billPhone;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBillAccount() {
        return billAccount;
    }

    public void setBillAccount(String billAccount) {
        this.billAccount = billAccount;
    }

    public double getRent_taxRate() {
        return rent_taxRate;
    }

    public void setRent_taxRate(double rent_taxRate) {
        this.rent_taxRate = rent_taxRate;
    }

    public String getBreakoutName() {
        return breakoutName;
    }

    public void setBreakoutName(String breakoutName) {
        this.breakoutName = breakoutName;
    }

    public Date getBill_createtime() {
        return bill_createtime;
    }

    public void setBill_createtime(Date bill_createtime) {
        this.bill_createtime = bill_createtime;
    }

    public Date getBill_updatetime() {
        return bill_updatetime;
    }

    public void setBill_updatetime(Date bill_updatetime) {
        this.bill_updatetime = bill_updatetime;
    }
}
