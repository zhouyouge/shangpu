package com.lyrk.entity;

import java.util.Date;

public class Contractlnformation {
    private Integer  contractId;
    private Date annual;
    private Integer rentHoliday;
    private double SasacGuidedPrices;
    private double marketPrice;
    private double marketCompanyPricing;
    private double marketHistoryPrice;
    private double networkHistoryPrice;
    private String boothNumber;

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
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

    public double getSasacGuidedPrices() {
        return SasacGuidedPrices;
    }

    public void setSasacGuidedPrices(double sasacGuidedPrices) {
        SasacGuidedPrices = sasacGuidedPrices;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public double getMarketCompanyPricing() {
        return marketCompanyPricing;
    }

    public void setMarketCompanyPricing(double marketCompanyPricing) {
        this.marketCompanyPricing = marketCompanyPricing;
    }

    public double getMarketHistoryPrice() {
        return marketHistoryPrice;
    }

    public void setMarketHistoryPrice(double marketHistoryPrice) {
        this.marketHistoryPrice = marketHistoryPrice;
    }

    public double getNetworkHistoryPrice() {
        return networkHistoryPrice;
    }

    public void setNetworkHistoryPrice(double networkHistoryPrice) {
        this.networkHistoryPrice = networkHistoryPrice;
    }

    public String getBoothNumber() {
        return boothNumber;
    }

    public void setBoothNumber(String boothNumber) {
        this.boothNumber = boothNumber;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }
}
