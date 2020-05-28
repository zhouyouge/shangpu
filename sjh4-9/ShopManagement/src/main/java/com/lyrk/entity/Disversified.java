package com.lyrk.entity;

import java.io.Serializable;
import java.util.Date;

public class Disversified implements Serializable {
    private Integer boothId;

    private String breakoutName;
    private String floorName;
    private String towerName;
    private String diversifiedName;
    private String diversifiedStatus;
    private double coveredArea;
    private String diversifiedType;
    private String outdoors;
    private String standardRent;
    private String commnet;
    private String diversifiedCoding;
    private String diversified;
    private Date diversified_createtime;
    private Date diversified_updatetime;

    public Date getDiversified_createtime() {
        return diversified_createtime;
    }

    public void setDiversified_createtime(Date diversified_createtime) {
        this.diversified_createtime = diversified_createtime;
    }

    public Date getDiversified_updatetime() {
        return diversified_updatetime;
    }

    public void setDiversified_updatetime(Date diversified_updatetime) {
        this.diversified_updatetime = diversified_updatetime;
    }

    public String getDiversified() {
        return diversified;
    }

    public void setDiversified(String diversified) {
        this.diversified = diversified;
    }

    public String getDiversifiedCoding() {
        return diversifiedCoding;
    }

    public void setDiversifiedCoding(String diversifiedCoding) {
        this.diversifiedCoding = diversifiedCoding;
    }

    public Integer getBoothId() {
        return boothId;
    }

    public void setBoothId(Integer boothId) {
        this.boothId = boothId;
    }


    public String getBreakoutName() {
        return breakoutName;
    }

    public void setBreakoutName(String breakoutName) {
        this.breakoutName = breakoutName;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public String getTowerName() {
        return towerName;
    }

    public void setTowerName(String towerName) {
        this.towerName = towerName;
    }

    public String getDiversifiedName() {
        return diversifiedName;
    }

    public void setDiversifiedName(String diversifiedName) {
        this.diversifiedName = diversifiedName;
    }

    public String getDiversifiedStatus() {
        return diversifiedStatus;
    }

    public void setDiversifiedStatus(String diversifiedStatus) {
        this.diversifiedStatus = diversifiedStatus;
    }

    public double getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(double coveredArea) {
        this.coveredArea = coveredArea;
    }

    public String getDiversifiedType() {
        return diversifiedType;
    }

    public void setDiversifiedType(String diversifiedType) {
        this.diversifiedType = diversifiedType;
    }

    public String getOutdoors() {
        return outdoors;
    }

    public void setOutdoors(String outdoors) {
        this.outdoors = outdoors;
    }

    public String getStandardRent() {
        return standardRent;
    }

    public void setStandardRent(String standardRent) {
        this.standardRent = standardRent;
    }

    public String getCommnet() {
        return commnet;
    }

    public void setCommnet(String commnet) {
        this.commnet = commnet;
    }
}
