package com.lyrk.entity;

import java.util.Date;

public class HouseWhereParameter extends  Page {

    private int goHourseId ;
    private Date startTime;
    private Date outTime;
    private String hourseGoDown;

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

    public String getHourseGoDown() {
        return hourseGoDown;
    }

    public void setHourseGoDown(String hourseGoDown) {
        this.hourseGoDown = hourseGoDown;
    }

    public int getGoHourseId() {
        return goHourseId;
    }

    public void setGoHourseId(int goHourseId) {
        this.goHourseId = goHourseId;
    }
}
