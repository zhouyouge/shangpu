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
        //甲方合同字段
        private Integer breakId;
        private String comparyTitle;
        private String companyAddress;
        private String comanyPhone;
        private String breakoutNamee;
        //银行
        private  Integer bankId;
        private String bankName;
        private String bankaccount;
        private String bankrownum;
        private String bankName2;
        private String bankaccount2;
        private String bankrownum2;
        //开票
        private Integer billId;
        private String billingName;
        private String ratepayerNumber;
        private String billAddress;
        private String billPhone;
        private String bankNamee;
        private String billAccount;
        private double rent_taxRate;
        private String breakoutNameee;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getBillingName() {
        return billingName;
    }

    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }

    public String getRatepayerNumber() {
        return ratepayerNumber;
    }

    public void setRatepayerNumber(String ratepayerNumber) {
        this.ratepayerNumber = ratepayerNumber;
    }

    public String getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress;
    }

    public String getBillPhone() {
        return billPhone;
    }

    public void setBillPhone(String billPhone) {
        this.billPhone = billPhone;
    }

    public String getBankNamee() {
        return bankNamee;
    }

    public void setBankNamee(String bankNamee) {
        this.bankNamee = bankNamee;
    }

    public String getBillAccount() {
        return billAccount;
    }

    public void setBillAccount(String billAccount) {
        this.billAccount = billAccount;
    }

    public double getRent_taxRate() {
        return rent_taxRate;
    }

    public void setRent_taxRate(double rent_taxRate) {
        this.rent_taxRate = rent_taxRate;
    }

    public String getBreakoutNameee() {
        return breakoutNameee;
    }

    public void setBreakoutNameee(String breakoutNameee) {
        this.breakoutNameee = breakoutNameee;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getBankrownum() {
        return bankrownum;
    }

    public void setBankrownum(String bankrownum) {
        this.bankrownum = bankrownum;
    }

    public String getBankName2() {
        return bankName2;
    }

    public void setBankName2(String bankName2) {
        this.bankName2 = bankName2;
    }

    public String getBankaccount2() {
        return bankaccount2;
    }

    public void setBankaccount2(String bankaccount2) {
        this.bankaccount2 = bankaccount2;
    }

    public String getBankrownum2() {
        return bankrownum2;
    }

    public void setBankrownum2(String bankrownum2) {
        this.bankrownum2 = bankrownum2;
    }

    public String getBreakIdd() {
        return breakIdd;
    }

    public void setBreakIdd(String breakIdd) {
        this.breakIdd = breakIdd;
    }

    private String   breakIdd
                ;
    public String getBreakoutNamee() {
        return breakoutNamee;
    }

    public void setBreakoutNamee(String breakoutNamee) {
        this.breakoutNamee = breakoutNamee;
    }

    public Integer getBreakId() {
        return breakId;
    }

    public void setBreakId(Integer breakId) {
        this.breakId = breakId;
    }

    public String getComparyTitle() {
        return comparyTitle;
    }

    public void setComparyTitle(String comparyTitle) {
        this.comparyTitle = comparyTitle;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getComanyPhone() {
        return comanyPhone;
    }

    public void setComanyPhone(String comanyPhone) {
        this.comanyPhone = comanyPhone;
    }

    public Breakout() {
    }

    public Breakout(String breakoutName, String brabbreviation, Integer brcoding, String brprincipal, String brworkType, double brcoveredArea, double broperatingArea, double brresidentialPool, String broperationalRegime, String brcomment, String brBreakoutDiagram, String brBreakoutLicense, Integer brBreakoutStatus, Date br_createtime, Date br_updatetime) {
        this.breakoutName = breakoutName;
        this.brabbreviation = brabbreviation;
        this.brcoding = brcoding;
        this.brprincipal = brprincipal;
        this.brworkType = brworkType;
        this.brcoveredArea = brcoveredArea;
        this.broperatingArea = broperatingArea;
        this.brresidentialPool = brresidentialPool;
        this.broperationalRegime = broperationalRegime;
        this.brcomment = brcomment;
        this.brBreakoutDiagram = brBreakoutDiagram;
        this.brBreakoutLicense = brBreakoutLicense;
        this.brBreakoutStatus = brBreakoutStatus;
        this.br_createtime = br_createtime;
        this.br_updatetime = br_updatetime;
    }


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
