<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="../statics/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../js/huoyanyi/js/yipuyijia.js" ></script>
<script>
    $(function () {
        $("#id").val("");
        $("#type").val("");
            var id=<%=session.getAttribute("ashopId")%>;
            $("#type").val(<%request.getAttribute("type");%>);
            if(id!=null){
            $("#id").val(id);
            $("#updateAshopirce").show();
            $("#addAshoprice").hide();
            $("#title1").text("修改一铺一价信息");
            updateAshopirce(id);
             <%session.removeAttribute("ashopId");%>
            }else{
                $("#updateAshopirce").hide();
                $("#addAshoprice").show();
            }
    });

</script>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
    <style>
    /*    #biaoti{
            background-color: rgba(0,176,240,0.5);width: 1158px;
            height:25px; line-height: 25px;
            font-size: 20px; font-weight: bold;
            text-align: center;
        }*/
 /*       select{
            font-size: 14px;
            box-sizing: border-box;
            cursor: pointer;
            line-height: normal;
            font-weight: normal;
            width: 100%;
            white-space: nowrap;
        }*/
    </style>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="/favicon.ico" >
    <link rel="Shortcut Icon" href="/favicon.ico" />
    <%--<!--[if lt IE 9]>
    <script type="text/javascript" src="lib/html5shiv.js"></script>
    <script type="text/javascript" src="lib/respond.min.js"></script>
    <![endif]-->--%>
    <link rel="stylesheet" type="text/css" href="../css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="../css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="../css/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="../css/skin.css" id="skin" />
    <%--自己的css样式--%>
    <link rel="stylesheet" type="text/css" href="../css/wangtao/selectxiala.css"  />
    <%--自己的css样式--%>
    <%--<link rel="stylesheet" type="text/css" href="css/style.css" />--%>
    <!--[if IE 6]>
    <script type="text/javascript" src="../js/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <!--/meta 作为公共模版分离出去-->

    <title  class="title1">新增一铺一价信息</title>
    <meta name="keywords" content="新增一铺一价信息">
    <meta name="description" content="新增一铺一价信息">
</head>
<body>
<article class="page-container">
    <%--<form class="form form-horizontal" id="form-article-add">--%>
        <div class="form form-horizontal">
            <br/>
            <div class="title1" class="title1">新增一铺一价信息</div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>年度：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="date" class="input-text" value="" placeholder="年度：必填" id="annual" name="annual">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>免租期：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="免租期：整数:必填" id="rentHoliday" name="rentHoliday">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">国资委指导价(m2/天)：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text"  id="SasacGuidedPrices" value=""  placeholder="国资委指导价：保留两位:选填"  name="SasacGuidedPrices" >
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">周边市场价(m2/天)：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="周边市场价：保留两位:选填" id="marketPrice" name="marketPrice">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">菜场公司定价(m2/天)：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="菜场公司定价：保留两位:选填" id="marketCompanyPricing" name="marketPrice">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">网点公司定价(m2/天)：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="网点公司定价：保留两位:选填" id="outletCompanyPricing" name="marketPrice">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">菜场历史合同价(m2/天)：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="菜场历史合同价：保留两位:选填" id="marketHistoryPrice" name="marketPrice">
            </div>
        </div>


        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">网点历史合同价(m2/天)：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="网点历史合同价：保留两位:选填" id="networkHistoryPrice" name="marketPrice">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">租金(m2/天)：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="网点历史合同价：保留两位:必填，默认为国资委指导价" id="rent" name="rent">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">创建时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="date" class="input-text" value=""  id="ashop_createtime" name="ashop_createtime">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">修改时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="date" class="input-text" value=""  id="ashop_updatetime" name="ashop_updatetime">
            </div>
        </div>


        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>摊位号：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="摊位号，必填：下拉选取" id="boothNumber" name="articletitle2">
            </div>
        </div>

        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                <button onClick="updateAshopriceSumbit();" id="updateAshopirce" class="btn btn-primary radius" type="submit" ><i class="Hui-iconfont">&#xe632;</i> 修改并提交审核</button>
                <button onClick="addshopPriceSumbit();" id="addAshoprice" class="btn btn-primary radius" type="submit" ><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
                <%--<button onClick="article_save();" class="btn btn-secondary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存草稿</button>
                --%><button onClick="removeIframe();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
            </div>
        </div>
        </div>
    <%--</form>--%>
</article>
<div id="hidden">
    <input  type="hidden" id="type" value=""/>
    <input  type="hidden" id="id" value=""/>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/layer.js"></script>
<script type="text/javascript" src="../js/H-ui.min.js"></script>
<script type="text/javascript" src="../statics/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->


<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../js/WdatePicker.js"></script>
<script type="text/javascript" src="../js/jquery.validate.js"></script>
<script type="text/javascript" src="../js/validate-methods.js"></script>
<script type="text/javascript" src="../js/messages_zh.js"></script>
<script type="text/javascript" src="../js/webuploader.min.js"></script>
<script type="text/javascript" src="../js/ueditor.config.js"></script>
<script type="text/javascript" src="../js/ueditor.all.min.js"> </script>
<script type="text/javascript" src="../js/zh-cn.js"></script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>
