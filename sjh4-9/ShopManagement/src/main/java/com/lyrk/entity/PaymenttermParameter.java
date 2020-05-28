package com.lyrk.entity;

import java.util.Date;

public class PaymenttermParameter extends  Page {

    private int getheringId ;
    private Date startTime;
    private Date outTime;
    private String gatheringName;

    public String getGatheringName() {
        return gatheringName;
    }

    public void setGatheringName(String gatheringName) {
        this.gatheringName = gatheringName;
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

    public int getGetheringId() {
        return getheringId;
    }

    public void setGetheringId(int getheringId) {
        this.getheringId = getheringId;
    }
}
