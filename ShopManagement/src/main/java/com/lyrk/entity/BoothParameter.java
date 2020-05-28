package com.lyrk.entity;

import java.util.Date;

public class BoothParameter extends Page {

    private String boothNumber;
    private Date booth_createtime;
    private Date booth_updatetime;

    public Date getBooth_createtime() {
        return booth_createtime;
    }

    public void setBooth_createtime(Date booth_createtime) {
        this.booth_createtime = booth_createtime;
    }

    public Date getBooth_updatetime() {
        return booth_updatetime;
    }

    public void setBooth_updatetime(Date booth_updatetime) {
        this.booth_updatetime = booth_updatetime;
    }
    public String getBoothNumber() {
        return boothNumber;
    }

    public void setBoothNumber(String boothNumber) {
        this.boothNumber = boothNumber;
    }
}
