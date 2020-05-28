package com.lyrk.entity;

import java.util.Date;
import java.util.Objects;

public class Boothinformation {
    private String breakoutName;
    private String towerName;
    private String floorName;
    private String boothNumber;
    private String boothCoding;
    private String planningForms;
    private double coveredArea;
    private double operatingArea;
    private String comment;
    private int boothBreakoutStatus;
    private int boothStatus;
    private Date booth_createtime;
    private Date booth_updatetime;

    public int getBoothStatus() {
        return boothStatus;
    }

    public void setBoothStatus(int boothStatus) {
        this.boothStatus = boothStatus;
    }

    public Date getBooth_createtime() {
        return booth_createtime;
    }

    public void setBooth_createtime(Date booth_createtime) {
        this.booth_createtime = booth_createtime;
    }

    public Date getBooth_updatetime() {
        return booth_updatetime;
    }

    public void setBooth_updatetime(Date booth_updatetime) {
        this.booth_updatetime = booth_updatetime;
    }

    public String getBreakoutName() {
        return breakoutName;
    }
    public void setBreakoutName(String breakoutName) {
        this.breakoutName = breakoutName;
    }
    public String getTowerName() {
        return towerName;
    }
    public void setTowerName(String towerName) {
        this.towerName = towerName;
    }
    public String getFloorName() {
        return floorName;
    }
    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }
    public String getBoothNumber() {
        return boothNumber;
    }
    public void setBoothNumber(String boothNumber) {
        this.boothNumber = boothNumber;
    }
    public String getBoothCoding() {
        return boothCoding;
    }
    public void setBoothCoding(String boothCoding) {
        this.boothCoding = boothCoding;
    }
    public String getPlanningForms() {
        return planningForms;
    }
    public void setPlanningForms(String planningForms) {
        this.planningForms = planningForms;
    }
    public double getCoveredArea() {
        return coveredArea;
    }
    public void setCoveredArea(double coveredArea) {
        this.coveredArea = coveredArea;
    }
    public double getOperatingArea() {
        return operatingArea;
    }
    public void setOperatingArea(double operatingArea) {
        this.operatingArea = operatingArea;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public int getBoothBreakoutStatus() {
        return boothBreakoutStatus;
    }
    public void setBoothBreakoutStatus(int boothBreakoutStatus) {
        this.boothBreakoutStatus = boothBreakoutStatus;
    }
}
