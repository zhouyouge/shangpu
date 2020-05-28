<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="../statics/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../js/wangtao/js/AdministratorManagement.js"></script>
<script>
    $(function () {
        $("#id").val("");
        $("#type").val("");
            if(${sessionScope.userId!=null}){
                $("#updateUser").show();
                $("#addUser").hide();
                $("#title1").text("修改用户信息");
                var id=<%=session.getAttribute("userId")%>;
                updateUserShow(id);
            $("#id").val(id);
             <%session.removeAttribute("userId");%>
            }else{
                var time = new Date();
                var day = ("0" + time.getDate()).slice(-2);
                var month = ("0" + (time.getMonth() + 1)).slice(-2);
                var today = time.getFullYear() + "-" + (month) + "-" + (day);
                $("#userModificationDate").val(today);
                $("#UserCreateTime").val(today);
                $("#updateUser").hide();
                $("#addUser").show();
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

    <title  class="title1">新增用户信息</title>
    <meta name="keywords" content="新增用户信息">
    <meta name="description" content="新增用户信息">
</head>
<body>
<article class="page-container">
    <%--<form class="form form-horizontal" id="form-article-add">--%>
        <div class="form form-horizontal">
            <br/>
            <div class="title1" id="title1">新增用户信息</div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>用户名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="用户名称：必填" id="userName" name="userName">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>用户密码：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="用户密码:必填" id="password" name="password">
            </div>
        </div>

            <div class="row cl">
                <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>用户权限：</label>
                <div class="formControls col-xs-8 col-sm-9">
                    <input type="text" class="input-text" value="" placeholder="用户权限:必填，1~10整数" id="userRank" name="userRank">
                </div>
            </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">用户信息创建时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="date" class="input-text"  id="UserCreateTime" value=""   name="UserCreateTime" >
            </div>
        </div>


        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">用户信息修改时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="date" class="input-text" value=""  id="userModificationDate" name="userModificationDate">
            </div>
        </div>


        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                <button onClick="updateUserSumbit();" id="updateUser" class="btn btn-primary radius" type="submit" ><i class="Hui-iconfont">&#xe632;</i> 修改并提交审核</button>
                <button onClick="addUserSumbit();" id="addUser" class="btn btn-primary radius" type="submit" ><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
                <button onClick="removeUser();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
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
