//楼层信息添加页面显示
function addfloor() {
  /*  alert("楼层信息添加");*/
    $('#wodezhuomian').attr('src', 'fenchang/floor-add.jsp');
}

//添加楼层信息提交
function addfloorSubmit() {
    alert("楼层信息添加提交");
  /*  var param={};
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
    alert(JSON.stringify(param));*/
    $.ajax({
        url:"http://localhost:8080/ShopManagement/addFloor",
        type:"post",
        /*data:param,*/
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
        }
    });

}
