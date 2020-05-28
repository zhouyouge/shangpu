package com.lyrk.entity;

import java.util.Date;

public class ContractParameter extends Page{

    private int breakId;
    private String comparyTitle;
    private Date startTime;
    private Date outTime;

    public String getComparyTitle() {
        return comparyTitle;
    }

    public void setComparyTitle(String comparyTitle) {
        this.comparyTitle = comparyTitle;
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

    public int getBreakId() {
        return breakId;
    }

    public void setBreakId(int breakId) {
        this.breakId = breakId;
    }
}
