<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="../../statics/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../../js/huoyanyi/js/tanwei.js" ></script>
<script type="text/javascript" src="../../js/wangtao/js/fenye.js"></script>
<!DOCTYPE HTML>
<html>
<head>
	<style>
		.page .fenye{border:1px solid #ccc;cursor:pointer;display:inline-block;
			margin-left:2px;text-align:center;text-decoration:none;
			color:#666;height:26px;line-height:26px;text-decoration:none;
			margin:0 0 6px 6px;padding:0 10px;font-size:14px}

		.page .fenye:hover{background:#5a98de;color:#fff}
	</style>
	<meta charset="utf-8">
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<%--<!--[if lt IE 9]>
    <script type="text/javascript" src="lib/html5shiv.js"></script>
    <script type="text/javascript" src="lib/respond.min.js"></script>
    <![endif]-->--%>

	<link rel="stylesheet" type="text/css" href="../../css/min.css" />
	<link rel="stylesheet" type="text/css" href="../../css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="../../css/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="../../css/skin.css" id="skin" />

	<!--[if IE 6]>
	<script type="text/javascript" src="../../js/DD_belatedPNG_0.0.8a-min.js" ></script>
	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<title>摊位信息管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 数据管理 <span class="c-gray en">&gt;</span> 摊位信息管理<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c"> 日期范围：
		<input type="date"  id="datemin" class="input-text Wdate" style="width:120px;">
		<input type="date"  id="datemax" class="input-text Wdate" style="width:120px;">
		<input type="text" class="input-text" style="width:250px" id="boothNumber" placeholder="输入摊位号" id="diversifiedName" name="diversifiedName" />
		<button type="button" id="qingchuTime"  class="btn btn-success radius" onclick="cleanTime()" name="">清除时间</button>
		<button type="button" onclick="tanweitjchaxun()" class="btn btn-success radius"  name=""><i class="Hui-iconfont">&#xe665;</i> 搜摊位</button>
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="deleteAll()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/booth-add.jsp'" <%--onclick="javascript:addaticle2()"--%> class="btn btn-primary radius" target="_parent"><i class="Hui-iconfont">&#xe600;</i> 添加摊位信息</a></span> <span class="r"></span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-hover table-bg table-sort">
			<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="80">摊位号</th>
				<th width="100">分场名称</th>
				<th width="130">楼栋名称</th>
				<th width="130">楼层名称</th>
				<th width="130">摊位编码</th>
				<th width="70">规划业态</th>
				<th width="70">建筑面积</th>
				<th width="70">经营面积</th>
				<th width="70">备注</th>
				<th width="70">摊位状态</th>
				<th width="70">创建时间</th>
				<th width="70">修改时间</th>
				<th width="70">摊位信息状态</th>
				<th width="100">操作</th>
			</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>
</div>
<div id="hidden5">
	<input  type="hidden" value="Booth-list" id="yemian"/>
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
<script type="text/javascript">
	$(function(){
		$(".dataTables_empty").remove();
		$(".dataTables_info").remove();
		/*$('.table-sort').dataTable({
			"aaSorting": [[ 1, "desc" ]],//默认第几个排序
			"bStateSave": true,//状态保存
			"aoColumnDefs": [
				//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
				{"orderable":false,"aTargets":[0,8,9]}// 制定列不参与排序
			]
		});*/

	});

</script>
</body>
</html>
