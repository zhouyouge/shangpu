//楼层信息添加页面显示
function addfloor() {
  /*  alert("楼层信息添加");*/
    $('#wodezhuomian').attr('src', 'fenchang/floor-add.jsp');
}

//添加楼层信息提交
function addfloorSubmit() {
    alert("楼层信息添加提交");
    var param={};
    param.breakoutName=$("#breakoutName").val();
    param.towerName=$("#towerName").val();
    param.floorName=$("#floorName").val();
    param.floorCoding=$("#floorCoding").val();
    param.coveredArea=$("#coveredArea").val();
    param.operatingArea="0";
    var PropertyType;
    if($("#PropertyType1").val()!=null&&$("#PropertyType1").val()=="产权"){
        PropertyType="1";
    }else if($("#PropertyType2").val()!=null&&$("#PropertyType2").val()=="使用权"){
        PropertyType="2";
    }else if($("#PropertyType3").val()!=null&&$("#PropertyType3").val()=="无证"){
        PropertyType="3";
    }
    param.PropertyType=PropertyType;
    var floorStatus;
    if($("#floorStatus1").val()!=null&&$("#floorStatus1").val()=="可租"){
        floorStatus=1;
    }else if($("#floorStatus2").val()!=null&&$("#floorStatus2").val()=="不可组"){
        floorStatus=2;
    }
    param.floorStatus=floorStatus;
    param.commnet=$("#br_comment").val();
    param.floorImage='1111';
    if($("#towerStatus1").val()!=null){
        towerStatus=$("#towerStatus1").val();
    }else if($("#towerStatus2").val()!=null){
        towerStatus=$("#towerStatus2").val();
    }
    var floor_updatetime=new Date($("#commentdatemin").val());
    param.floor_updatetime=floor_updatetime;
    var floor_createtime=new Date($("#commentdatemax").val());
    param.floor_createtime=floor_createtime;

    var floor_BreakoutStatus;
    if($("#br_operationalRegime1").val()!=null&&$("#br_operationalRegime1").val()=="信息可用"){
        floor_BreakoutStatus=1;
    }else if($("#br_operationalRegime2").val()!=null&&$("#br_operationalRegime2").val()=="信息不可用"){
        floor_BreakoutStatus=2;
    }else if($("#br_operationalRegime3").val()!=null&&$("#br_operationalRegime3").val()=="审核中"){
        floor_BreakoutStatus=3;
    }
    param.floor_BreakoutStatus=floor_BreakoutStatus;
    alert(JSON.stringify(param));
    $.ajax({
        url:"http://localhost:8080/ShopManagement/addFloor",
        type:"post",
        data:param,
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
        }
    });
}

//楼层信息修改
function xiugaiFloor(floorName){
    alert("楼层信息修改"+floorName);
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/floor-add.jsp'&&floorName="+floorName;
}

//楼层信息修改显示
function xiugaiFloorShow(floorName) {
    alert("楼层信息修改显示"+floorName);
    $.ajax({
        url: "http://localhost:8080/ShopManagement/updateFloorShow?floorName="+floorName,
        type: "post",
        dataType: "json",
        success:function (result) {
            alert(JSON.stringify(result));
            $("#id").val(result.data.boothNumber);
            $("#breakoutName").val(result.data.breakoutName);
            $("#towerName").val(result.data.towerName);
            $("#floorName").val(result.data.floorName);
            $("#floorCoding").val(result.data.floorCoding);
            $("#coveredArea").val(result.data.coveredArea);
            $("#operatingArea").val(result.data.operatingArea);
            if((result.data.floorStatus)!="可租"){
                $("#floorStatus1").attr('checked','true');
            }else if((result.data.floorStatus)!="不可租"){
                $("#floorStatus2").attr('checked','true');
            }
            $("#PropertyType").val(result.data.PropertyType);
            if((result.data.PropertyType)!="产权"){
                $("#PropertyType1").attr('checked','true');
            }else if((result.data.PropertyType)!="使用权"){
                $("#PropertyType2").attr('checked','true');
            }else if((result.data.PropertyType)!="无证"){
                $("#PropertyType3").attr('checked','true');
            }
            $("#br_comment").val(result.data.commnet);
            $("#floorImage").val(result.data.floorImage);
            $("#floor_BreakoutStatus").val(result.data.floor_BreakoutStatus);
            var now4 = new Date(result.data.floor_createtime);
            var day4 = ("0" + now4.getDate()).slice(-2);
            var month4 = ("0" + (now4.getMonth() + 1)).slice(-2);
            var today4 = now4.getFullYear()+"-"+(month4)+"-"+(day4) ;
            $("#commentdatemin").val(today4);
            var now3 = new Date(result.data.floor_updatetime);
            var day3 = ("0" + now3.getDate()).slice(-2);
            var month3 = ("0" + (now4.getMonth() + 1)).slice(-2);
            var today3 = now3.getFullYear()+"-"+(month3)+"-"+(day3) ;
            $("#commentdatemax").val(today3);
        }
    });
}


//楼层信息修改提交
function updatefloorSubmit() {
    alert("楼层信息修改提交");
    var param={};
    param.breakoutName=$("#breakoutName").val();
    param.towerName=$("#towerName").val();
    param.floorName=$("#floorName").val();
    param.floorCoding=$("#floorCoding").val();
    param.coveredArea=$("#coveredArea").val();
    param.operatingArea="0";
    var PropertyType;
    if($("#PropertyType1").val()!=null&&$("#PropertyType1").val()=="产权"){
        PropertyType="1";
    }else if($("#PropertyType2").val()!=null&&$("#PropertyType2").val()=="使用权"){
        PropertyType="2";
    }else if($("#PropertyType3").val()!=null&&$("#PropertyType3").val()=="无证"){
        PropertyType="3";
    }
    param.PropertyType=PropertyType;
    var floorStatus;
    if($("#floorStatus1").val()!=null&&$("#floorStatus1").val()=="可租"){
        floorStatus=1;
    }else if($("#floorStatus2").val()!=null&&$("#floorStatus2").val()=="不可组"){
        floorStatus=2;
    }
    param.floorStatus=floorStatus;
    param.commnet=$("#br_comment").val();
    param.floorImage='1111';
    if($("#towerStatus1").val()!=null){
        towerStatus=$("#towerStatus1").val();
    }else if($("#towerStatus2").val()!=null){
        towerStatus=$("#towerStatus2").val();
    }
    var floor_updatetime=new Date($("#commentdatemin").val());
    param.floor_updatetime=floor_updatetime;
    var floor_createtime=new Date($("#commentdatemax").val());
    param.floor_createtime=floor_createtime;

    var floor_BreakoutStatus;
    if($("#br_operationalRegime1").val()!=null&&$("#br_operationalRegime1").val()=="信息可用"){
        floor_BreakoutStatus=1;
    }else if($("#br_operationalRegime2").val()!=null&&$("#br_operationalRegime2").val()=="信息不可用"){
        floor_BreakoutStatus=2;
    }else if($("#br_operationalRegime3").val()!=null&&$("#br_operationalRegime3").val()=="审核中"){
        floor_BreakoutStatus=3;
    }
    param.floor_BreakoutStatus=floor_BreakoutStatus;
    alert(JSON.stringify(param));
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updateFloor",
        type:"post",
        data:param,
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
            if(result.result==true){
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Floor-list.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}

//楼层信息删除
function deleteFloor(floorName){
    alert("楼层信息删除"+floorName);
    $.ajax({
        url: "http://localhost:8080/ShopManagement/deleteFloor?floorName="+floorName,
        type: "post",
        success: function (result) {
            alert("result" + JSON.stringify(result));
            if(result.result==true){
                alert("删除成功");
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Floor-list.jsp'";
            }else{
                alert(result.data);
            }
        }
    });

}

//取消添加
function removeFloor() {
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/floor-add.jsp'";
}