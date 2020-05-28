$(function () {
    /*alert("分场信息全查");*/
    queryList(null);

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
        } /*else {
        tiaojian = $(".saleList option:selected").val();
        alert(tiaojian);
        if (tiaojian != 0) {
            param.orderBy = tiaojian;
        } else {
            param.orderBy = "saleDate";
            alert("saleDate");
        }
    }*/

        /*   alert(param.orderBy);*/
        if(param==null){
            var param={};
            param.curPage=1;
            param.PageSize=5;
        }
        alert("楼栋名称");
        $.ajax({
            url:"http://localhost:8080/ShopManagement/queryTowerList",
            type:"post",
            data:param,
            dataType:"html",
            success:function(result){
                alert("result"+result);
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
                alert("result"+result);
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
        alert("租户名称");
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
        alert("一铺一价全查");
        /*   alert(param.orderBy);*/
        $.ajax({
            url:"http://localhost:8080/ShopManagement/queryAshopriceList",
            type:"post",
            data:param,
            dataType:"html",
            success:function(result){
                alert("result"+result);
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
        alert("名称");
        /*   alert(param.orderBy);*/
        $.ajax({
            url: "http://localhost:8080/ShopManagement/queryBreakOutList",
            type: "post",
            data: param,
            dataType: "html",
            success: function (result) {
                alert("result" + result);
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
    //房屋来源
    if(yemian=="housingGoDown"){
        if (param == null) {
            /* alert("对象为空");*/
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
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
    //全查多经信息
    if(yemian=="Disverfied-list"){
        /*alert("多经信息全查");*/
        if (param == null) {
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        var diversifiedName=$("#email").val();
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
    if(yemian=="paymentTerm"){
        if (param == null) {
            /* alert("对象为空");*/
            param = {};
            param.curPage = 1;
            param.PageSize = 5;
        }
        var diversifiedName=$("#email").val();
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
//多经信息条件查询
function duojingtjchaxun() {
    alert("多经条件查询");
    var param={};
    var diversifiedName=$("#email").val();
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

//添加分场信息
function addaticle2() {
    alert("跳转到楼栋信息添加");
}