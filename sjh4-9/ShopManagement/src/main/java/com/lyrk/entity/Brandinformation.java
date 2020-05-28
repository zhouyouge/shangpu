package com.lyrk.entity;

import java.util.Date;

public class Brandinformation {
    private Integer brandId;//	int	10	主键id
    private String brandCoding;//varchar	20	品牌编码*
    private String brandNameCh;//	varchar	20	品牌名称(中)*
    private String brandNameEh;//	varchar	20	品牌名称(英)
    private String commercialActivities;//	varchar	20	所属业态
    private String birthplaceOfBrand;//	varchar	20	品牌发源地
    private String storeProperties;//	varchar	20	连锁/单店
    private String businessNature;//	varchar	20	经营性质
    private String officialWebsite;//	varchar	50	官方网址
    private String headquarterAddress;//	varchar	100	总部地址
    private String brandDescription;//	varchar	255	品牌说明
    private String accessory;//	varchar	255	附件
    private Integer tenementId;//	int	10	租户id，外键
    private Date startTime;
    private Date outTime;

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

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandCoding() {
        return brandCoding;
    }

    public void setBrandCoding(String brandCoding) {
        this.brandCoding = brandCoding;
    }

    public String getBrandNameCh() {
        return brandNameCh;
    }

    public void setBrandNameCh(String brandNameCh) {
        this.brandNameCh = brandNameCh;
    }

    public String getBrandNameEh() {
        return brandNameEh;
    }

    public void setBrandNameEh(String brandNameEh) {
        this.brandNameEh = brandNameEh;
    }

    public String getCommercialActivities() {
        return commercialActivities;
    }

    public void setCommercialActivities(String commercialActivities) {
        this.commercialActivities = commercialActivities;
    }

    public String getBirthplaceOfBrand() {
        return birthplaceOfBrand;
    }

    public void setBirthplaceOfBrand(String birthplaceOfBrand) {
        this.birthplaceOfBrand = birthplaceOfBrand;
    }

    public String getStoreProperties() {
        return storeProperties;
    }

    public void setStoreProperties(String storeProperties) {
        this.storeProperties = storeProperties;
    }

    public String getBusinessNature() {
        return businessNature;
    }

    public void setBusinessNature(String businessNature) {
        this.businessNature = businessNature;
    }

    public String getOfficialWebsite() {
        return officialWebsite;
    }

    public void setOfficialWebsite(String officialWebsite) {
        this.officialWebsite = officialWebsite;
    }

    public String getHeadquarterAddress() {
        return headquarterAddress;
    }

    public void setHeadquarterAddress(String headquarterAddress) {
        this.headquarterAddress = headquarterAddress;
    }

    public String getBrandDescription() {
        return brandDescription;
    }

    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public Integer getTenementId() {
        return tenementId;
    }

    public void setTenementId(Integer tenementId) {
        this.tenementId = tenementId;
    }
}
