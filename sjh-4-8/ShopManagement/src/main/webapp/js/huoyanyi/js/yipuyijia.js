//一铺一价信息添加页面显示
function addshopPrice() {
   /* alert("一铺一价信息添加");*/
    $('#wodezhuomian').attr('src', 'fenchang/ashopPrice-add.jsp');
    $("#type").val(1);
}

//一铺一价信息添加提交
function addshopPriceSumbit() {
    /*alert("一铺一价添加提交");*/
    var  param={};
    param.annual=new Date($("#annual").val());
    param.rentHoliday=$("#rentHoliday").val();
    param.SasacGuidedPrices=$("#SasacGuidedPrices").val();
    param.marketPrice=$("#marketPrice").val();
    param.marketCompanyPricing=$("#marketCompanyPricing").val();
    param.marketHistoryPrice=$("#marketHistoryPrice").val();
    param.networkHistoryPrice=$("#networkHistoryPrice").val();
    param.boothNumber=$("#boothNumber").val();
    param.outletCompanyPricing=$("#outletCompanyPricing").val();
    param.ashop_createtime=new Date($("#ashop_createtime").val());
    param.rent=$("#rent").val();
    param.ashop_updatetime=new Date($("#ashop_updatetime").val());
    /*alert(JSON.stringify(param));*/
    $.ajax({
        url: "http://localhost:8080/ShopManagement/addAshoprice",
        type: "post",
        data: param,
        dataType: "json",
        success: function (result) {
            alert("result" + JSON.stringify(result));
        }
    });
}



function updateAshopirce(ashopId) {//
    var type=$("#type").val();
    if(type!=null){
        if(type==1){
          /*  alert("添加");*/
        }else{
            /*alert("修改界面显示");*/
            $.ajax({
                url:"http://localhost:8080/ShopManagement/updateAshopriceShow?ashopId="+ashopId,
                type:"post",
                dataType:"json",
                success:function(result){
                   /* alert("result 222222"+JSON.stringify(result));*/
                    $("#id").val(ashopId);
                   $("#rentHoliday").val(result.data.rentHoliday);
                    $("#marketPrice").val(result.data.marketPrice);
                    $("#marketCompanyPricing").val(result.data.marketCompanyPricing);
                    $("#marketHistoryPrice").val(result.data.marketHistoryPrice);
                    $("#networkHistoryPrice").val(result.data.networkHistoryPrice);
                    $("#boothNumber").val(result.data.boothNumber);
                    $("#outletCompanyPricing").val(result.data.outletCompanyPricing);
                    var SasacGuidedPrices=result.data.sasacGuidedPrices;
                    $("#SasacGuidedPrices").val(SasacGuidedPrices);
                    var now3 = new Date(result.data.ashop_createtime);
                    /* alert(now.getDate()+'-'+now.getMonth());*/
                    //格式化日，如果小于9，前面补0
                    var day3 = ("0" + now3.getDate()).slice(-2);
                    //格式化月，如果小于9，前面补0
                    var month3 = ("0" + (now3.getMonth() + 1)).slice(-2);
                    //拼装完整日期格式
                    var today3 = now3.getFullYear()+"-"+(month3)+"-"+(day3) ;
                    //完成赋值
                    $("#ashop_createtime").val(today3);
                    $("#rent").val(result.data.rent);
                    var now = new Date(result.data.ashop_updatetime);
                   /* alert(now.getDate()+'-'+now.getMonth());*/
                    //格式化日，如果小于9，前面补0
                    var day = ("0" + now.getDate()).slice(-2);
                    //格式化月，如果小于9，前面补0
                    var month = ("0" + (now.getMonth() + 1)).slice(-2);
                    //拼装完整日期格式
                    var today = now.getFullYear()+"-"+(month)+"-"+(day) ;
                    //完成赋值
                    $("#ashop_updatetime").val(today);
                    var now4 = new Date(result.data.annual);
                    var day4 = ("0" + now4.getDate()).slice(-2);
                    var month4 = ("0" + (now4.getMonth() + 1)).slice(-2);
                    var today4 = now4.getFullYear()+"-"+(month4)+"-"+(day4) ;
                    //完成赋值
                    $("#annual").val(today4);
                }
            });
        }
    }
}
function Ashopricexiugai(ashopId) {
/*alert("一铺一价修改"+ashopId);*/
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/ashopPrice-add.jsp'&&ashopId="+ashopId;

}

function deleteAshoprice(ashopId) {
    /*alert("一铺一价删除"+ashopId);*/
    $.ajax({
        url: "http://localhost:8080/ShopManagement/deleteAshoprice?ashopId="+ashopId,
        type: "post",
        success: function (result) {
            /*alert("result" + JSON.stringify(result));*/
            if(result.result==true){
                alert("删除成功");
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Ashoprice-list.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}

//提交修改申请
function updateAshopriceSumbit() {
    /*alert("修改申请提交");*/
    var  param={};
    param.ashopId=$("#id").val();
    param.annual=new Date($("#annual").val());
    param.rentHoliday=$("#rentHoliday").val();
    param.SasacGuidedPrices=$("#SasacGuidedPrices").val();
    param.marketPrice=$("#marketPrice").val();
    param.marketCompanyPricing=$("#marketCompanyPricing").val();
    param.marketHistoryPrice=$("#marketHistoryPrice").val();
    param.networkHistoryPrice=$("#networkHistoryPrice").val();
    param.boothNumber=$("#boothNumber").val();
    param.outletCompanyPricing=$("#outletCompanyPricing").val();
    param.ashop_createtime=new Date($("#ashop_createtime").val());
    param.rent=$("#rent").val();
    param.ashop_updatetime=new Date($("#ashop_updatetime").val());
    alert(JSON.stringify(param));
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updateAshoprice",
        type:"post",
        data:param,
        dataType:"json",
        success:function(result){
        /*        alert("result"+JSON.stringify(result));*/
            if(result.result==true){
                alert("修改成功");
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Ashoprice-list.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}
