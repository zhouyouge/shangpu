package com.lyrk.entity;

import java.util.Date;

public class TowerParameter extends Page {

    private String towerName;
    private Date tower_createtime;
    private Date tower_updatetime;

    public Date getTower_createtime() {
        return tower_createtime;
    }

    public void setTower_createtime(Date tower_createtime) {
        this.tower_createtime = tower_createtime;
    }

    public Date getTower_updatetime() {
        return tower_updatetime;
    }

    public void setTower_updatetime(Date tower_updatetime) {
        this.tower_updatetime = tower_updatetime;
    }


    public String getTowerName(){
        return towerName;
    }

    public void setTowerName(String towerName){
        this.towerName = towerName;
    }
}
