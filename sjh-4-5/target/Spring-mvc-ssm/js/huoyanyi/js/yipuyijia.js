//一铺一价信息添加页面显示
function addshopPrice() {
   /* alert("一铺一价信息添加");*/
    $('#wodezhuomian').attr('src', 'fenchang/ashopPrice-add.jsp');
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
    alert(JSON.stringify(param));
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
