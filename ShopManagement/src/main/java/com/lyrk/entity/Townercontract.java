package com.lyrk.entity;

import java.io.Serializable;

public class Townercontract implements Serializable {
    private Integer breakId;
    private String comparyTitle;
    private String companyAddress;

    private String comanyPhone;
    private String breakoutName;


    public Integer getBreakId() {
        return breakId;
    }

    public void setBreakId(Integer breakId) {
        this.breakId = breakId;
    }

    public String getComparyTitle() {
        return comparyTitle;
    }

    public void setComparyTitle(String comparyTitle) {
        this.comparyTitle = comparyTitle;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getComanyPhone() {
        return comanyPhone;
    }

    public void setComanyPhone(String comanyPhone) {
        this.comanyPhone = comanyPhone;
    }

    public String getBreakoutName() {
        return breakoutName;
    }

    public void setBreakoutName(String breakoutName) {
        this.breakoutName = breakoutName;
    }
}
