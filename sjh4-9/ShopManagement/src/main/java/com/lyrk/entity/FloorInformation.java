package com.lyrk.entity;

import java.io.Serializable;
import java.util.Date;

public class FloorInformation  implements Serializable {

    private String breakoutName;
    private String towerName;
    private String floorName;
    private Integer floorCoding;
    private double coveredArea;
    private double operatingArea;
    private Integer floorStatus;
    private String PropertyType;
    private String commnet;
    private String floorImage;
    private Integer floor_BreakoutStatus;
    private Date floor_createtime;
    private Date floor_updatetime;

    public FloorInformation() {
    }

    public FloorInformation(String breakoutName, String towerName, String floorName, Integer floorCoding, double coveredArea, double operatingArea, Integer floorStatus, String propertyType, String commnet, String floorImage, Integer floor_BreakoutStatus, Date floor_createtime, Date floor_updatetime) {
        this.breakoutName = breakoutName;
        this.towerName = towerName;
        this.floorName = floorName;
        this.floorCoding = floorCoding;
        this.coveredArea = coveredArea;
        this.operatingArea = operatingArea;
        this.floorStatus = floorStatus;
        PropertyType = propertyType;
        this.commnet = commnet;
        this.floorImage = floorImage;
        this.floor_BreakoutStatus = floor_BreakoutStatus;
        this.floor_createtime = floor_createtime;
        this.floor_updatetime = floor_updatetime;
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

    public Integer getFloorCoding() {
        return floorCoding;
    }

    public void setFloorCoding(Integer floorCoding) {
        this.floorCoding = floorCoding;
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

    public Integer getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(Integer floorStatus) {
        this.floorStatus = floorStatus;
    }

    public String getPropertyType() {
        return PropertyType;
    }

    public void setPropertyType(String propertyType) {
        PropertyType = propertyType;
    }

    public String getCommnet() {
        return commnet;
    }

    public void setCommnet(String commnet) {
        this.commnet = commnet;
    }

    public String getFloorImage() {
        return floorImage;
    }

    public void setFloorImage(String floorImage) {
        this.floorImage = floorImage;
    }

    public Integer getFloor_BreakoutStatus() {
        return floor_BreakoutStatus;
    }

    public void setFloor_BreakoutStatus(Integer floor_BreakoutStatus) {
        this.floor_BreakoutStatus = floor_BreakoutStatus;
    }

    public Date getFloor_createtime() {
        return floor_createtime;
    }

    public void setFloor_createtime(Date floor_createtime) {
        this.floor_createtime = floor_createtime;
    }

    public Date getFloor_updatetime() {
        return floor_updatetime;
    }

    public void setFloor_updatetime(Date floor_updatetime) {
        this.floor_updatetime = floor_updatetime;
    }
}
