package com.lyrk.entity;

import java.io.Serializable;

public class Linkmaninformation implements Serializable {

    private Integer linkmanId;
    private String linkmanName;
    private String linkmanPhone;
    private String linkmanStatus;
    private String linkmanPosition;
    private String linkmanFixedLine;
    private String linkmanEmail;
    private Integer brandId;

    public Integer getLinkmanId() {
        return linkmanId;
    }

    public void setLinkmanId(Integer linkmanId) {
        this.linkmanId = linkmanId;
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
    }

    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        this.linkmanPhone = linkmanPhone;
    }

    public String getLinkmanStatus() {
        return linkmanStatus;
    }

    public void setLinkmanStatus(String linkmanStatus) {
        this.linkmanStatus = linkmanStatus;
    }

    public String getLinkmanPosition() {
        return linkmanPosition;
    }

    public void setLinkmanPosition(String linkmanPosition) {
        this.linkmanPosition = linkmanPosition;
    }

    public String getLinkmanFixedLine() {
        return linkmanFixedLine;
    }

    public void setLinkmanFixedLine(String linkmanFixedLine) {
        this.linkmanFixedLine = linkmanFixedLine;
    }

    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    public void setLinkmanEmail(String linkmanEmail) {
        this.linkmanEmail = linkmanEmail;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
}
