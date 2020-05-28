$(function () {
    Yusuanquancha();
});
//预算全查
function Yusuanquancha() {
    $("tbody").html("");
    var yemian=$("#yemian").val();
    if(yemian=="Yusuan-list"){
        alert("预算全查1~6");
        var param={};
        param.nian="2020";
        $.ajax({
            url:"http://localhost:8080/ShopManagement/YusuanList",
            type:"post",
            data:param,
            dataType:"html",
            success:function(result){
                alert("result"+result);
                $("tbody").html(result);
            }
        });
    }
    if(yemian=="Yusuan-list2"){
        alert("预算全查6~12");
        var param={};
        param.nian="2020";
        $.ajax({
            url:"http://localhost:8080/ShopManagement/YusuanList2",
            type:"post",
            data:param,
            dataType:"html",
            success:function(result){
                alert("result"+result);
                $("tbody").html(result);
            }
        });
    }

}

function dianji(obj) {
    var ked = $(obj).attr('checked');
    if (ked) {
        $(obj).attr("checked", false);
    }
    if (!ked) {
        $(obj).attr("checked", true);
    }
}
function yuefenSumbit() {
    var shuzu=document.getElementsByClassName('ids');
    alert(JSON.stringify(shuzu));
    var yuefen=[];
    for(var i=0;i<shuzu.length;i++){
        obj=$(shuzu[i]);
        var ked=obj.attr('checked');
        if(ked){
            yuefen[i]=shuzu[i].value;
        }
    }
    yuefen = yuefen.filter(function(e){return e});
    alert(JSON.stringify(yuefen));
    var param={};
    for(var  i=0;i<yuefen.length;i++){
        if(yuefen[i]==1){
            param.yiYue=1;
        }
        if(yuefen[i]==2){
            param.erYue=2;
        }
        if(yuefen[i]==3){
            param.sanYue=3;
        }
        if(yuefen[i]==4){
            param.siYue=4;
        }
        if(yuefen[i]==5){
            param.wuYue=5;
        }
        if(yuefen[i]==6){
            param.liuYue=6;
        }
        if(yuefen[i]==7){
            param.qiYue=7;
        }
        if(yuefen[i]==8){
            param.baYue=8;
        }
        if(yuefen[i]==9){
            param.jiuYue=9;
        }
        if(yuefen[i]==10){
            param.shiYue=10;
        }
        if(yuefen[i]==11){
            param.shiyiYue=11;
        }
        if(yuefen[i]==12){
            param.shierYue=12;
        }
    }
    var shijian=$("#datemin").val();
    var datemin = new Date(shijian);
    var nian = datemin.getFullYear();
     if(nian!=null || nian!=""){
         param.nian=nian;
         $("tbody").html("");
         alert(JSON.stringify(param));
         var yemian=$("#yemian").val();
         if(yemian=="Yusuan-list"){
             $.ajax({
                 url:"http://localhost:8080/ShopManagement/YusuanList",
                 type:"post",
                 data:param,
                 dataType:"html",
                 success:function(result){
                     alert("result"+result);
                     $("tbody").html(result);
                 }
             });
         }else if(yemian=="Yusuan-list2"){
             $.ajax({
                 url:"http://localhost:8080/ShopManagement/YusuanList2",
                 type:"post",
                 data:param,
                 dataType:"html",
                 success:function(result){
                     alert("result"+result);
                     $("tbody").html(result);
                 }
             });
         }
     }else{
         alert("条件为空，默认返回主页");
         window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/Yusuan/Yusuanguanli.jsp'";
     }
}
//清除时间
function cleanTimeYusuan() {
    $("#datemin").val("");
}
//预算条件查询参数验证


