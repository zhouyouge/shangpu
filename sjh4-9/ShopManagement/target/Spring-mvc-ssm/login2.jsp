<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="statics/js/jquery-1.12.4.min.js" ></script>
<script >
    function checkParam() {

    }
    function login() {
        var userName=$("#userName").val();
        var password=$("#password").val();
        //验证参数
        var param={};
        param.userName=userName;
        param.password=password;
       /* alert(JSON.stringify(param));*/
        var loginYanzheng=false;
        $.ajax({
            url:"login",
            type:"post",
            data:param,
            dataType:"json",
            success:function(result){
                if(result.result==true&&result.flag==3){
                   /* alert("登录成功");*/
                    loginYanzheng=true;
                    location.href="index.jsp";
                }
            },err:function(result){
                alert("error"+result);
            }
        });
    }
</script>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="commons/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="commons/ace/css/login3.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/commons/md5.js"></script>
    <title>商铺管理系统后台</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <!-- load css -->
    <link rel="stylesheet" type="text/css" href="commons/photo/common/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="commons/photo/css/login.css" media="all">

    <link href="<%=request.getContextPath()%>/commons/loginYe/css/main.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="<%=request.getContextPath()%>/commons/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/commons/md5.js"></script>
<style>
    body{
        width: 100%;
        height: 500px;
    }
    .larry-login .login_txtbx{
        font-size: 14px;
        height: 35px;
        line-height: 26px;
        padding: 8px 7%;
        width: 100%;
        text-indent: 2em;
        border: none;
        background: #5cbdaa;
        color: white;
    }
</style>
</head>
<body>
<div class="layui-canvs" style="height: 400px"></div>
<div class="layui-layout layui-layout-login" >
    <h1>
        <strong>商铺管理系统后台</strong>
        <em></em>
    </h1>
    <div class="layui-user-icon larry-login" >
        <input type="text" id="userName" name="loginName" placeholder="账号"  class="login_txtbx"/>
    </div>
    <div class="layui-pwd-icon larry-login">
        <input type="text" id="password" placeholder="密码" name="loginPwd" class="login_txtbx"/>
    </div>
    <div class="layui-submit larry-login">
        <input type="button" onclick="login()" value="立即登陆" class="submit_btn"/>
    </div>
    <div class="layui-login-text">
        <p>版权归课工场所有</p>
    </div>
</div>
<script type="text/javascript" src="commons/photo/common/layui/lay/dest/layui.all.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/commons/jquery-3.2.1.js"></script>
<script type="text/javascript" src="commons/photo/js/login.js"></script>
<script type="text/javascript" src="commons/photo/jsplug/jparticle.jquery.js"></script>
<script type="text/javascript">
    $(function(){
        $(".layui-canvs").jParticle({
            background: "#141414",
            color: "#E6E6E6"
        });
    });
</script>
</body>

</html>
