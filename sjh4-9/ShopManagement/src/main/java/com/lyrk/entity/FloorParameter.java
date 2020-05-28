package com.lyrk.entity;

import java.util.Date;

public class FloorParameter extends Page {

    private String floorName;

    private Date floor_createtime;
    private Date floor_updatetime;

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

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }
}
