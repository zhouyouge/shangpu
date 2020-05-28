package com.lyrk.entity;

import java.util.Date;

public class Breakout {
        private String breakoutName;//	varchar	50	分场名称*
        private String brabbreviation;//	varchar	50	分场简称*
        private Integer brcoding;//	int	10	分场编码*
        private String brprincipal;//	varchar	10	负责人*
        private String brworkType;//	varchar	50	经营类型*
        private double brcoveredArea;//	double	20，2	建筑面积(m²)*
        private double broperatingArea;//	double	20，2	经营面积(m²)*
        private double brresidentialPool;// Area	double	20，2	公摊面积(m²)*
        private String broperationalRegime;//	varchar	10	营运状态
        private String brcomment;//	varchar	100	备注
        private String brBreakoutDiagram;//	varchar	255	分场简图
        private String brBreakoutLicense;//	varchar	255	分场营业执照
        private Integer brBreakoutStatus;//	int	10	分场信息状态
         private Date br_createtime;
         private Date br_updatetime;

    public Date getBr_createtime() {
        return br_createtime;
    }

    public void setBr_createtime(Date br_createtime) {
        this.br_createtime = br_createtime;
    }
    public Date getBr_updatetime() {
        return br_updatetime;
    }
    public void setBr_updatetime(Date br_updatetime) {
        this.br_updatetime = br_updatetime;
    }
    public String getBreakoutName() {
            return breakoutName;
        }

        public void setBreakoutName(String breakoutName) {
            this.breakoutName = breakoutName;
        }

        public String getBrabbreviation() {
            return brabbreviation;
        }

        public void setBrabbreviation(String brabbreviation) {
            this.brabbreviation = brabbreviation;
        }

        public Integer getBrcoding() {
            return brcoding;
        }

        public void setBrcoding(Integer brcoding) {
            this.brcoding = brcoding;
        }

        public String getBrprincipal() {
            return brprincipal;
        }

        public void setBrprincipal(String brprincipal) {
            this.brprincipal = brprincipal;
        }

        public String getBrworkType() {
            return brworkType;
        }

        public void setBrworkType(String brworkType) {
            this.brworkType = brworkType;
        }

        public double getBrcoveredArea() {
            return brcoveredArea;
        }

        public void setBrcoveredArea(double brcoveredArea) {
            this.brcoveredArea = brcoveredArea;
        }

        public double getBroperatingArea() {
            return broperatingArea;
        }

        public void setBroperatingArea(double broperatingArea) {
            this.broperatingArea = broperatingArea;
        }

        public double getBrresidentialPool() {
            return brresidentialPool;
        }

        public void setBrresidentialPool(double brresidentialPool) {
            this.brresidentialPool = brresidentialPool;
        }

        public String getBroperationalRegime() {
            return broperationalRegime;
        }

        public void setBroperationalRegime(String broperationalRegime) {
            this.broperationalRegime = broperationalRegime;
        }

        public String getBrcomment() {
            return brcomment;
        }

        public void setBrcomment(String brcomment) {
            this.brcomment = brcomment;
        }

        public String getBrBreakoutDiagram() {
            return brBreakoutDiagram;
        }

        public void setBrBreakoutDiagram(String brBreakoutDiagram) {
            this.brBreakoutDiagram = brBreakoutDiagram;
        }

        public String getBrBreakoutLicense() {
            return brBreakoutLicense;
        }

        public void setBrBreakoutLicense(String brBreakoutLicense) {
            this.brBreakoutLicense = brBreakoutLicense;
        }

        public Integer getBrBreakoutStatus() {
            return brBreakoutStatus;
        }

        public void setBrBreakoutStatus(Integer brBreakoutStatus) {
            this.brBreakoutStatus = brBreakoutStatus;
        }
    }
