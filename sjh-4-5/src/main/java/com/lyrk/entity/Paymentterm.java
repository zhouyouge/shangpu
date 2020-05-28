package com.lyrk.entity;

import java.io.Serializable;

public class Paymentterm implements Serializable {

    private Integer getheringId;
    private String gatheringName;
    private String bankNo;
    private String accountName;
    private String accountNumber;

    public Integer getGetheringId() {
        return getheringId;
    }

    public void setGetheringId(Integer getheringId) {
        this.getheringId = getheringId;
    }

    public String getGatheringName() {
        return gatheringName;
    }

    public void setGatheringName(String gatheringName) {
        this.gatheringName = gatheringName;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
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
}
