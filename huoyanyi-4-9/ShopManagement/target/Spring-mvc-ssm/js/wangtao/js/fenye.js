$(function () {
    queryList(null);
    var yemian=$("#yemian").val();
/*    alert(yemian);*/
});


function queryList(param) {
    $("tbody").html("");
    var yemian=$("#yemian").val();
    //楼栋信息全查
    if(yemian=="townerList"){
        /*  alert("全查");*/
        var tiaojian;
        if (param == null) {
            /* alert("对象为空");*/
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }/* else {
        if (tiaojian !=null) {
            param.orderBy = tiaojian;
        } else {
            param.orderBy = "saleDate";
            alert("saleDate");
        }
    }*/

        /*   alert(param.orderBy);*/
        var towerName=$("#towerName").val();
        var tower_createtime=$("#datemin").val();
        var tower_updatetime=$("#datemax").val();
        if(tower_createtime!=""){
            param.tower_createtime=new Date(tower_createtime);
        }
        if(tower_updatetime!=""){
            param.tower_updatetime=new Date(tower_updatetime);
        }
        if(towerName!=null){
            param.towerName=towerName;
        }
        $.ajax({
            url:"http://localhost:8080/ShopManagement/queryTowerList",
            type:"post",
            data:param,
            dataType:"html",
            success:function(result){
              /*  alert("result"+result);*/
               $("tbody").html(result);

            }
        });
    }
    //全查分场信息
    if(yemian=="FloorList"){
        if (param == null) {
            /* alert("对象为空");*/
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        alert("楼层名称");
        /*   alert(param.orderBy);*/
        $.ajax({
            url:"http://localhost:8080/ShopManagement/queryFloorList",
            type:"post",
            data:param,
            dataType:"html",
            success:function(result){
                /*alert("result"+result);*/
                $("tbody").html(result);
            }
        });
    }

    //全查租户信息
    if(yemian=="TementList"){
        if (param == null) {
            /* alert("对象为空");*/
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        /*   alert(param.orderBy);*/
        $.ajax({
            url:"http://localhost:8080/ShopManagement/queryTenementList",
            type:"post",
            data:param,
            dataType:"html",
            success:function(result){
                alert("result"+result);
                $("tbody").html(result);
            }
        });
    }

    //全查一铺一价信息
    if(yemian=="AshopriceList"){
        if (param == null) {
            /* alert("对象为空");*/
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        var boothNumber=$("#boothNumber").val();
        var ashop_createtime=$("#datemin").val();
        var ashop_updatetime=$("#datemax").val();
        if(ashop_createtime!=""){
            param.ashop_createtime=new Date(ashop_createtime);
        }
        if(ashop_updatetime!=""){
            param.ashop_updatetime=new Date(ashop_updatetime);
        }
        if(boothNumber!=null){
            param.boothNumber=boothNumber;
            param.curPage=1;
            param.PageSize=5;
        }
      /*  alert("一铺一价全查");*/
        /*   alert(param.orderBy);*/
        $.ajax({
            url:"http://localhost:8080/ShopManagement/queryAshopriceList",
            type:"post",
            data:param,
            dataType:"html",
            success:function(result){
               /* alert("result"+result);*/
                $("tbody").html(result);
            }
        });
    }

    //全查分场信息
    if(yemian=="articleList") {
        if (param == null) {
            /* alert("对象为空");*/
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        var breakoutName=$("#breakoutName").val();
        var br_createtime=$("#datemin").val();
        var br_updatetime=$("#datemax").val();
        if(br_createtime!=""){
            param.br_createtime=new Date(br_createtime);
        }
        if(br_updatetime!=""){
            param.br_updatetime=new Date(br_updatetime);
        }
        if(breakoutName!=null){
            param.breakoutName=breakoutName;
        }
        /*alert("全查分场信息");*/
        /*   alert(param.orderBy);*/
        $.ajax({
            url: "http://localhost:8080/ShopManagement/queryBreakOutList",
            type: "post",
            data: param,
            dataType: "html",
            success: function (result) {
            /*    alert("result" + result);*/
                $("tbody").html(result);
            }
        });
    }
    //全查多经信息
    if(yemian=="Disverfied-list"){
        /*alert("多经信息全查");*/
        if (param == null) {
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        var diversifiedName=$("#diversifiedName").val();
        var diversified_createtime=$("#datemin").val();
        var diversified_updatetime=$("#datemax").val();
        if(diversified_createtime!=""){
            param.diversified_createtime=new Date(diversified_createtime);
        }
        if(diversified_updatetime!=""){
            param.diversified_updatetime=new Date(diversified_updatetime);
        }
        if(diversifiedName!=null){
            param.diversifiedName=diversifiedName;
        }
/*        alert("param:"+JSON.stringify(param));*/
        $.ajax({
            url: "http://localhost:8080/ShopManagement/queryDisversifiedList",
            type: "post",
            data: param,
            dataType: "html",
            success: function (result) {
              /*  alert("result" + result);*/
                $("tbody").html(result);
            }
        });
    }
    //房屋来源
    if(yemian=="HousingSource"){
        if (param == null) {
            /* alert("对象为空");*/
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        var hoseSource=$("#hoseSource").val();
        var startTime=$("#datemin").val();
        var outTime=$("#datemax").val();
        if(startTime!=""){
            param.startTime=new Date(startTime);
        }
        if(outTime!=""){
            param.outTime=new Date(outTime);
        }
        if(hoseSource!=null){
            param.hoseSource=hoseSource;
        }
        alert("房屋来源");
        $.ajax({
            url: "http://localhost:8080/ShopManagement/queryHouseSourceList",
            type: "post",
            data: param,
            dataType: "html",
            success: function (result) {
                alert("result" + result);
                $("tbody").html(result);
            }
        });
    }
    //房屋去向
    if(yemian=="housingGoDown"){
        if (param == null) {
            /* alert("对象为空");*/
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        var hourseGoDown=$("#hourseGoDown").val();
        var startTime=$("#datemin").val();
        var outTime=$("#datemax").val();
        if(startTime!=""){
            param.startTime=new Date(startTime);
        }
        if(outTime!=""){
            param.outTime=new Date(outTime);
        }
        if(hourseGoDown!=null){
            param.hourseGoDown=hourseGoDown;
        }
        alert("房屋去向");
        $.ajax({
            url: "http://localhost:8080/ShopManagement/queryHousingGoDownList",
            type: "post",
            data: param,
            dataType: "html",
            success: function (result) {
                alert("result" + result);
                $("tbody").html(result);
            }
        });
    }
    //收款方
    if(yemian=="paymentTerm"){
        if (param == null) {
            /* alert("对象为空");*/
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        var gatheringName=$("#gatheringName").val();
        var startTime=$("#datemin").val();
        var outTime=$("#datemax").val();
        if(startTime!=""){
            param.startTime=new Date(startTime);
        }
        if(outTime!=""){
            param.outTime=new Date(outTime);
        }
        if(gatheringName!=null){
            param.gatheringName=gatheringName;
        }
        alert("收款方");
        $.ajax({
            url: "http://localhost:8080/ShopManagement/queryPaymentTermList",
            type: "post",
            data: param,
            dataType: "html",
            success: function (result) {
                alert("result" + result);
                $("tbody").html(result);
            }
        });
    }
    //甲方合同信息管理
    if(yemian=="Townercontract"){
        if (param == null) {
            /* alert("对象为空");*/
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        var comparyTitle=$("#comparyTitle").val();
        var startTime=$("#datemin").val();
        var outTime=$("#datemax").val();
        if(startTime!=""){
            param.startTime=new Date(startTime);
        }
        if(outTime!=""){
            param.outTime=new Date(outTime);
        }
        if(comparyTitle!=null){
            param.comparyTitle=comparyTitle;
        }
        alert("甲方合同信息管理");
        $.ajax({
            url: "http://localhost:8080/ShopManagement/queryTownercontractList",
            type: "post",
            data: param,
            dataType: "html",
            success: function (result) {
                alert("result" + result);
                $("tbody").html(result);
            }
        });
    }
    //银行信息管理
    if(yemian=="BankAccount"){
        if (param == null) {
            /* alert("对象为空");*/
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        var bankName=$("#bankName").val();
        var startTime=$("#datemin").val();
        var outTime=$("#datemax").val();
        if(startTime!=""){
            param.startTime=new Date(startTime);
        }
        if(outTime!=""){
            param.outTime=new Date(outTime);
        }
        if(bankName!=null){
            param.bankName=bankName;
        }
        alert("银行信息管理");
        $.ajax({
            url: "http://localhost:8080/ShopManagement/queryBankAccountList",
            type: "post",
            data: param,
            dataType: "html",
            success: function (result) {
                alert("result" + result);
                $("tbody").html(result);
            }
        });
    }
    //开票信息管理
    if(yemian=="Bill_informationExpression"){
        if (param == null) {
            /* alert("对象为空");*/
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        var billingName=$("#billingName").val();
        var bill_createtime=$("#datemin").val();
        var bill_updatetime=$("#datemax").val();
        if(bill_createtime!=""){
            param.bill_createtime=new Date(bill_createtime);
        }
        if(bill_updatetime!=""){
            param.bill_updatetime=new Date(bill_updatetime);
        }
        if(billingName!=null){
            param.billingName=billingName;
        }
        alert("开票信息管理");
        $.ajax({
            url: "http://localhost:8080/ShopManagement/queryBillinformationExpressionList",
            type: "post",
            data: param,
            dataType: "html",
            success: function (result) {
                alert("result" + result);
                $("tbody").html(result);
            }
        });
    }
    //摊位信息全查
    if(yemian=="Booth-list"){
        if (param == null) {
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        alert("摊位信息全查");
        $.ajax({
            url: "http://localhost:8080/ShopManagement/queryBoothList",
            type: "post",
            data: param,
            dataType: "html",
            success: function (result) {
                alert("result" + result);
                $("tbody").html(result);
            }
        });
    }
}

//下一页：
function nextPage() {
 /*   alert("下一页");*/
    var curPage=$(".curPage").text();
    var totalPageCount=$(".totalPageCount").text();
    alert(totalPageCount+":"+curPage);
    if(curPage<totalPageCount){
        curPage++;
        var param={};
        param.curPage=curPage;
        /*$(".curPage").text(curPage);*/
        queryList(param);
    }else{
        alert("已经到最后一页了");
    }
}
//上一页：
function prePage() {
  /*  alert("上一页");*/
    var curPage=$(".curPage").text();
    if(curPage>1){
        curPage--;
        var param={};
        param.curPage=curPage;
        $(".curPage").text(curPage);
        queryList(param);
    }else{
        alert("已经到第一页了");
    }
}
//首页：
function firstPage() {
   /* alert("首页");*/
    var curPage=1;
    var param={};
    param.curPage=curPage;
    $(".curPage").text(curPage);
    queryList(param);
}
//末页：
function endPage() {
   /* alert("末页");*/
    var curPage=$(".curPage").text();
    var totalPageCount=$(".totalPageCount").text();
    if(curPage==totalPageCount){
    }else{
        var param={};
        param.curPage=totalPageCount;
        $(".curPage").text(totalPageCount);
        queryList(param);
    }
}

//一铺一价条件查询
function Ashopricetjchaxun() {
    alert("一铺一价条件查询");
    var param={};
    var boothNumber=$("#boothNumber").val();
    var ashop_createtime=$("#datemin").val();
    var ashop_updatetime=$("#datemax").val();
    if(ashop_createtime!=""){
        param.ashop_createtime=new Date(ashop_createtime);
    }
    if(ashop_updatetime!=""){
        param.ashop_updatetime=new Date(ashop_updatetime);
    }
    if(boothNumber!=null){
        param.boothNumber=boothNumber;
        param.curPage=1;
        param.PageSize=5;
    }
    queryList(param);
}

//多经信息条件查询
function duojingtjchaxun() {
 /*alert("多经条件查询");*/
    var param={};
    var diversifiedName=$("#diversifiedName").val();
    var diversified_createtime=$("#datemin").val();
    var diversified_updatetime=$("#datemax").val();
    if(diversified_createtime!=""){
        param.diversified_createtime=new Date(diversified_createtime);
    }
    if(diversified_updatetime!=""){
        param.diversified_updatetime=new Date(diversified_updatetime);
    }
    if(diversifiedName!=null){
        param.diversifiedName=diversifiedName;
        param.curPage=1;
        param.PageSize=5;
    }
    queryList(param);
}
//分场信息条件查询
function fenchangchaxun() {
 /*alert("多经条件查询");*/
    var param={};
    var diversifiedName=$("#breakoutName").val();
    var diversified_createtime=$("#datemin").val();
    var diversified_updatetime=$("#datemax").val();
    if(diversified_createtime!=""){
        param.diversified_createtime=new Date(diversified_createtime);
    }
    if(diversified_updatetime!=""){
        param.diversified_updatetime=new Date(diversified_updatetime);
    }
    if(diversifiedName!=null){
        param.diversifiedName=diversifiedName;
        param.curPage=1;
        param.PageSize=5;
    }
    queryList(param);
}
//甲方信息条件查询
function jiafangchaxun() {
 /*alert("多经条件查询");*/
    var param={};
    var comparyTitle=$("#comparyTitle").val();
    var diversified_createtime=$("#datemin").val();
    var diversified_updatetime=$("#datemax").val();
    if(diversified_createtime!=""){
        param.diversified_createtime=new Date(diversified_createtime);
    }
    if(diversified_updatetime!=""){
        param.diversified_updatetime=new Date(diversified_updatetime);
    }
    if(comparyTitle!=null){
        param.comparyTitle=comparyTitle;
        param.curPage=1;
        param.PageSize=5;
    }
    queryList(param);
}
//银行信息条件查询
function yinghangchaxun() {
 /*alert("多经条件查询");*/
    var param={};
    var bankName=$("#bankName").val();
    var startTime=$("#datemin").val();
    var outTime=$("#datemax").val();
    if(startTime!=""){
        param.startTime=new Date(startTime);
    }
    if(outTime!=""){
        param.outTime=new Date(outTime);
    }
    if(bankName!=null){
        param.bankName=bankName;
        param.curPage=1;
        param.PageSize=5;
    }
    queryList(param);
}
//开票信息条件查询
function kaipiaochaxun() {
 /*alert("多经条件查询");*/
    var param={};
    var billingName=$("#billingName").val();
    var bill_createtime=$("#datemin").val();
    var bill_updatetime=$("#datemax").val();
    if(bill_createtime!=""){
        param.bill_createtime=new Date(bill_createtime);
    }
    if(bill_updatetime!=""){
        param.bill_updatetime=new Date(bill_updatetime);
    }
    if(billingName!=null){
        param.billingName=billingName;
        param.curPage=1;
        param.PageSize=5;
    }
    queryList(param);
}
//房屋信息条件查询
function fangwuchaxun() {
 /*alert("多经条件查询");*/
    var param={};
    var hoseSource=$("#hoseSource").val();
    var startTime=$("#datemin").val();
    var outTime=$("#datemax").val();
    if(startTime!=""){
        param.startTime=new Date(startTime);
    }
    if(outTime!=""){
        param.outTime=new Date(outTime);
    }
    if(hoseSource!=null){
        param.hoseSource=hoseSource;
        param.curPage=1;
        param.PageSize=5;
    }
    queryList(param);
}
//房屋去向信息条件查询
function fangwuquxiang() {
 /*alert("多经条件查询");*/
    var param={};
    var hourseGoDown=$("#hourseGoDown").val();
    var startTime=$("#datemin").val();
    var outTime=$("#datemax").val();
    if(startTime!=""){
        param.startTime=new Date(startTime);
    }
    if(outTime!=""){
        param.outTime=new Date(outTime);
    }
    if(hourseGoDown!=null){
        param.hourseGoDown=hourseGoDown;
        param.curPage=1;
        param.PageSize=5;
    }
    queryList(param);
}
//收款方信息条件查询
function shoukuanchaxun() {
 /*alert("多经条件查询");*/
    var param={};
    var gatheringName=$("#gatheringName").val();
    var startTime=$("#datemin").val();
    var outTime=$("#datemax").val();
    if(startTime!=""){
        param.startTime=new Date(startTime);
    }
    if(outTime!=""){
        param.outTime=new Date(outTime);
    }
    if(gatheringName!=null){
        param.gatheringName=gatheringName;
        param.curPage=1;
        param.PageSize=5;
    }
    queryList(param);
}

//租户条件查询
function TementTiaojian() {
    alert("租户条件查询");
    var param={};
    var tenantName=$("#tenantName").val();
    var tentment_createtime=$("#datemin").val();
    var tentment_updatetime=$("#datemax").val();
    if(tentment_createtime!=""){
        param.tentment_createtime=new Date(tentment_createtime);
    }
    if(tentment_updatetime!=""){
        param.tentment_updatetime=new Date(tentment_updatetime);
    }
    if(tenantName!=null){
        param.tenantName=tenantName;
        param.curPage=1;
        param.PageSize=5;
    }
    queryList(param);
}

//摊位条件查询
function tanweitjchaxun() {
    var param={};
    var boothNumber=$("#boothNumber").val();
    var booth_createtime=$("#datemin").val();
    var booth_updatetime=$("#datemax").val();
    if(booth_createtime!=""){
        param.booth_createtime=new Date(booth_createtime);
    }
    if(booth_updatetime!=""){
        param.booth_updatetime=new Date(booth_updatetime);
    }
    if(boothNumber!=null){
        param.boothNumber=boothNumber;
        param.curPage=1;
        param.PageSize=5;
    }
    queryList(param);
}

//楼层条件查询
function Floortjchaxun() {
    var param={};
    var floorName=$("#floorName").val();
    var floor_createtime=$("#datemin").val();
    var floor_updatetime=$("#datemax").val();
    if(floor_createtime!=""){
        param.floor_createtime=new Date(floor_createtime);
    }
    if(floor_updatetime!=""){
        param.floor_updatetime=new Date(floor_updatetime);
    }
    if(floorName!=null){
        param.floorName=floorName;
        param.curPage=1;
        param.PageSize=5;
    }
    queryList(param);
}

//楼栋信息条件查询
function TownerTiaojian() {
    //楼层条件查询
        var param={};
        var towerName=$("#towerName").val();
        var tower_createtime=$("#datemin").val();
        var tower_updatetime=$("#datemax").val();
    if(tower_createtime!=""  && tower_updatetime!=""){
            param.tower_createtime=new Date(tower_createtime);
            param.tower_updatetime=new Date(tower_updatetime);
            queryList(param);
        }
        if(towerName!=null){
            param.towerName=towerName;
            param.curPage=1;
            param.PageSize=5;
        }
        queryList(param);
}

//清除时间条件查询
function cleanTime() {
    alert("租户条件查询");
    var param={};
    var kaishi=$("#datemin").val("");
    var jieshu=  $("#datemax").val("");
    //多经信息多条件查询
    var diversifiedName=$("#diversifiedName").val();
    if(diversifiedName!=null && diversifiedName!=""){
        param.diversifiedName=diversifiedName;
        queryList(param);
    }
    //摊位清除时间条件查询  boothNumber
    var boothNumber=$("#boothNumber").val();
    if(boothNumber!=null && boothNumber!=""){
        param.boothNumber=boothNumber;
        queryList(param);
    }else{
        queryList(null);
    }
    //楼层信息条件查询
    var floorName=$("#floorName").val();
    if(floorName!=null && floorName!=""){
        param.floorName=floorName;
        queryList(param);
    }else{
        queryList(null);
    }
    //楼栋信息时间条件查询清除
    var towerName=$("#towerName").val();
    if(towerName!=null && towerName!=""){
        param.towerName=towerName;
        queryList(param);
    }else{
        queryList(null);
    }
    //分场信息时间条件查询清除
    var breakoutName=$("#breakoutName").val();
    if(breakoutName!=null && breakoutName!=""){
        param.breakoutName=breakoutName;
        queryList(param);
    }else{
        queryList(null);
    }
    //条件查询
}

//addtenementsubmit
function removeTenment(){
    queryList(null);
}



//批量删除
function deleteAll(){
    alert("批量删除");
}