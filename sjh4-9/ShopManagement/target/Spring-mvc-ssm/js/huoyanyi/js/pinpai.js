//品牌信息添加页面显示
function addBrandinformation() {
  /*  alert("楼层信息添加");*/
    $('#wodezhuomian').attr('src', 'fenchang/Brandinformation-add.jsp');
}

//添加楼层信息提交
function addBrandinformatio() {
    alert("品牌信息添加提交");
    var param={};
    param.brandCoding=$("#brandCoding").val();
    param.brandNameCh=$("#brandNameCh").val();
    param.brandNameEh=$("#brandNameEh").val();
    param.commercialActivities=$("#commercialActivities").val();
    param.birthplaceOfBrand=$("#birthplaceOfBrand").val();
    param.accessory="图片暂无";
    var businessNature;
    if($("#businessNature1").val()!=null){
        businessNature=$("#businessNature1").val();
    }else if($("#businessNature2").val()!=null){
        businessNature=$("#businessNature2").val();
    }else if($("#businessNature3").val()!=null){
        businessNature=$("#businessNature3").val();
    }
    param.businessNature=businessNature;
    var storeProperties;
    if($("#storeProperties1").val()!=null){
        storeProperties=$("#storeProperties1").val();
    }else if($("#storeProperties2").val()!=null){
        storeProperties=$("#storeProperties2").val();
    }
    param.storeProperties=storeProperties;
    param.officialWebsite=$("#officialWebsite").val();
    param.headquarterAddress=$("#headquarterAddress").val();
    param.brandDescription=$("#brandDescription").val();
    param.tenementId=$("#tenementId").val();
    alert(JSON.stringify(param));
    $.ajax({
        url:"http://localhost:8080/ShopManagement/addBrandinformation",
        type:"post",
        data:param,
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
        }
    });
}

//品牌信息修改
function xiugaiBrandinformation(brandId){
    alert("品牌信息修改"+brandId);
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/Brandinformation-add.jsp'&&brandId="+brandId;
}

//品牌信息修改显示
function toupdateBrandinformation(brandId) {
    alert("品牌信息修改显示"+brandId);
    $.ajax({
        url: "http://localhost:8080/ShopManagement/toupdateBrandinformation?brandId="+brandId,
        type: "post",
        dataType: "json",
        success:function (result) {
            alert(JSON.stringify(result));
            $("#brandId").val(result.data.brandId);
            $("#brandCoding").val(result.data.brandCoding);
            $("#brandNameCh").val(result.data.brandNameCh);
            $("#brandNameEh").val(result.data.brandNameEh);
            $("#commercialActivities").val(result.data.commercialActivities);
            $("#birthplaceOfBrand").val(result.data.birthplaceOfBrand);
            $("#officialWebsite").val(result.data.officialWebsite);
            if((result.data.storeProperties)=="连锁"){
                $("#storeProperties1").attr('checked','true');
            }else if((result.data.storeProperties)=="单店"){
                $("#storeProperties1").attr('checked','true');
            }
            $("#headquarterAddress").val(result.data.headquarterAddress);
            if((result.data.businessNature)=="直营"){
                $("#businessNature1").attr('checked','true');
            }else if((result.data.businessNature)=="加盟"){
                $("#businessNature2").attr('checked','true');
            }else if((result.data.businessNature)=="个体"){
                $("#businessNature3").attr('checked','true');
            }
            $("#brandDescription").val(result.data.brandDescription);
            $("#accessory").val(result.data.accessory);
            $("#tenementId").val(result.data.tenementId);
        }
    });
}


//品牌信息修改提交
function updaetBrandinformation() {
    alert("品牌信息修改提交");
    var param={};
    param.brandId=$("#brandId").val();
    param.brandCoding=$("#brandCoding").val();
    param.brandNameCh=$("#brandNameCh").val();
    param.brandNameEh=$("#brandNameEh").val();
    param.commercialActivities=$("#commercialActivities").val();
    param.birthplaceOfBrand=$("#birthplaceOfBrand").val();
    param.accessory="图片暂无";
    var businessNature;
    if($("#businessNature1").val()!=null){
        businessNature=$("#businessNature1").val();
    }else if($("#businessNature2").val()!=null){
        businessNature=$("#businessNature2").val();
    }else if($("#businessNature3").val()!=null){
        businessNature=$("#businessNature3").val();
    }
    param.businessNature=businessNature;
    var storeProperties;
    if($("#storeProperties1").val()!=null){
        storeProperties=$("#storeProperties1").val();
    }else if($("#storeProperties2").val()!=null){
        storeProperties=$("#storeProperties2").val();
    }
    param.storeProperties=storeProperties;
    param.officialWebsite=$("#officialWebsite").val();
    param.headquarterAddress=$("#headquarterAddress").val();
    param.brandDescription=$("#brandDescription").val();
    param.tenementId=$("#tenementId").val();
    alert(JSON.stringify(param));
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updaetBrandinformation",
        type:"post",
        data:param,
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
            if(result.result==true){
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Brandinformation_List.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}

//品牌信息删除
function deleteBrandinformation(brandId){
    alert("品牌信息删除"+brandId);
    $.ajax({
        url: "http://localhost:8080/ShopManagement/deleteBrandinformation?brandId="+brandId,
        type: "post",
        success: function (result) {
            alert("result" + JSON.stringify(result));
            if(result.result==true){
                alert("删除成功");
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Brandinformation_List.jsp'";
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