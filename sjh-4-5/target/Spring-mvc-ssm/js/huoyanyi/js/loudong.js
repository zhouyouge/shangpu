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
