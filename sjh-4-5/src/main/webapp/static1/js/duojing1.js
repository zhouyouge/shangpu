function addDiversifiedSumbit() {
    alert("多经信息添加提交");
    /*    var param={};
        param.breakoutName=$("#breakoutName").val();
        param.floorName=$("#towerName").val();
        param.towerName=$("#floorName").val();
        param.diversifiedName=$("#diversifiedName").val();
        var diversifiedStatus;
        if($("#diversifiedStatus1").val()!=null){
            diversifiedStatus=$("#diversifiedStatus1").val();
        }else if($("#diversifiedStatus2").val()!=null){
            diversifiedStatus=$("#diversifiedStatus2").val();
        }
        param.diversifiedStatus=diversifiedStatus;
        param.coveredArea=$("#coveredArea").val();
        param.diversifiedType=$("#diversifiedType").val();
        var outdoors;
        if($("#outdoors1").val()!=null){
            outdoors=$("#outdoors1").val();
        }else if($("#outdoors2").val()!=null){
            outdoors=$("#outdoors2").val();
        }
        param.outdoors=outdoors;
        param.standardRent=$("#standardRent").val();
        param.commnet=$("#comment").val();
        param.diversifiedCoding=$("#diversifiedCoding").val();
        alert(JSON.stringify(param));
        $.ajax({
            url:"http://localhost:8080/ShopManagement/addDisversfied",
            type:"post",
            data:param,
      /!*      dataType:"json",*!/
            success:function(result){
                alert(result);
                alert("result"+JSON.stringify(result));
            }
        });*/

    $.ajax({
        url:"http://localhost:8080/ShopManagement/queryDisversifiedList2",
        type:"post",
        success:function(result){
            alert(result);
            alert("result"+JSON.stringify(result));
        }
    });
}