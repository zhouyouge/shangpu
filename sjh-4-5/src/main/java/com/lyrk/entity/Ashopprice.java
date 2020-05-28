package com.lyrk.entity;

import java.io.Serializable;
import java.util.Date;

public class Ashopprice implements Serializable {
    private  Integer ashopId;
    private  Date annual;
    private  Integer rentHoliday;
    private  Double  SasacGuidedPrices	;//SasacGuidedPrices
    private  Double  marketPrice;
    private  Double  marketCompanyPricing;
    private  Double  marketHistoryPrice	;
    private  Double  networkHistoryPrice;;
    private  String  boothNumber;
    private  String  rent;
    private  Date  ashop_createtime;
    private  Date  ashop_updatetime;
    private  Double  outletCompanyPricing;

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public Date getAshop_createtime() {
        return ashop_createtime;
    }

    public void setAshop_createtime(Date ashop_createtime) {
        this.ashop_createtime = ashop_createtime;
    }

    public Date getAshop_updatetime() {
        return ashop_updatetime;
    }

    public void setAshop_updatetime(Date ashop_updatetime) {
        this.ashop_updatetime = ashop_updatetime;
    }

    public Double getOutletCompanyPricing() {
        return outletCompanyPricing;
    }

    public void setOutletCompanyPricing(Double outletCompanyPricing) {
        this.outletCompanyPricing = outletCompanyPricing;
    }

    public Ashopprice() {
    }

    public Ashopprice( Date annual, Integer rentHoliday, Double sasacGuidedPrices, Double marketPrice, Double marketCompanyPricing, Double marketHistoryPrice, Double networkHistoryPrice, String boothNumber) {
        this.annual = annual;
        this.rentHoliday = rentHoliday;
        SasacGuidedPrices = sasacGuidedPrices;
        this.marketPrice = marketPrice;
        this.marketCompanyPricing = marketCompanyPricing;
        this.marketHistoryPrice = marketHistoryPrice;
        this.networkHistoryPrice = networkHistoryPrice;
        this.boothNumber = boothNumber;
    }

    public Integer getAshopId() {
        return ashopId;
    }

    public void setAshopId(Integer ashopId) {
        this.ashopId = ashopId;
    }

    public Date getAnnual() {
        return annual;
    }

    public void setAnnual(Date annual) {
        this.annual = annual;
    }

    public Integer getRentHoliday() {
        return rentHoliday;
    }

    public void setRentHoliday(Integer rentHoliday) {
        this.rentHoliday = rentHoliday;
    }

    public Double getSasacGuidedPrices() {
        return SasacGuidedPrices;
    }

    public void setSasacGuidedPrices(Double sasacGuidedPrices) {
        SasacGuidedPrices = sasacGuidedPrices;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getMarketCompanyPricing() {
        return marketCompanyPricing;
    }

    public void setMarketCompanyPricing(Double marketCompanyPricing) {
        this.marketCompanyPricing = marketCompanyPricing;
    }

    public Double getMarketHistoryPrice() {
        return marketHistoryPrice;
    }

    public void setMarketHistoryPrice(Double marketHistoryPrice) {
        this.marketHistoryPrice = marketHistoryPrice;
    }

    public Double getNetworkHistoryPrice() {
        return networkHistoryPrice;
    }

    public void setNetworkHistoryPrice(Double networkHistoryPrice) {
        this.networkHistoryPrice = networkHistoryPrice;
    }

    public String getBoothNumber() {
        return boothNumber;
    }

    public void setBoothNumber(String boothNumber) {
        this.boothNumber = boothNumber;
    }
}
