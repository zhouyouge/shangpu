package com.lyrk.entity;

import java.util.Date;

public class BrandinformationParameter extends Page {
    private Integer brandId;
    private String brandCoding;
    private Date startTime;
    private Date outTime;

    public String getBrandCoding() {
        return brandCoding;
    }

    public void setBrandCoding(String brandCoding) {
        this.brandCoding = brandCoding;
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

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
}
