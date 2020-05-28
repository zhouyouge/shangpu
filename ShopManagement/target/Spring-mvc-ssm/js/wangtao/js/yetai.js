//业态全查
function getCommers() {
    /*alert("全查业态");*/
    $('#wodezhuomian').attr('src', 'yetai/member-list.jsp');
}

//业态添加界面
function addCommer() {
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='yetai/Commer-add.jsp'";
}
//业态信息添加提交
function addCommerSumbit() {
    var param={};
    param.commercialName=$("#commercialName").val();
    if($("#commercialStatus").val()=="信息可用"){
        param.commercialStatus=1;
    }
    if($("#commercialStatus").val()=="信息不可用"){
        param.commercialStatus=2;
    }
    if($("#commercialStatus").val()=="审核中"){
        param.commercialStatus=3;
    }
    var  chuangjian=new Date($("#cc_createDate").val());
    var  xiugai=new Date($("#cc_modificationDate").val());
    param.cc_createDate=chuangjian;
    param.cc_modificationDate=xiugai;
    alert(JSON.stringify(param));
    $.ajax({
        url:"http://localhost:8080/ShopManagement/addCommer",
        type:"post",
        data:param,
        dataType:"json",
        success:function(result){
              alert("result"+JSON.stringify(result));
            if(result.result==true){
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='yetai/member-list.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}

//跳转至修改页面
function xiugaiCommer(commercialName) {
    alert("修改页面显示"+commercialName);
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='yetai/Commer-add.jsp'&&commercialName="+commercialName;
}
//修改业态信息渲染
function updateCommerShow(commercialName) {
   alert("修改数据渲染"+commercialName);
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updateCommerShow?commercialName="+commercialName,
        type:"post",
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
            if(result.result==true){
                var param={};
                $("#id").val(result.data.commercialId);
               $("#commercialName").val(result.data.commercialName);
                if((result.data.commercialStatus)==1){
                    $("#commercialStatus1").attr('checked','true');
                }
                if((result.data.commercialStatus)==2){
                    $("#commercialStatus2").attr('checked','true');
                }
                if((result.data.commercialStatus)==3){
                    $("#commercialStatus3").attr('checked','true');
                }
                var now4 = new Date(result.data.cc_createDate);
                var day4 = ("0" + now4.getDate()).slice(-2);
                var month4 = ("0" + (now4.getMonth() + 1)).slice(-2);
                var today4 = now4.getFullYear()+"-"+(month4)+"-"+(day4) ;
                $("#cc_createDate").val(today4);
                var now3 = new Date(result.data.cc_modificationDate);
                var day3 = ("0" + now3.getDate()).slice(-2);
                var month3 = ("0" + (now4.getMonth() + 1)).slice(-2);
                var today3 = now3.getFullYear()+"-"+(month3)+"-"+(day3) ;
                $("#cc_modificationDate").val(today3);
                }else{
                if(result.data=="该业态正在使用中，无法修改"){
                    alert(result.data);
                    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='yetai/member-list.jsp'";
                }else{
                    alert(result.data);
                }
            }
        }
    });


}

//取消添加信息
function removeCommer() {
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='Commer-add.jsp'";
}
//业态信息修改提交
function updateCommerSumbit() {
    var param={};
    param.commercialId=$("#id").val();
    param.commercialName=$("#commercialName").val();
    if($("#commercialStatus").val()=="信息可用"){
        param.commercialStatus=1;
    }
    if($("#commercialStatus").val()=="信息不可用"){
        param.commercialStatus=2;
    }
    if($("#commercialStatus").val()=="审核中"){
        param.commercialStatus=3;
    }
    var  chuangjian=new Date($("#cc_createDate").val());
    var  xiugai=new Date($("#cc_modificationDate").val());
    param.cc_createDate=chuangjian;
    param.cc_modificationDate=xiugai;
    alert(JSON.stringify(param));
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updateCommer",
        type:"post",
        data:param,
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
            if(result.result==true){
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='yetai/member-list.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}

//删除业态
function deleteCommer(commercialId,commercialName) {
    alert("删除业态："+commercialId+commercialName);
    $.ajax({
        url:"http://localhost:8080/ShopManagement/deleteCommer?commercialId="+commercialId+"&&commercialName="+commercialName,
        type:"post",
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
            if(result.result==true){
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='yetai/member-list.jsp'";
            }else{
                if(result.data=="该业态正在使用中，无法删除"){
                    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='yetai/member-list.jsp'";
                }else{
                    alert(result.data);
                }
            }
        }
    });
}
