<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="../statics/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../js/wangtao/js/yetai.js" ></script>
<script>
    $(function () {
        $("#id").val("");
        $("#type").val("");
            if(${sessionScope.commercialName!=null}){
                $("#title").text("修改业态信息");
                $("#updateCommerSumbit").show();
                $("#addCommerSumbit").hide();
            var id='<%=session.getAttribute("commercialName")%>';
            $("#id").val(id);
            updateCommerShow(id);
             <%session.removeAttribute("commercialName");%>
                alert("修改2"+id);
            }else{
                alert("添加");
                $("#updateCommerSumbit").hide();
                $("#addCommerSumbit").show();
            }
    });

</script>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
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

    <title  class="title1" >新增业态信息</title>
    <meta name="keywords" content="新增一铺一价信息">
    <meta name="description" content="新增一铺一价信息">
</head>
<body>
<article class="page-container">
    <%--<form class="form form-horizontal" id="form-article-add">--%>
        <div class="form form-horizontal">
            <br/>
            <div class="title1" id="title">新增业态信息</div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>业态名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="业态名称：必填" id="commercialName" name="commercialName">
            </div>
        </div>

            <div class="row cl">
                <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>业态状态：</label>
                <div class="formControls col-xs-8 col-sm-9">
                <select class="select" id="commercialStatus">
                    <option id="commercialStatus1" value="信息可用">信息可用</option>
                    <option id="commercialStatus2" value="信息不可用">信息不可用</option>
                    <option id="commercialStatus3" value="审核中">审核中</option>
                </select>
                </div>
            </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">业态创建时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="date" class="input-text" value=""  id="cc_createDate" name="cc_createDate">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">业态修改时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="date" class="input-text" value=""  id="cc_modificationDate" name="cc_modificationDate">
            </div>
        </div>




        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                <button onClick="updateCommerSumbit();" id="updateCommerSumbit" class="btn btn-primary radius" type="button" ><i class="Hui-iconfont">&#xe632;</i> 修改并提交审核</button>
                <button onClick="addCommerSumbit();" id="addCommerSumbit" class="btn btn-primary radius" type="button" ><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
                <%--<button onClick="article_save();" class="btn btn-secondary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存草稿</button>
                --%><button onClick="removeCommer();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
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
