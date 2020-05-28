package com.lyrk.entity;

import java.util.Date;

public class BillParameter extends Page {

    private Integer billId;
    private Date bill_createtime;
    private Date bill_updatetime;
    private String billingName;

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

    public String getBillingName() {
        return billingName;
    }

    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }
}
