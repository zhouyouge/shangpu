<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="../../statics/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../../js/wangtao/js/fenye.js"></script>
<script type="text/javascript" src="../../js/huoyanyi/js/zuhu.js"></script>
<!DOCTYPE HTML>
<html>
<head>
	<meta charset="utf-8">
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<link rel="stylesheet" type="text/css" href="../../css/fenye.css" />
	<link rel="stylesheet" type="text/css" href="../../css/min.css" />
	<link rel="stylesheet" type="text/css" href="../../css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="../../css/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="../../css/skin.css" id="skin" />
	<!--[if IE 6]>
	<script type="text/javascript" src="../../js/DD_belatedPNG_0.0.8a-min.js" ></script>
	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<title>租户信息管理</title>
</head>
<body>
<nav class="breadcrumb">
	<i class="Hui-iconfont">&#xe67f;</i>
	首页
	<span class="c-gray en">&gt;</span> 数据管理
	<span class="c-gray en">&gt;
	</span>租户信息管理
	<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" >
	<i class="Hui-iconfont">&#xe68f;</i>
</a></nav>
<div class="page-container">
	<div class="text-c"> 日期范围：
		<input type="date" id="datemin" class="input-text Wdate" style="width:120px;">
		<input type="date"  id="datemax" class="input-text Wdate" style="width:120px;">
		<input type="text" class="input-text" style="width:250px" placeholder="输入租户名称" id="tenantName" name="tenantName">
		<button type="button" id="qingchuTime"  class="btn btn-success radius" onclick="cleanTime()" name="">清除时间</button>
		<button type="button" id="TementTiaojian" class="btn btn-success radius" onclick="TementTiaojian()">
			<i class="Hui-iconfont" >&#xe665;</i> 搜租户
		</button>
	</div>
</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/tenement-add.jsp'" <%--onclick="javascript:addaticle2()"--%> class="btn btn-primary radius" target="_parent"><i class="Hui-iconfont">&#xe600;</i> 添加租户信息</a></span> <span class="r"></span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-hover table-bg table-sort">
			<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="60">租户ID</th>
				<th width="80">租户编码</th>
				<th width="77">租户姓名</th>
				<th width="80">租户性质</th>
				<th width="85">公司名称</th>
				<th width="160">身份证号</th>
				<th width="70">统一社会代码</th>
				<th width="85">经营业态</th>
				<th width="85">租凭面积</th>
				<th width="80">手机号码</th>
				<th width="70">是否黑名单</th>
				<th width="70">固定电话</th>
				<th width="70">民族</th>
				<th width="160">邮箱</th>
				<th width="70">备注</th>
				<th width="70">通讯地址</th>
				<th width="70">摊位号</th>
				<th width="60">租户状态</th>
				<th width="85">创建时间</th>
				<th width="85">修改时间</th>
				<th width="85">操作</th>
			</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>
</div>
<div id="hidden4">
	<input  type="hidden" value="TementList" id="yemian"/>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../js/layer.js"></script>
<script type="text/javascript" src="../../js/H-ui.min.js"></script>
<script type="text/javascript" src="../../js/H-ui.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../js/WdatePicker.js"></script>
<script type="text/javascript" src="../../js/jquery.dataTables.min.js"></script>
<%--<script type="text/javascript" src="../../js/laypage.js"></script>--%>
</body>
</html>
