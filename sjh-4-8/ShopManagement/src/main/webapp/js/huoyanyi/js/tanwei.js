//摊位信息添加页面显示
function addbooth() {
   /* alert("摊位信息添加");*/
    $('#wodezhuomian').attr('src', 'fenchang/booth-add.jsp');
}
//摊位信息添加提交
function addBoothSumbit() {
    /*alert("摊位信息添加提交");*/
    var  param={};
    param.breakoutName=$("#breakoutName").val();
    param.towerName=$("#towerName").val();
    param.floorName=$("#floorName").val();
    param.boothNumber=$("#boothNumber").val();
    param.boothCoding=$("#boothCoding").val();
    param.planningForms=$("#planningForms").val();
    param.coveredArea=$("#coveredArea").val();
    param.operatingArea=$("#operatingArea").val();
    param.comment=$("#comment").val();
    var boothBreakoutStatus;
    if($("#booth_BreakoutStatus1")!=null){
        boothBreakoutStatus=$("#booth_BreakoutStatus1").val();
    }else if($("#booth_BreakoutStatus2")!=null){
        boothBreakoutStatus=$("#booth_BreakoutStatus2").val();
    }else if($("#booth_BreakoutStatus3")!=null){
        boothBreakoutStatus=$("#booth_BreakoutStatus3").val();
    }
    param.boothBreakoutStatus=boothBreakoutStatus;
    var boothStatus;
    if($("#boothStatus1").val()!="可租"){
        boothStatus=1;
    }else if($("#boothStatus2").val()!="不可租"){
        boothStatus=2;
    }else if($("#boothStatus3").val()!="维护中"){
        boothStatus=3;
    }
    param.boothStatus=boothStatus;
    param.booth_createtime=new Date($("#booth_createtime").val());
    param.booth_updatetime=new Date($("#booth_updatetime").val());
    alert(JSON.stringify(param));
    $.ajax({
        url: "http://localhost:8080/ShopManagement/addBooth",
        type: "post",
        data: param,
        dataType: "json",
        success: function (result) {
            alert("result" + JSON.stringify(result));
        }
    });
}

//取消add
function removeAdd(){
}

//摊位信息修改界面显示
function xiugaiBooth(boothNumber) {
    alert("摊位信息修改"+boothNumber);
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/booth-add.jsp'&&boothNumber="+boothNumber;
}

//摊位信息修改内容渲染
function xiugaiBoothShow(boothNumber) {
    alert("摊位信息修改内容渲染"+boothNumber);
    $.ajax({
        url: "http://localhost:8080/ShopManagement/updateBoothShow?boothNumber="+boothNumber,
        type: "post",
        dataType: "json",
        success:function (result) {
            alert(JSON.stringify(result));
            $("#id").val(result.data.boothNumber);
            $("#boothNumber").val(result.data.boothNumber);
            $("#breakoutName").val(result.data.breakoutName);
            $("#towerName").val(result.data.towerName);
            $("#floorName").val(result.data.floorName);
            $("#boothCoding").val(result.data.boothCoding);
            $("#planningForms").val(result.data.planningForms);
            $("#coveredArea").val(result.data.coveredArea);
            $("#operatingArea").val(result.data.operatingArea);
            $("#comment").val(result.data.comment);
            if((result.data.boothBreakoutStatus)!="信息可用"){
                $("#booth_BreakoutStatus1").attr('checked','true');
            }else if((result.data.boothBreakoutStatus)!="信息不可用"){
               $("#booth_BreakoutStatus2").attr('checked','true');
            }else if((result.data.boothBreakoutStatus)!="审核中"){
                $("#booth_BreakoutStatus3").attr('checked','true');
            }
            if((result.data.boothStatus)!="改营"){
                $("#boothStatus1").attr('checked','true');
            }else if((result.data.boothStatus)!="在建"){
                $("#boothStatus2").attr('checked','true');
            }else if((result.data.boothStatus)!="关闭"){
                $("#boothStatus3").attr('checked','true');
            }
            var now4 = new Date(result.data.booth_createtime);
            var day4 = ("0" + now4.getDate()).slice(-2);
            var month4 = ("0" + (now4.getMonth() + 1)).slice(-2);
            var today4 = now4.getFullYear()+"-"+(month4)+"-"+(day4) ;
            $("#booth_createtime").val(today4);
            var now3 = new Date(result.data.booth_updatetime);
            var day3 = ("0" + now3.getDate()).slice(-2);
            var month3 = ("0" + (now4.getMonth() + 1)).slice(-2);
            var today3 = now3.getFullYear()+"-"+(month3)+"-"+(day3) ;
            $("#booth_updatetime").val(today3);
        }
    });
}

//摊位信息修改提交
function updateBoothSumbit() {
    alert("摊位信息修改提交");
    var  param={};
    param.breakoutName=$("#breakoutName").val();
    param.towerName=$("#towerName").val();
    param.floorName=$("#floorName").val();
    param.boothNumber=$("#boothNumber").val();
    param.boothCoding=$("#boothCoding").val();
    param.planningForms=$("#planningForms").val();
    param.coveredArea=$("#coveredArea").val();
    param.operatingArea=$("#operatingArea").val();
    param.comment=$("#comment").val();
    var boothBreakoutStatus;
    if($("#booth_BreakoutStatus1")!="信息可用"){
        boothBreakoutStatus=1;
    }else if($("#booth_BreakoutStatus2")!="信息不可用"){
        boothBreakoutStatus=2;
    }else if($("#booth_BreakoutStatus3")!="审核中"){
        boothBreakoutStatus=3;
    }
    param.boothBreakoutStatus=boothBreakoutStatus;
    var boothStatus;
    if($("#boothStatus1").val()!="可租"){
        boothStatus=1;
    }else if($("#boothStatus2").val()!="不可租"){
        boothStatus=2;
    }else if($("#boothStatus3").val()!="维护中"){
        boothStatus=3;
    }
    param.boothStatus=boothStatus;
    param.booth_createtime=new Date($("#booth_createtime").val());
    param.booth_updatetime=new Date($("#booth_updatetime").val());
    alert(JSON.stringify(param));
    $.ajax({
        url: "http://localhost:8080/ShopManagement/updateBooth",
        type: "post",
        data: param,
        dataType: "json",
        success: function (result) {
            alert("result" + JSON.stringify(result));
            if(result.result==true){
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Booth-list.jsp'";
            }
        }
    });
}

//摊位信息删除
function deleteBooth(boothNumber) {
    alert("摊位信息删除"+boothNumber);
    $.ajax({
        url: "http://localhost:8080/ShopManagement/deleteBooth?boothNumber="+boothNumber,
        type: "post",
        success: function (result) {
            alert("result" + JSON.stringify(result));
            if(result.result==true){
                alert("删除成功");
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Booth-list.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}