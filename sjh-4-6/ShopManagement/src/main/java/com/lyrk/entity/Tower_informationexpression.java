package com.lyrk.entity;

import java.io.Serializable;
import java.util.Date;

public class Tower_informationexpression  implements Serializable {
    //楼栋信息
    private String breakoutName;
    private String towerCoding;
    private String towerName;
    private String towerStatus;
    private double coveredArea;
    private double operatingArea;
    private Integer  upFloorNumber;
    private Integer downFloorNumber;
    private String comment;
    private String towerImage;
    private Integer tower_BreakoutStatus;
    private Date tower_createtime;
    private Date tower_updatetime;

    //房屋来源
    private String hoseSource;
    private String ProduceLabel;
    private String propertyOwner;
    private String hourseGoDown;
    private String purchaserName;
    private Date startTime;
    private Date outTime;
    private Integer gatheringId;
    //房屋去向
    private String hourseGoDownn;
    private String townerName;
    private String purchaserNamee;
    private Integer tenementId;
    //收款
    private String gatheringName;
    private String BankNo;
    private String accountName;
    private String accountNumber;

    public String getHoseSource() {
        return hoseSource;
    }

    public void setHoseSource(String hoseSource) {
        this.hoseSource = hoseSource;
    }

    public String getProduceLabel() {
        return ProduceLabel;
    }

    public void setProduceLabel(String produceLabel) {
        ProduceLabel = produceLabel;
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

    public String getHourseGoDownn() {
        return hourseGoDownn;
    }

    public void setHourseGoDownn(String hourseGoDownn) {
        this.hourseGoDownn = hourseGoDownn;
    }

    public String getTownerName() {
        return townerName;
    }

    public void setTownerName(String townerName) {
        this.townerName = townerName;
    }

    public String getPurchaserNamee() {
        return purchaserNamee;
    }

    public void setPurchaserNamee(String purchaserNamee) {
        this.purchaserNamee = purchaserNamee;
    }

    public Integer getTenementId() {
        return tenementId;
    }

    public void setTenementId(Integer tenementId) {
        this.tenementId = tenementId;
    }

    public String getGatheringName() {
        return gatheringName;
    }

    public void setGatheringName(String gatheringName) {
        this.gatheringName = gatheringName;
    }

    public String getBankNo() {
        return BankNo;
    }

    public void setBankNo(String bankNo) {
        BankNo = bankNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

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

    public String getBreakoutName() {
        return breakoutName;
    }

    public void setBreakoutName(String breakoutName) {
        this.breakoutName = breakoutName;
    }

    public String getTowerCoding() {
        return towerCoding;
    }

    public void setTowerCoding(String towerCoding) {
        this.towerCoding = towerCoding;
    }

    public String getTowerName() {
        return towerName;
    }

    public void setTowerName(String towerName) {
        this.towerName = towerName;
    }

    public String getTowerStatus() {
        return towerStatus;
    }

    public void setTowerStatus(String towerStatus) {
        this.towerStatus = towerStatus;
    }

    public double getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(double coveredArea) {
        this.coveredArea = coveredArea;
    }

    public double getOperatingArea() {
        return operatingArea;
    }

    public void setOperatingArea(double operatingArea) {
        this.operatingArea = operatingArea;
    }

    public Integer getUpFloorNumber() {
        return upFloorNumber;
    }

    public void setUpFloorNumber(Integer upFloorNumber) {
        this.upFloorNumber = upFloorNumber;
    }

    public Integer getDownFloorNumber() {
        return downFloorNumber;
    }

    public void setDownFloorNumber(Integer downFloorNumber) {
        this.downFloorNumber = downFloorNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTowerImage() {
        return towerImage;
    }

    public void setTowerImage(String towerImage) {
        this.towerImage = towerImage;
    }

    public Integer getTower_BreakoutStatus() {
        return tower_BreakoutStatus;
    }

    public void setTower_BreakoutStatus(Integer tower_BreakoutStatus) {
        this.tower_BreakoutStatus = tower_BreakoutStatus;
    }
}
