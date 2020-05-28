//租户信息添加页面显示
function addtenement() {
    /*alert("租户信息添加");*/
    $('#wodezhuomian').attr('src', 'fenchang/tenement-add.jsp');
}
//添加租户
function addtenementsubmit() {
    alert("添加租户信息提交");
    var param={};
    param.tenantCoding=$("#tenantCoding").val();
    param.tenantName=$("#tenantName").val();
    param.tenantType=$("#tenantType").val();
    param.companyName=$("#companyName").val();
    param.IDNumber=$("#IDNumber").val();
    param.socialCreditCode=$("#socialCreditCode").val();
    param.managementForms=$("#managementForms").val();
    param.rentalArea=$("#rentalArea").val();
    param.tenanStatus=$("#tenanStatus").val();
    alert("22");
    var   blacklistStatus;
    if($("#blacklistStatus1").val()!=null){
        blacklistStatus=$("#blacklistStatus1").val();
    }else if($("#blacklistStatus2").val()!=null){
        blacklistStatus=$("#blacklistStatus2").val();
    }
    param.blacklistStatus=blacklistStatus;
    param.tenanPhone=$("#tenanPhone").val();
    param.telephone=$("#phone").val();
    param.nationality=$("#nationality").val();
    param.email=$("#email").val();
    param.comment=$("#br_comment").val();
    param.mailingAddress=$("#mailingAddress").val();
    param.boothNumber=$("#boothNumber").val();
    alert("333");
    var tentment_createtime=new Date($("#commentdatemin").val());
    var  tentment_updatetime=new Date($("#commentdatemax").val());
    param.tentment_createtime=tentment_createtime;
    param.tentment_updatetime=tentment_updatetime;
    alert(JSON.stringify(param));
    $.ajax({
        url: "http://localhost:8080/ShopManagement/addTement",
        type: "post",
        data: param,
        dataType: "json",
        success: function (result) {
            alert("result" + JSON.stringify(result));
        }
    });
}