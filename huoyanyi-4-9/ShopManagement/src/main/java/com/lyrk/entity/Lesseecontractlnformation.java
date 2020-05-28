package com.lyrk.entity;

import java.io.Serializable;

public class Lesseecontractlnformation implements Serializable {
    private Integer  contractId;
    private String contractUp;
    private String contractAddress;
    private String contractPhone;
    private String accountName;
    private String openingBank;
    private String openingBankAccount;
    private String identificationNumber;
    private String bankCode;
    private Integer  tenementId;

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractUp() {
        return contractUp;
    }

    public void setContractUp(String contractUp) {
        this.contractUp = contractUp;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public String getContractPhone() {
        return contractPhone;
    }

    public void setContractPhone(String contractPhone) {
        this.contractPhone = contractPhone;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    public String getOpeningBankAccount() {
        return openingBankAccount;
    }

    public void setOpeningBankAccount(String openingBankAccount) {
        this.openingBankAccount = openingBankAccount;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public Integer getTenementId() {
        return tenementId;
    }

    public void setTenementId(Integer tenementId) {
        this.tenementId = tenementId;
    }
}
