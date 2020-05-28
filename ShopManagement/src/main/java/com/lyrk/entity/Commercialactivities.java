package com.lyrk.entity;

import java.io.Serializable;
import java.util.Date;


public class Commercialactivities  implements Serializable {
    private int commercialId;
    private String commercialName;
    private Date cc_createDate;
    private Date cc_modificationDate;
    private String commercialStatus;

    public String getCommercialStatus() {
        return commercialStatus;
    }

    public void setCommercialStatus(String commercialStatus) {
        this.commercialStatus = commercialStatus;
    }

    public int getCommercialId() {
        return commercialId;
    }

    public void setCommercialId(int commercialId) {
        this.commercialId = commercialId;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    public Date getCc_createDate() {
        return cc_createDate;
    }

    public void setCc_createDate(Date cc_createDate) {
        this.cc_createDate = cc_createDate;
    }

    public Date getCc_modificationDate() {
        return cc_modificationDate;
    }

    public void setCc_modificationDate(Date cc_modificationDate) {
        this.cc_modificationDate = cc_modificationDate;
    }
}