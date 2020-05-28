package com.lyrk.entity;

import java.util.List;

public class CommercialPage extends Page {
private List<Commercialactivities>  commercialactivitiesList;

    public List<Commercialactivities> getCommercialactivitiesList() {
        return commercialactivitiesList;
    }

    public void setCommercialactivitiesList(List<Commercialactivities> commercialactivitiesList) {
        this.commercialactivitiesList = commercialactivitiesList;
    }
}
