package com.lyrk.entity;

import java.util.Date;

public class Test {

    // 分场开票信息
    private String billingName;
    private String ratepayerNumber;
    private String billAddress;
    private String billPhone;
    private String bankName1;
    private String billAccount;
    private double rent_taxRate;
    private Date billcreatetime;
    private Date billupdatetime;

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

    public String getBankName1() {
        return bankName1;
    }

    public void setBankName1(String bankName1) {
        this.bankName1 = bankName1;
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

    public Date getBillcreatetime() {
        return billcreatetime;
    }

    public void setBillcreatetime(Date billcreatetime) {
        this.billcreatetime = billcreatetime;
    }

    public Date getBillupdatetime() {
        return billupdatetime;
    }

    public void setBillupdatetime(Date billupdatetime) {
        this.billupdatetime = billupdatetime;
    }

    //银行账户
    private String bankName  ;          //varchar	20	开户行名称*
    private String bankaccount ;     //varchar	20	开户账号*
    private String bankrownum;        //varchar	20	开户行号*
    private String bankName2;          //varchar	20	开户行名称*
    private String bankaccount2;        //varchar	20	开户账号*
    private String bankrownum2;
    private String   breakId;

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
// 甲方合同

    private String comparyTitle;
    private String companyAddress;
    private String comanyPhone;


    // 分场信息
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

    public String getBreakId() {
        return breakId;
    }

    public void setBreakId(String breakId) {
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
