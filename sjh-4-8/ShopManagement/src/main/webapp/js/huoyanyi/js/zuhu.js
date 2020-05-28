//租户信息添加页面显示
function addtenement() {
    /*alert("租户信息添加");*/
    $("#type").val(1);
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

//租户删除界面
function deleteTement(tenementId) {
   /* alert("正在删除租户信息"+tenementId);*/
    $.ajax({
        url: "http://localhost:8080/ShopManagement/deleteTement?tenementId="+tenementId,
        type: "post",
        success: function (result) {
            alert("result" + JSON.stringify(result));
            if(result.result==true){
                alert("删除成功");
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Tement-List.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
  }


function xiugai(tenementId) {
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/tenement-add.jsp'&&tenementId="+tenementId;

}
//租户显示修改界面
function xiugaiTement(tenementId) {
    alert("一铺一价显示修改界面"+tenementId);
    $.ajax({
        url: "http://localhost:8080/ShopManagement/updateTementShow?tenementId="+tenementId,
        type: "post",
        dataType: "json",
        success:function (result) {
            alert(JSON.stringify(result));
            $("#id").val(result.data.tenementId);
            $("#tenantCoding").val(result.data.tenantCoding);
            $("#tenantName").val(result.data.tenantName);
            if(result.data.managementForms=="业态，必填"){
                $("#yetai").attr('checked','true');
            }else{
                $("#managementFormsMoren").attr('checked','true');
            }

            if(result.data.tenantType=="个人"){
                $("#geren").attr('checked','true');
            }
            if(result.data.tenantType=="公司"){
                $("#gongsi").attr('checked','true');
            }
            $("#companyName").val(result.data.companyName);
            $("#IDNumber").val(result.data.iDNumber);
            $("#socialCreditCode").val(result.data.socialCreditCode);
            $("#rentalArea").val(result.data.rentalArea);
            if(result.data.tenanStatus=="启用"){
                $("#qiyong").attr('checked','true');
            }else if(result.data.tenanStatus=="停止"){
                $("#tingzhi").attr('checked','true');
            }else{
                $("#tenanStatusMoren").attr('checked','true');
            }
            $("input:radio[value=blacklistStatus]").attr('checked','true');
            if((result.data.blacklistStatus)=="是"){
                $("#blacklistStatus1").attr('checked','true');
            }else if(result.data.blacklistStatus=="否"){
               $("#blacklistStatus2").attr('checked','true');
            }
            $("#tenanPhone").val(result.data.tenanPhone);
            $("#phone").val(result.data.telephone);
            $("#nationality").val(result.data.nationality);
            $("#email").val(result.data.email);
            $("#br_comment").val(result.data.comment);
            $("#mailingAddress").val(result.data.mailingAddress);
            $("#boothNumber").val(result.data.boothNumber);
            var now4 = new Date(result.data.tentment_createtime);
            var day4 = ("0" + now4.getDate()).slice(-2);
            var month4 = ("0" + (now4.getMonth() + 1)).slice(-2);
            var today4 = now4.getFullYear()+"-"+(month4)+"-"+(day4) ;
                $("#commentdatemin").val(today4);
            var now3 = new Date(result.data.tentment_updatetime);
            var day3 = ("0" + now3.getDate()).slice(-2);
            var month3 = ("0" + (now4.getMonth() + 1)).slice(-2);
            var today3 = now3.getFullYear()+"-"+(month3)+"-"+(day3) ;
                $("#commentdatemax").val(today3);
        }
    });
}
//租户信息修改后提交
function xiugaitenementsubmit() {
alert("租户信息提交");
    var param={};
    param.tenementId=$("#id").val();
    param.tenantCoding=$("#tenantCoding").val();
    param.tenantName=$("#tenantName").val();
    param.tenantType=$("#tenantType").val();
    param.companyName=$("#companyName").val();
    param.IDNumber=$("#IDNumber").val();
    param.socialCreditCode=$("#socialCreditCode").val();
    param.managementForms=$("#managementForms").val();
    param.rentalArea=$("#rentalArea").val();
    param.tenanStatus=$("#tenanStatus").val();
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
    var boothStatus=$("#boothStatus").val();
    if(boothStatus=="可租"){
        param.boothStatus="1";
    }else if(boothStatus=="不可租"){
        param.boothStatus="2";
    }
    var tentment_createtime=new Date($("#commentdatemin").val());
    var  tentment_updatetime=new Date($("#commentdatemax").val());
    param.tentment_createtime=tentment_createtime;
    param.tentment_updatetime=tentment_updatetime;
    alert(JSON.stringify(param));
    $.ajax({
        url: "http://localhost:8080/ShopManagement/updateTement",
        type: "post",
        data:param,
        success: function (result) {
                alert("result" + JSON.stringify(result));
            if(result.result==true){
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Tement-List.jsp'";
            }
        }
    });
}
