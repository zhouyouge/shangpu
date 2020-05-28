package com.lyrk.entity;

import java.util.Date;

public class BreakParameter extends Page {
    private  String breakoutName ;
    private Date br_createtime;
    private Date br_updatetime;

    public Date getBr_createtime() {
        return br_createtime;
    }

    public void setBr_createtime(Date br_createtime) {
        this.br_createtime = br_createtime;
    }
    public Date getBr_updatetime() {
        return br_updatetime;
    }
    public void setBr_updatetime(Date br_updatetime) {
        this.br_updatetime = br_updatetime;
    }
    public String getBreakoutName() {
        return breakoutName;
    }

    public void setBreakoutName(String breakoutName) {
        this.breakoutName = breakoutName;
    }
}
