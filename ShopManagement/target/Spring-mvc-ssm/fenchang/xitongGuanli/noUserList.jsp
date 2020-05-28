<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="../../statics/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../../js/wangtao/js/AdministratorManagement.js"></script>
<script>
	$(function () {
		var yemian=$("#yemian").val();
		if(yemian=="noUserList"){
			$("#aa").css({"color":"#0C0C0C","margin":"0","display":"block"});
		}

	})
</script>
<!DOCTYPE HTML>
<html>
<head>
	<style>
	</style>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<![endif]-->
	<link rel="stylesheet" type="text/css" href="../../css/fenye.css" />
	<link rel="stylesheet" type="text/css" href="../../css/min.css" />
	<link rel="stylesheet" type="text/css" href="../../css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="../../css/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="../../css/skin.css" id="skin" />
<!--[if IE 6]>
	<script type="text/javascript" src="../../js/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>用户管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span> 用户管理<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<%--<div class="text-c">
		<input  type="text" class="input-text" style="width:250px" placeholder="输入一铺一价名称" id="boothNumber"  name="">
		<button type="button" id="qingchuTime"  class="btn btn-success radius" onclick="cleanTime()" name="">清除时间</button>
		<button type="submit" class="btn btn-success radius" id="" name="" onclick="Ashopricetjchaxun()"><i class="Hui-iconfont">&#xe665;</i> 搜一铺一价</button>
	</div>--%>
	<div id="div" class="cl pd-5 bg-1 bk-gray mt-20">
		<span class="l">
			<a href="javascript:;" onclick="deleteUserAll()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
		<a href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/User-add.jsp'"  class="btn btn-primary radius" target="_parent">
			<i class="Hui-iconfont">&#xe600;</i> 添加用户信息
		</a>
					<a  href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/noUserList.jsp'"  class="btn btn-primary radius" target="_parent">
			<span id="aa">未启用用户信息全查</span>
		</a>
				<a  href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/UserList.jsp'"  class="btn btn-primary radius" target="_parent">
			<span id="bb">已启用用户信息全查</span>
		</a>
		</span>
		<span class="r"></span>
	</div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-hover table-bg table-sort">
			<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="110">用户ID</th>
				<th width="110">用户名称</th>
				<th width="110">用户密码</th>
				<th width="110">用户权限</th>
				<th width="110">用户创建时间</th>
				<th width="110">用户修改时间</th>
				<th width="110">操作</th>
			</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>
</div>
<div id="hidden5">
	<input  type="hidden" value="noUserList" id="yemian"/>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../js/layer.js"></script>
<script type="text/javascript" src="../../js/H-ui.min.js"></script>
<script type="text/javascript" src="../../js/H-ui.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../js/jquery.dataTables.min.js"></script>
<script type="text/javascript">
</script>
</body>
</html>