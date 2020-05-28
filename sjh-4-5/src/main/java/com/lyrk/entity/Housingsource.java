package com.lyrk.entity;

import java.io.Serializable;
import java.util.Date;

public class Housingsource implements Serializable {

    private Integer houseId;
    private String hoseSource;
    private String produceLabel;
    private String propertyOwner;
    private String hourseGoDown;
    private String purchaserName;
    private Date startTime;
    private Date outTime;
    private Integer gatheringId;

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getHoseSource() {
        return hoseSource;
    }

    public void setHoseSource(String hoseSource) {
        this.hoseSource = hoseSource;
    }

    public String getProduceLabel() {
        return produceLabel;
    }

    public void setProduceLabel(String produceLabel) {
        this.produceLabel = produceLabel;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public String getHourseGoDown() {
        return hourseGoDown;
    }

    public void setHourseGoDown(String hourseGoDown) {
        this.hourseGoDown = hourseGoDown;
    }

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Integer getGatheringId() {
        return gatheringId;
    }

    public void setGatheringId(Integer gatheringId) {
        this.gatheringId = gatheringId;
    }
}
