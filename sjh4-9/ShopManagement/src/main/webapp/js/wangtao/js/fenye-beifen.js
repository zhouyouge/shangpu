$(function () {
    /*alert("分场信息全查");*/
    queryList(null);
});


function queryList(param) {
    $("tbody").html("");
  /*  alert("全查");*/
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
        $.ajax({
            url:"http://localhost:8080/ShopManagement/queryBreakOutList",
            type:"post",
            data:param,
            dataType:"html",
            success:function(result){
                alert("result"+result);
                $("tbody").html(result);
            }
        });
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


//添加分场信息
function addaticle2() {
    alert("跳转到分场信息添加");

}