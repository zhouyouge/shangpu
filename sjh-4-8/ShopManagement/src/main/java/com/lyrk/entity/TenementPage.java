package com.lyrk.entity;

import java.util.List;

public class TenementPage extends Page {
private List<Tenementlnformation>  tenementlnformationList;

    public List<Tenementlnformation> getTenementlnformationList() {
        return tenementlnformationList;
    }

    public void setTenementlnformationList(List<Tenementlnformation> tenementlnformationList) {
        this.tenementlnformationList = tenementlnformationList;
    }
}
