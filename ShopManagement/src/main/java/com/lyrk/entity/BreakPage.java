package com.lyrk.entity;

import java.util.List;

public class BreakPage extends Page {
private List<Breakout>  breakoutList;

    public List<Breakout> getBreakoutList() {
        return breakoutList;
    }

    public void setBreakoutList(List<Breakout> breakoutList) {
        this.breakoutList = breakoutList;
    }
}
