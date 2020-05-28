<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="../../statics/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../../js/wangtao/js/fenye.js"></script>
<script type="text/javascript" src="../../js/huoyanyi/js/yipuyijia.js"></script>

<!DOCTYPE HTML>
<html>
<head>
	<meta charset="utf-8">
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<%--<!--[if lt IE 9]>
    <script type="text/javascript" src="lib/html5shiv.js"></script>
    <script type="text/javascript" src="lib/respond.min.js"></script>
    <![endif]-->--%>
	<link rel="stylesheet" type="text/css" href="../../css/fenye.css" />
	<link rel="stylesheet" type="text/css" href="../../css/min.css" />
	<link rel="stylesheet" type="text/css" href="../../css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="../../css/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="../../css/skin.css" id="skin" />

	<!--[if IE 6]>
	<script type="text/javascript" src="../../js/DD_belatedPNG_0.0.8a-min.js" ></script>
	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<title>一铺一价信息管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 数据管理 <span class="c-gray en">&gt;</span> 一铺一价信息管理<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c"> 日期范围：
		<input type="date"  id="datemin" class="input-text Wdate" style="width:120px;">
		<input type="date"  id="datemax" class="input-text Wdate" style="width:120px;">
		<input  type="text" class="input-text" style="width:250px" placeholder="输入一铺一价名称" id="boothNumber"  name="">
		<button type="button" id="qingchuTime"  class="btn btn-success radius" onclick="cleanTime()" name="">清除时间</button>
		<button type="submit" class="btn btn-success radius" id="" name="" onclick="Ashopricetjchaxun()"><i class="Hui-iconfont">&#xe665;</i> 搜一铺一价</button>
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="deleteAll()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/ashopPrice-add.jsp'" <%--onclick="javascript:addaticle2()"--%> class="btn btn-primary radius" target="_parent"><i class="Hui-iconfont">&#xe600;</i> 添加一铺一价信息</a></span> <span class="r"></span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-hover table-bg table-sort">
			<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="50">主键ID</th>
				<th width="88">年度</th>
				<th width="65">免租期</th>
				<th width="65">国资委指导价</th>
				<th width="65">周边市场价</th>
				<th width="65">菜场公司定价</th>
				<th width="65">网点公司定价</th>
				<th width="65">菜场历史合同价</th>
				<th width="65">网点历史合同价</th>
				<th width="65">摊位号</th>
				<th width="75">摊位租金</th>
				<th width="85">创建时间</th>
				<th width="85">修改时间</th>
				<th width="80">操作</th>
			</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>
</div>
<div id="hidden5">
	<input  type="hidden" value="AshopriceList" id="yemian"/>
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
	/*	$('.table-sort').dataTable({
			"aaSorting": [[ 1, "desc" ]],//默认第几个排序
			"bStateSave": true,//状态保存
			"aoColumnDefs": [
				//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
				{"orderable":false,"aTargets":[0,8,9]}// 制定列不参与排序
			]
		});*/

	});
	/*用户-添加*/
	function member_add(title,url,w,h){
		layer_show(title,url,w,h);
	}
	/*用户-查看*/
	function member_show(title,url,id,w,h){
		layer_show(title,url,w,h);
	}
	/*用户-停用*/
	function member_stop(obj,id){
		layer.confirm('确认要停用吗？',function(index){
			$.ajax({
				type: 'POST',
				url: '',
				dataType: 'json',
				success: function(data){
					$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
					$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
					$(obj).remove();
					layer.msg('已停用!',{icon: 5,time:1000});
				},
				error:function(data) {
					console.log(data.msg);
				},
			});
		});
	}

	/*用户-启用*/
	function member_start(obj,id){
		layer.confirm('确认要启用吗？',function(index){
			$.ajax({
				type: 'POST',
				url: '',
				dataType: 'json',
				success: function(data){
					$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
					$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
					$(obj).remove();
					layer.msg('已启用!',{icon: 6,time:1000});
				},
				error:function(data) {
					console.log(data.msg);
				},
			});
		});
	}
	/*用户-编辑*/
	function member_edit(title,url,id,w,h){
		layer_show(title,url,w,h);
	}
	/*密码-修改*/
	function change_password(title,url,id,w,h){
		layer_show(title,url,w,h);
	}
	/*用户-删除*/
	function member_del(obj,id){
		layer.confirm('确认要删除吗？',function(index){
			$.ajax({
				type: 'POST',
				url: '',
				dataType: 'json',
				success: function(data){
					$(obj).parents("tr").remove();
					layer.msg('已删除!',{icon:1,time:1000});
				},
				error:function(data) {
					console.log(data.msg);
				},
			});
		});
	}
</script>

</body>
</html>
