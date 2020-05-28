package com.lyrk.entity;

import java.util.Date;

public class AshopriceParameter extends Page {

    private String boothNumber;
    private Date ashop_createtime;
    private  Date  ashop_updatetime;

    public Date getAshop_createtime() {
        return ashop_createtime;
    }

    public void setAshop_createtime(Date ashop_createtime) {
        this.ashop_createtime = ashop_createtime;
    }

    public Date getAshop_updatetime() {
        return ashop_updatetime;
    }

    public void setAshop_updatetime(Date ashop_updatetime) {
        this.ashop_updatetime = ashop_updatetime;
    }

    public String getBoothNumber() {
        return boothNumber;
    }

    public void setBoothNumber(String boothNumber) {
        this.boothNumber = boothNumber;
    }
}
