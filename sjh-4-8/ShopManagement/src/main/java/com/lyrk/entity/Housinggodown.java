package com.lyrk.entity;

import java.io.Serializable;
import java.util.Date;

public class Housinggodown implements Serializable {

    private Integer goHourseId;
    private String hourseGoDown;
    private String townerName;
    private String purchaserName;
    private Date startTime;
    private Date outTime;
    private Integer tenementId;


    public Integer getGoHourseId() {
        return goHourseId;
    }

    public void setGoHourseId(Integer goHourseId) {
        this.goHourseId = goHourseId;
    }

    public String getHourseGoDown() {
        return hourseGoDown;
    }

    public void setHourseGoDown(String hourseGoDown) {
        this.hourseGoDown = hourseGoDown;
    }

    public String getTownerName() {
        return townerName;
    }

    public void setTownerName(String townerName) {
        this.townerName = townerName;
    }

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
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

    public Integer getTenementId() {
        return tenementId;
    }

    public void setTenementId(Integer tenementId) {
        this.tenementId = tenementId;
    }
}
