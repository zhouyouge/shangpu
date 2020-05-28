package com.lyrk.entity;

import java.util.List;

public class BrandinformationPage extends Page {
private List<Brandinformation>  brandinformationList;

    public List<Brandinformation> getBrandinformationList() {
        return brandinformationList;
    }

    public void setBrandinformationList(List<Brandinformation> brandinformationList) {
        this.brandinformationList = brandinformationList;
    }
}
