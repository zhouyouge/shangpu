package com.lyrk.entity;

import java.util.Date;

public class TenementParameter extends Page {

    private String tenantName;
    private Date tentment_createtime;
    private Date tentment_updatetime;

    public Date getTentment_createtime() {
        return tentment_createtime;
    }

    public void setTentment_createtime(Date tentment_createtime) {
        this.tentment_createtime = tentment_createtime;
    }

    public Date getTentment_updatetime() {
        return tentment_updatetime;
    }

    public void setTentment_updatetime(Date tentment_updatetime) {
        this.tentment_updatetime = tentment_updatetime;
    }


    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }
}
