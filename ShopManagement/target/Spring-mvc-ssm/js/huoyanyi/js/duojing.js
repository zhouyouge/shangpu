//多经信息添加页面显示
function adddiversified() {
   /* alert("多经信息添加");*/
    $("#type").val(1);
    $('#wodezhuomian').attr('src', 'fenchang/diversified-add.jsp');
}
//多经信息添加提交

function addDiversifiedSumbit(type) {
   /* alert("多经信息添加提交"+type);*/
    var param={};
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
  /*  alert(JSON.stringify(param));*/
    $.ajax({
        url:"http://localhost:8080/ShopManagement/addDisversfied",
        type:"post",
        data:param,
        dataType:"json",
        success:function(result){
         /*   alert(result);*/
          /*  alert("result"+JSON.stringify(result));*/
            if(result.result==true){
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Disverfied-list.jsp'";
            }
        }
    });
}

//提交修改申请
function updateDiversifiedSumbit() {
   /* alert("修改申请提交");*/
    var param={};
    param.boothId=$("#id").val();
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
  /*  alert(JSON.stringify(param));*/
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updateDisverfied",
        type:"post",
        data:param,
        dataType:"json",
        success:function(result){
        /*    alert("result"+JSON.stringify(result));*/
            if(result.result==true){
                alert("修改成功");
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Disverfied-list.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}

function updateDiversified(boothId) {//
    /* alert("查询修改多经信息111:"+boothId);*/
    var type=$("#type").val();
    if(type!=null){
        if(type==1){
         /*   alert("添加");*/
        }else{
              /*alert("修改界面显示");*/
            $.ajax({
                url:"http://localhost:8080/ShopManagement/updateDisverfiedShow?boothId="+boothId,
                type:"post",
                dataType:"json",
                success:function(result){
           /*         alert("result 222222"+JSON.stringify(result));*/
                    var breakoutName= result.data.breakoutName;
                    $("input:radio[value=breakoutName]").attr('checked','true');
                    var towerName=result.data.towerName;
                    $("input:radio[value=towerName]").attr('checked','true');
                    var floorName=result.data.floorName;
                    $("input:radio[value=floorName]").attr('checked','true');
                    var diversifiedStatus=result.data.diversifiedStatus;
                    $("input:radio[value=diversifiedStatus]").attr('checked','true');
                    $("#diversifiedName").val(result.data.diversifiedName);
                    $("#diversifiedType").val(result.data.diversifiedType);
                    var coveredArea=result.data.coveredArea;
                    $("#coveredArea").val(coveredArea);
                    var outdoors=result.data.outdoors;
                    $("input:radio[value=outdoors]").attr('checked','true');
                    $("#standardRent").val(result.data.standardRent);
                    var commnet=result.data.commnet;
                    $("#comment").val(commnet);
                    var diversifiedCoding=result.data.diversifiedCoding;
                    $("#diversifiedCoding").val(diversifiedCoding);
                }
            });
        }
    }
}

//修改多经信息
function xiugai(boothId) {
       /*alert("修改多经信息:fenye"+boothId);*/
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/diversified-add.jsp'&&boothId="+boothId;
}

//删除多经信息
function deleteDisverfied(boothId){
    /*alert("删除多经信息"+boothId);*/
    $.ajax({
        url: "http://localhost:8080/ShopManagement/deleteDisverfied?boothId="+boothId,
        type: "post",
        success: function (result) {
            alert("result" + JSON.stringify(result));
            if(result.result==true){
                alert("删除成功");
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Disverfied-list.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}



