package com.lyrk.entity;

import java.io.Serializable;
import java.util.Date;

public class Tenementlnformation implements Serializable {
    private Integer tenementId;
    private String tenantCoding;
    private String tenantName;
    private String tenantType;
    private String companyName;
    private String IDNumber;
    private String socialCreditCode;
    private String managementForms;
    private String rentalArea;
    private String tenanStatus;
    private String  tenanPhone;
    private String blacklistStatus;
    private String telephone;
    private String nationality;
    private String email;
    private String comment;
    private String mailingAddress;
    private String boothNumber;
    private Date tentment_createtime;
    private Date tentment_updatetime;

    public Date getTentment_createtime() {
        return tentment_createtime;
    }

    public void setTentment_createtime(Date tentment_createtime) {
        this.tentment_createtime = tentment_createtime;
    }

    public Date getTentment_updatetime() {
        return tentment_updatetime;
    }

    public void setTentment_updatetime(Date tentment_updatetime) {
        this.tentment_updatetime = tentment_updatetime;
    }

    public Integer getTenementId() {
        return tenementId;
    }

    public void setTenementId(Integer tenementId) {
        this.tenementId = tenementId;
    }

    public String getTenantCoding() {
        return tenantCoding;
    }

    public void setTenantCoding(String tenantCoding) {
        this.tenantCoding = tenantCoding;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getTenantType() {
        return tenantType;
    }

    public void setTenantType(String tenantType) {
        this.tenantType = tenantType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getSocialCreditCode() {
        return socialCreditCode;
    }

    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
    }

    public String getManagementForms() {
        return managementForms;
    }

    public void setManagementForms(String managementForms) {
        this.managementForms = managementForms;
    }

    public String getRentalArea() {
        return rentalArea;
    }

    public void setRentalArea(String rentalArea) {
        this.rentalArea = rentalArea;
    }

    public String getTenanStatus() {
        return tenanStatus;
    }

    public void setTenanStatus(String tenanStatus) {
        this.tenanStatus = tenanStatus;
    }

    public String getTenanPhone() {
        return tenanPhone;
    }

    public void setTenanPhone(String tenanPhone) {
        this.tenanPhone = tenanPhone;
    }

    public String getBlacklistStatus() {
        return blacklistStatus;
    }

    public void setBlacklistStatus(String blacklistStatus) {
        this.blacklistStatus = blacklistStatus;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getBoothNumber() {
        return boothNumber;
    }

    public void setBoothNumber(String boothNumber) {
        this.boothNumber = boothNumber;
    }
}
