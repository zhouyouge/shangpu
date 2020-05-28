package com.lyrk.entity;

import java.util.Date;

public class HouseSourceParameter extends  Page {

    private Integer houseId;
    private String hoseSource;
    private Date startTime;
    private Date outTime;

    public String getHoseSource() {
        return hoseSource;
    }

    public void setHoseSource(String hoseSource) {
        this.hoseSource = hoseSource;
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

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }
}
