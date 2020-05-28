package com.lyrk.entity;

import java.util.List;

public class FloorPage extends Page {
private List<FloorInformation>  floorInformationList;

    public List<FloorInformation> getFloorInformationList() {
        return floorInformationList;
    }

    public void setFloorInformationList(List<FloorInformation> floorInformationList) {
        this.floorInformationList = floorInformationList;
    }
}
