<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="../statics/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../js/huoyanyi/js/tanwei.js" ></script>
<script>
	$(function () {
		$("#id").val("");
		$("#type").val("");
		$("#type").val(<%request.getAttribute("type");%>);
		if(${sessionScope.boothNumber!=null}  ){
			alert("修改");
			var boothNumber='<%=session.getAttribute("boothNumber")%>';
			$("#id").val(boothNumber);
			$("#updateBoothSumbit").show();
			$("#addBoothSumbit").hide();
			$("#title").text("修改摊位信息");
			$("#boothNumber").attr('readOnly','readOnly');
			xiugaiBoothShow(boothNumber);
			<%session.removeAttribute("boothNumber");%>
		}
		if(${sessionScope.boothNumber==null}){
			alert("添加");
			$("#updateBoothSumbit").hide();
			$("#addBoothSumbit").show();


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

	<link rel="stylesheet" type="text/css" href="../css/H-ui.min.css" />
	<link rel="stylesheet" type="text/css" href="../css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="../css/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="../css/skin.css" id="skin" />
	<%--自己的css样式--%>
	<link rel="stylesheet" type="text/css" href="../css/wangtao/selectxiala.css" />
	<%--自己的css样式--%>
	<%--<link rel="stylesheet" type="text/css" href="css/style.css" />--%>
	<!--[if IE 6]>
	<script type="text/javascript" src="../js/DD_belatedPNG_0.0.8a-min.js" ></script>
	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<!--/meta 作为公共模版分离出去-->

	<title class="title1">新增摊位信息</title>
	<meta name="keywords" content="新增摊位信息">
	<meta name="description" content="新增摊位信息">
</head>
<body>
<br/>
<div class="title1" id="title">新增摊位信息</div>
<article class="page-container">
	<%--<form class="form form-horizontal" id="form-article-add">--%>
	<div class="form form-horizontal">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>分场名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select id="breakoutName" class="select">
					<option id="breakoutName1">分场1</option>
					<option id="breakoutName2">分场2</option>
				</select>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>楼栋名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select id="towerName" class="select">
					<option id="towerName1">楼栋1</option>
					<option id="towerName2">楼栋2</option>
				</select>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>楼层名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
			<select id="floorName" class="select">
				<option id="floorName1">楼层1</option>
				<option id="floorName2">楼层2</option>
			</select>
			</div>
		</div>


		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>摊位号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="摊位号：必填" id="boothNumber" name="boothNumber">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>摊位编码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="摊位编码：必填" id="boothCoding" name="boothCoding">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>经营业态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select id="planningForms" class="select">
					<option >业态，必填</option>
				</select>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>建筑面积：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="必填、保留两位小数" id="coveredArea" name="coveredArea">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>经营面积：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="经营面积：选填、保留两位小数" id="operatingArea" name="operatingArea">
			</div>
		</div>


		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">备注：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea name="abstract" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="$.Huitextarealength(this,200)" id="comment"></textarea>
				<p class="textarea-numberbar"><em class="textarea-length">选填</em>/200</p>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>摊位信息状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<label for="booth_BreakoutStatus1">
					<input type="radio" name="booth_BreakoutStatus1" id="booth_BreakoutStatus1" value="信息可用" checked="checked">信息可用&emsp;&emsp;&emsp;
				</label>
				<label for="booth_BreakoutStatus2">
					<input type="radio"  name="booth_BreakoutStatus2" id="booth_BreakoutStatus2" value="信息不可用" >信息不可用&emsp;&emsp;&emsp;
				</label>
				<label for="booth_BreakoutStatus3">
					<input type="radio"  name="booth_BreakoutStatus3" id="booth_BreakoutStatus3" value="审核中" >审核中&emsp;&emsp;&emsp;
				</label>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>摊位状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<%--<input type="text" class="input-text" value="" placeholder="" id="br_operationalRegime" name="articletitle2">--%>
				<label for="boothStatus1">
					<input type="radio" name="boothStatus1" id="boothStatus1" value="可租">可组&emsp;&emsp;&emsp;
				</label>
				<label for="boothStatus2">
					<input type="radio"  name="boothStatus2" id="boothStatus2" value="不可租" checked="checked">不可租&emsp;&emsp;&emsp;
				</label>
				<label for="boothStatus3">
					<input type="radio"  name="boothStatus3" id="boothStatus3" value="维护中">维护中<br/>
				</label>
			</div>
		</div>


		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">创建日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="date"  id="booth_createtime" name="booth_createtime" class="input-text Wdate">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">修改日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="date"  id="booth_updatetime" name="booth_updatetime" class="input-text Wdate">
			</div>
		</div>



		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<button onClick="updateBoothSumbit();" class="btn btn-primary radius"  id="updateBoothSumbit"><i class="Hui-iconfont">&#xe632;</i> 修改并提交审核</button>
				<button onClick="addBoothSumbit();" class="btn btn-primary radius"  id="addBoothSumbit"><i class="Hui-iconfont" >&#xe632;</i> 保存并提交审核</button>
			<%--	<button onClick="article_save();" class="btn btn-secondary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存草稿</button>--%>
				<button onClick="removeAdd();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
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
