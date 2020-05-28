package com.lyrk.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

public class Certificateinformation {
    private int certificateId;
    private String certificateType;
    private Date certificateTimeRange;
    private String certificateImage;
    private int tenementId;

    public int getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public Date getCertificateTimeRange() {
        return certificateTimeRange;
    }

    public void setCertificateTimeRange(Date certificateTimeRange) {
        this.certificateTimeRange = certificateTimeRange;
    }

    public String getCertificateImage() {
        return certificateImage;
    }

    public void setCertificateImage(String certificateImage) {
        this.certificateImage = certificateImage;
    }

    public int getTenementId() {
        return tenementId;
    }

    public void setTenementId(int tenementId) {
        this.tenementId = tenementId;
    }


}
