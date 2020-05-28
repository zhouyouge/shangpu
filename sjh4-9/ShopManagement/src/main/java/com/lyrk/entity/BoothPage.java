package com.lyrk.entity;

import java.util.List;

public class BoothPage extends Page {

    private List<Boothinformation> BoothList;

    public List<Boothinformation> getBoothList() {
        return BoothList;
    }

    public void setBoothList(List<Boothinformation> boothList) {
        BoothList = boothList;
    }
}
