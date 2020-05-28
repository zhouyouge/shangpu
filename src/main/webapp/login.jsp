
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <jsp:include page="WEB-INF/commons/commons.jsp"></jsp:include>
</head>
<body>
<div class="layui-canvs"></div>
<div class="layui-layout layui-layout-login">
    <h1>
        <strong>商铺管理系统后台</strong>
        <em></em>
    </h1>
    <div class="layui-user-icon larry-login">
        <input type="text" id="loginName" name="loginName" placeholder="账号"  class="login_txtbx"/>
    </div>
    <div class="layui-pwd-icon larry-login">
        <input type="password" id="loginPwd" placeholder="密码" name="loginPwd" class="login_txtbx"/>
    </div>
    <div class="layui-submit larry-login">
        <input type="button" onclick="login()" value="立即登陆" class="submit_btn"/>
        <%--<input type="button"onclick="showAddDiv()" value="立即注册"/>--%>
    </div>
    <div class="layui-submit larry-login">
        <input type="button" onclick="showAddDiv()" value="立即注册"  class="btn btn-primary" style="width: 250px"/>
    </div>
    <div class="layui-login-text">
        <p>© 2020-3-28 Larry 版权极光所有</p>
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

<div id="zengJiaBiaoDan" style="display: none">
    <form class="form-horizontal" id="userList">
        <div class="form-group">
            <label  class="col-sm-2 control-label">账号</label>
            <div class="col-sm-10">
                <input type="text" name="username"  class="form-control" >
            </div>
        </div>
        <div class="form-group">
            <label  class="col-sm-2 control-label">真实姓名</label>
            <div class="col-sm-10">
                <input type="text" name="realName" id="realName" class="form-control"  maxlength="50"  placeholder="请输入真实姓名">
            </div>
        </div>
        <div class="form-group">
            <label  class="col-sm-2 control-label">密码</label>
            <div class="col-sm-10">
                <input type="text" name="password"  class="form-control" >
            </div>
        </div>
        <div class="form-group">
            <label  class="col-sm-2 control-label">生日</label>
            <div class="col-sm-10">
                <input type="date"  name="birthday"  class="form-control" >
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2">性别:</label>
            <div class="col-sm-10">
                <label class="radio-inline ">
                    <input type="radio" name="sex"  value="1" checked/>男
                </label>
                <label class="radio-inline">
                    <input type="radio" name="sex"  value="2" />女
                </label>
            </div>
        </div>
        <div class="form-group">
            <label  class="col-sm-2 control-label">电话</label>
            <div class="col-sm-10">
                <input type="text"  name="telphone"  class="form-control" >
            </div>
        </div>
        <div class="form-group">
            <label  class="col-sm-2 control-label">个人头像</label>
            <div class="col-sm-10">
                <input type="file" id="imgid"  name="userPhoto"  class="form-control" >
                <input type="hidden" id="sss" name="imgPath">
            </div>
        </div>
        <div class="form-group">
            <label  class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="button" value="增加" onclick="addUser()" class="btn btn-success">
            </div>
        </div>
    </form>
</div>
</body>
<script type="text/javascript">
    var addBootbox;
    function showAddDiv() {

        //获取指定的模板
        var html=$("#zengJiaBiaoDan").html();
        addBootbox=bootbox.dialog({
            title:"注册信息",
            message:html
        });
        $("#imgid",addBootbox).fileinput({
            language: 'zh', //设置语言
            uploadUrl:"<%=request.getContextPath()%>/LoginController/toImgPath", //上传的地址
            browseClass:"btn btn-success", //按钮样式
            showCaption:false,//是否显示标题
            dropZoneEnabled: false//是否显示拖拽区域
        }).on("fileuploaded", function(e, data, previewiId, index) {
            $("#sss",addBootbox).val(data.response.fileimg);
        });

        $("#userList",addBootbox).bootstrapValidator({
            feedbackIcons: {//相关提示图表
                valid: 'glyphicon glyphicon-ok',//验证通过
                invalid: 'glyphicon glyphicon-remove',//验证失败
                validating: 'glyphicon glyphicon-refresh'//验证时
            },fields:{
                username:{
                    validators:{//验证要求
                        notEmpty:{
                            message:"账号不能为空"
                        },
                        remote:{
                                        url:"/LoginController/checkedByName",
                                        message:'用户名已存在',
                                        delay:1000,
                                        type:'POST',
                                        data:function (validator) {
                                            return{
                                    username:$("input[name=username]").val(),
                                }
                            }
                        },stringLength: {
                            min:3,
                            max:8,
                            message: '账号长度必须在3到8位之间'
                        }
                    }
                },
                password:{
                    validators:{//验证要求
                        notEmpty:{
                            message:"密码不能为空"
                        },regexp: {
                            //
                            regexp: /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,20}$/,
                            message: '密码至少包含 数字和英文，长度6-20'
                        }
                    }
                }
            }
        })
    };
    function addUser() {
        $.post({
            url: "<%=request.getContextPath()%>/LoginController/addDeptUser",
            dataType:"json",
            data: $("#userList",addBootbox).serialize(),
            success: function (result) {
                window.location.reload();
            },
            error: function () {
                alert("增加失败");
            }
        })

    }
    function login() {
            var name=$("#loginName").val();
            var password=$("#loginPwd").val();
            $.post({
                url:"<%=request.getContextPath()%>/login",
                data:{
                    "name":name,
                    "password":password
                },
                dataType:"json",
                success:function (rs) {
                    if(rs.code!=5){
                        alert(rs.remark);
                    }else{
                     alert("登陆成功");
                     location.href="index.jsp"
                    }
                },error:function () {
                    bootbox.alert("登陆失败")
                }
            });
    }
</script>
</html>
