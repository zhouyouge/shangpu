package com.lyrk.entity;

import java.util.Date;

public class DisversifiedParameter extends Page {
    private String diversifiedName;
    private Date diversified_createtime;
    private Date diversified_updatetime;

    public Date getDiversified_updatetime() {
        return diversified_updatetime;
    }

    public void setDiversified_updatetime(Date diversified_updatetime) {
        this.diversified_updatetime = diversified_updatetime;
    }

    public Date getDiversified_createtime() {
        return diversified_createtime;
    }

    public void setDiversified_createtime(Date diversified_createtime) {
        this.diversified_createtime = diversified_createtime;
    }

    public String getDiversifiedName() {
        return diversifiedName;
    }

    public void setDiversifiedName(String diversifiedName) {
        this.diversifiedName = diversifiedName;
    }
}
