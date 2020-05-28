//楼栋信息添加页面显示
function addtower() {
    /*alert("楼栋信息添加");*/
    $('#wodezhuomian').attr('src', 'fenchang/townerContract-add.jsp');
}

//楼栋信息添加提交
function addTowerSumbit(){
    alert("楼栋添加提交");
    var param={};
    param.breakoutName=$("#breakoutName").val();
    param.towerCoding=$("#towerCoding").val();
    param.towerName=$("#towerName").val();
    param.towerStatus=$("#br_principal").val();
    param.coveredArea=$("#coveredArea").val();
    param.operatingArea=0;
    param.upFloorNumber=$("#upFloorNumber").val();
    param.downFloorNumber=$("#downFloorNumber").val();
    param.comment=$("#br_comment").val();
    param.towerImage='1111';
    param.tower_BreakoutStatus=$("#").val();
    var towerStatus;
    if($("#towerStatus1").val()!=null){
        towerStatus=$("#towerStatus1").val();
    }else if($("#towerStatus2").val()!=null){
        towerStatus=$("#towerStatus2").val();
    }
    var tower_BreakoutStatus;
    if($("#tower_BreakoutStatus1").val()!=null && $("#tower_BreakoutStatus1").val()=="信息可用"){
        tower_BreakoutStatus=1;
    }else if($("#tower_BreakoutStatus2").val()!=null && $("#tower_BreakoutStatus2").val()=="信息不可用"){
        tower_BreakoutStatus=2;
    }else if($("#tower_BreakoutStatus3").val()!=null && $("#tower_BreakoutStatus2").val()=="审核中"){
        tower_BreakoutStatus=3;
    }
    param.tower_BreakoutStatus=tower_BreakoutStatus;
    param.towerStatus=towerStatus;
    //房屋来源
    param.hoseSource=$("#hoseSource").val();
    param.ProduceLabel=$("#ProduceLabel").val();
    param.propertyOwner=$("#propertyOwner").val();
    param.hourseGoDown=$("#townerName").val();
    param.purchaserName=$("#purchaserName").val();
    //房屋去向
    param.hourseGoDownn=$("#hourseGoDown").val();
    param.townerName=$("#townerName2").val();
    param.purchaserNamee=$("#purchaserName2").val();
    param.tenementId=$("#").val();
    //收款
    param.gatheringName=$("#gatheringName").val();
    param.BankNo=$("#BankNo").val();
    param.accountName=$("#accountName").val();
    param.accountNumber=$("#accountNumber").val();
    alert(JSON.stringify(param));
    $.ajax({
        url:"http://localhost:8080/ShopManagement/addTower",
        type:"post",
        data:param,
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
        }
    });
}

//删除楼栋信息
function deleteTowener(towerName) {
alert("删除楼栋信息"+towerName);
    $.ajax({
        url: "http://localhost:8080/ShopManagement/deleteTowener?towerName="+towerName,
        type: "post",
        success: function (result) {
            alert("result" + JSON.stringify(result));
            if(result.result==true){
                alert("删除成功");
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/towner-list.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}
//删除房屋来源信息
function deleteHouseSource(houseId) {
alert("删除房屋来源信息"+houseId);
    $.ajax({
        url: "http://localhost:8080/ShopManagement/deleteHouseSource?houseId="+houseId,
        type: "post",
        success: function (result) {
            alert("result" + JSON.stringify(result));
            if(result.result==true){
                alert("删除成功");
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/HousingSource-list.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}
//删除房屋去向信息
function deleteHousingGoDown(goHourseId) {
alert("删除房屋去向信息"+goHourseId);
    $.ajax({
        url: "http://localhost:8080/ShopManagement/deleteHousingGoDown?goHourseId="+goHourseId,
        type: "post",
        success: function (result) {
            alert("result" + JSON.stringify(result));
            if(result.result==true){
                alert("删除成功");
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/HousingGoDown_List.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}
//删除收款方信息
function deletepaymentterm(getheringId) {
alert("删除收款方信息"+getheringId);
    $.ajax({
        url: "http://localhost:8080/ShopManagement/deletepaymentterm?getheringId="+getheringId,
        type: "post",
        success: function (result) {
            alert("result" + JSON.stringify(result));
            if(result.result==true){
                alert("删除成功");
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/PaymentTerm_List.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}

//批量删除
function deleteAllTowner() {
    alert("删除楼栋信息");
}


//楼栋信息修改提交
function updaetTowerSumbit(){
    alert("楼栋信息修改提交");
    var param={};
    param.breakoutName=$("#breakoutName").val();
    param.towerCoding=$("#towerCoding").val();
    param.towerName=$("#towerName").val();
    param.towerStatus=$("#br_principal").val();
    var aa=$("#coveredArea").val()
    if(aa!=""){
        param.coveredArea=aa;
    }
    param.operatingArea=0;
    param.upFloorNumber=$("#upFloorNumber").val();
    param.downFloorNumber=$("#downFloorNumber").val();
    param.comment=$("#br_comment").val();
    param.towerImage='1111';
    param.tower_BreakoutStatus=$("#").val();
    var towerStatus;
    if($("#towerStatus1").val()!=null){
        towerStatus=$("#towerStatus1").val();
    }else if($("#towerStatus2").val()!=null){
        towerStatus=$("#towerStatus2").val();
    }
    var tower_BreakoutStatus;
    if($("#tower_BreakoutStatus1").val()!=null && $("#tower_BreakoutStatus1").val()=="信息可用"){
        tower_BreakoutStatus=1;
    }else if($("#tower_BreakoutStatus2").val()!=null && $("#tower_BreakoutStatus2").val()=="信息不可用"){
        tower_BreakoutStatus=2;
    }else if($("#tower_BreakoutStatus3").val()!=null && $("#tower_BreakoutStatus2").val()=="审核中"){
        tower_BreakoutStatus=3;
    }
    param.tower_BreakoutStatus=tower_BreakoutStatus;
    param.towerStatus=towerStatus;
    //房屋修改数据
    param.houseId=$("#houseId").val();
    param.hoseSource=$("#hoseSource").val();
    param.ProduceLabel=$("#ProduceLabel").val();
    param.propertyOwner=$("#propertyOwner").val();
    param.hourseGoDown=$("#townerName").val();
    param.purchaserName=$("#purchaserName").val();
    param.gatheringId=$("#gatheringId").val();
    //房屋去向
    param.goHourseId=$("#goHourseId").val();
    param.hourseGoDown=$("#hourseGoDown").val();
    param.townerName=$("#townerName2").val();
    param.purchaserName=$("#purchaserName2").val();
    param.tenementId=$("#tenementId").val();
    //收款方
    param.getheringId=$("#getheringId").val();
    param.gatheringName=$("#gatheringName").val();
    param.BankNo=$("#bankNo").val();
    param.accountName=$("#accountName").val();
    param.accountNumber=$("#accountNumber").val();
    alert(JSON.stringify(param));
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updateTowner",
        type:"post",
        data:param,
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
            if(result.result==true){
                if(result.data=="修改成功房屋来源"){
                    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/HousingSource-list.jsp'";
                }
                if(result.data=="修改成功楼栋"){
                    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/towner-list.jsp'";
                }
                if(result.data=="修改成功房屋去向"){
                    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/HousingGoDown_List.jsp'";
                }
                if(result.data=="修改成功收款方"){
                    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/PaymentTerm_List.jsp'";
                }
            }
        }
    });
}

function removeTowner() {
}

function xiugaiTowener(towerName) {
    alert("修改楼栋信息"+towerName);
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/townerContract-add.jsp'&&towerName="+towerName;
}

//修改楼栋信息渲染
function xiugaiTowenerShow(towerName ) {
    alert("修改楼栋信息渲染"+towerName);
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updateTownerShow?towerName="+towerName,
        type:"post",
        dataType:"json",
        success:function(result){
                     alert("result 222222"+JSON.stringify(result));
            var param={};
            $("#breakoutName").val(result.data.breakoutName);
            $("#towerCoding").val(result.data.towerCoding);
            $("#towerName").val(result.data.towerName);
            $("#coveredArea").val(result.data.coveredArea);
            $("#operatingArea").val(result.data.operatingArea);
          $("#upFloorNumber").val(result.data.upFloorNumber);
           $("#downFloorNumber").val(result.data.downFloorNumber);
          $("#br_comment").val(result.data.comment);
            param.towerImage='1111';
            if(result.data.tower_BreakoutStatus=="信息可用"){
                $("#tower_BreakoutStatus1").attr('checked','true');
            }else if(result.data.tower_BreakoutStatus=="信息不可用"){
                $("#tower_BreakoutStatus2").attr('checked','true');
            }else if(result.data.tower_BreakoutStatus=="审核中"){
                $("#tower_BreakoutStatus3").attr('checked','true');
            }
            if(result.data.towerStatus=="可租"){
                $("#towerStatus1").attr('checked','true');
            }else if(result.data.towerStatus=="不可租"){
                $("#towerStatus2").attr('checked','true');
            }
            var now4 = new Date(result.data.tower_updatetime);
            var day4 = ("0" + now4.getDate()).slice(-2);
            var month4 = ("0" + (now4.getMonth() + 1)).slice(-2);
            var today4 = now4.getFullYear()+"-"+(month4)+"-"+(day4) ;
            $("#commentdatemin").val(today4);
            var now3 = new Date(result.data.tower_updatetime);
            var day3 = ("0" + now3.getDate()).slice(-2);
            var month3 = ("0" + (now4.getMonth() + 1)).slice(-2);
            var today3 = now3.getFullYear()+"-"+(month3)+"-"+(day3) ;
            $("#commentdatemax").val(today3);
        }
    });
}
//修改房屋来源信息
function xiugaiHouseSourceLis(houseId) {
    alert("修改房屋来源信息"+houseId);
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/townerContract-add.jsp'&&houseId="+houseId;
}
//修改渲染参数判断
function checkHouseWhere(houseId) {
    var flag=false;
    if(houseId==null || houseId==""){
        alert("主键id为空");
        return  false;
    }
    return true;
}
//修改房屋来源信息渲染
function  xiugaiHouseShow(houseId) {
    alert("修改房屋来源信息渲染"+houseId);
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updateHousewhere?houseId="+houseId,
        type:"post",
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
            $("#houseId").val(result.data.houseId);
            $("#hoseSource").val(result.data.hoseSource);
            $("#ProduceLabel").val(result.data.produceLabel);
            $("#propertyOwner").val(result.data.propertyOwner);
            $("#townerName").val(result.data.hourseGoDown);
            $("#purchaserName").val(result.data.purchaserName);
            $("#gatheringId").val(result.data.gatheringId);
            var now4 = new Date(result.data.startTime);
            var day4 = ("0" + now4.getDate()).slice(-2);
            var month4 = ("0" + (now4.getMonth() + 1)).slice(-2);
            var today4 = now4.getFullYear()+"-"+(month4)+"-"+(day4) ;
            $("#startTime").val(today4);
            var now3 = new Date(result.data.outTime);
            var day3 = ("0" + now3.getDate()).slice(-2);
            var month3 = ("0" + (now4.getMonth() + 1)).slice(-2);
            var today3 = now3.getFullYear()+"-"+(month3)+"-"+(day3) ;
            $("#outTime").val(today3);
        }
    });
}
//修改房屋去向信息
function xiugaiHousingGoDown(goHourseId) {
    alert("修改房屋去向信息"+goHourseId);
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/townerContract-add.jsp'&&goHourseId="+goHourseId;
}
//修改房屋去向信息渲染
function updateChaHousingGoDown(goHourseId) {
    alert("修改房屋来源信息渲染"+goHourseId);
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updateChaHousingGoDown?goHourseId="+goHourseId,
        type:"post",
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
            $("#goHourseId").val(result.data.goHourseId);
            $("#hourseGoDown").val(result.data.hourseGoDown);
            $("#townerName2").val(result.data.townerName);
            $("#purchaserName2").val(result.data.purchaserName);
            $("#tenementId").val(result.data.tenementId);
            var now4 = new Date(result.data.startTime);
            var day4 = ("0" + now4.getDate()).slice(-2);
            var month4 = ("0" + (now4.getMonth() + 1)).slice(-2);
            var today4 = now4.getFullYear()+"-"+(month4)+"-"+(day4) ;
            $("#startTime2").val(today4);
            var now3 = new Date(result.data.outTime);
            var day3 = ("0" + now3.getDate()).slice(-2);
            var month3 = ("0" + (now4.getMonth() + 1)).slice(-2);
            var today3 = now3.getFullYear()+"-"+(month3)+"-"+(day3) ;
            $("#outTime2").val(today3);
        }
    });
}
//修改房屋去向信息
function xiugaipaymentterm(getheringId) {
    alert("修改房屋去向信息"+getheringId);
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/townerContract-add.jsp'&&getheringId="+getheringId;
}
//修改房屋去向信息渲染
function updatepaymentterm(getheringId) {
    alert("修改房屋来源信息渲染"+getheringId);
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updateChaPaymentterm?getheringId="+getheringId,
        type:"post",
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
            $("#getheringId").val(result.data.getheringId);
            $("#gatheringName").val(result.data.gatheringName);
            $("#bankNo").val(result.data.bankNo);
            $("#accountName").val(result.data.accountName);
            $("#accountNumber").val(result.data.accountNumber);
        }
    });
}