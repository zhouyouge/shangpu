<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--_meta 作为公共模版分离出去-->
<script type="text/javascript" src="../statics/js/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="../js/huoyanyi/js/louceng.js" ></script>
<script>
	$(function () {
		$("#id").val("");
		$("#type").val("");
		var floorName=<%=session.getAttribute("floorName")%>;
		$("#type").val(<%request.getAttribute("type");%>);
		alert(floorName);
		if(floorName!=null){
			$("#id").val(floorName);
			$("#updateFloor").show();
			$("#addFloor").hide();
			$("#title").text("修改楼层信息");
			$("#floorName").attr('readOnly','readOnly');
			xiugaiFloorShow(floorName);
			<%session.removeAttribute("floorName");%>
		}else{
			$("#updateFloor").hide();
			$("#addFloor").show();
		}
	});
</script>
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

	<title>新增楼层信息</title>
	<meta name="keywords" content="新增楼层信息">
	<meta name="description" content="新增楼层信息">
</head>
<body>
<article class="page-container">
	<%--<form class="form form-horizontal" &lt;%&ndash;id="form-article-add"&ndash;%&gt;>--%>
		<div class="form form-horizontal">
			<br/>
			<div class="title1" id="title">新增楼层信息</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>分场名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="分场名称：下拉选取" id="breakoutName" name="articletitle">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>楼栋名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="楼栋名称：下拉选取" id="towerName" name="articletitle">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>楼层名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="楼层名称：唯一：必填" id="floorName" name="articletitle2">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>楼层编码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="必填：自动生成" id="floorCoding" name="articletitle2">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>产权性质：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<label for="PropertyType1">
					<input type="radio"  value="产权" placeholder="" id="PropertyType1" name="PropertyType" checked="checked">
				产权&emsp;&emsp;&emsp;
				</label>
				<label for="PropertyType2">
					<input type="radio"  value="使用权" placeholder="" id="PropertyType2" name="PropertyType">
					使用权&emsp;&emsp;&emsp;
				</label>
				<label for="PropertyType3">
					<input type="radio"  value="无证" placeholder="" id="PropertyType3" name="PropertyType">
					无证&emsp;&emsp;&emsp;
				</label>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>建筑面积：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="必填、保留两位小数" id="coveredArea" name="articletitle2">
			</div>
		</div>
	<%--	<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>经营面积：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="系统自动计算" id="operatingArea" name="articletitle2">
			</div>
		</div>--%>
	<%--	<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>公摊面积：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="公摊面积：选填、保留两位小数" id="br_residentialPool Area" name="articletitle2">
			</div>
		</div>--%>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>楼层状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<label for="floorStatus1">
					<input type="radio" name="floorStatus" id="floorStatus1" value="可租" checked="checked">可租&emsp;&emsp;&emsp;
				</label>
				<label for="floorStatus2">
					<input type="radio"  name="floorStatus" id="floorStatus2" value="不可组" >不可组&emsp;&emsp;&emsp;
				</label>
			</div>
		</div>

		</div>


		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>楼层信息状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<label for="br_operationalRegime1">
					<input type="radio" name="floor_BreakoutStatus" id="br_operationalRegime1" value="信息可用" checked="checked">信息可用&emsp;&emsp;&emsp;
				</label>
				<label for="br_operationalRegime2">
					<input type="radio"  name="floor_BreakoutStatus" id="br_operationalRegime2" value="信息不可用">信息不可用&emsp;&emsp;&emsp;
				</label>
				<label for="br_operationalRegime3">
					<input type="radio"  name="floor_BreakoutStatus" id="br_operationalRegime3" value="审核中">审核中<br/>
				</label>
			</div>
		</div>

		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">备注：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea name="abstract" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="$.Huitextarealength(this,200)" id="br_comment"></textarea>
				<p class="textarea-numberbar"><em class="textarea-length">选填</em>/200</p>
			</div>
		</div>

<%--		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">创建日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" &lt;%&ndash;onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'#F{$dp.$D(\'commentdatemax\')||\'%y-%M-%d\'}' })"&ndash;%&gt; id="commentdatemin" name="" class="input-text Wdate">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">修改日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" &lt;%&ndash;onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'commentdatemin\')}' })"&ndash;%&gt; id="commentdatemax" name="" class="input-text Wdate">
			</div>
		</div>--%>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">创建日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="date" <%--onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'#F{$dp.$D(\'commentdatemax\')||\'%y-%M-%d\'}' })"--%> id="commentdatemin" name="" class="input-text Wdate">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">修改日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="date" <%--onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'commentdatemin\')}' })"--%> id="commentdatemax" name="" class="input-text Wdate">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">楼层简图：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<div class="uploader-thum-container">
					<div id="fileList" class="uploader-list"></div>
					<div id="filePicker">选择图片</div>
					<button id="btn-star" class="btn btn-default btn-uploadstar radius ml-10">开始上传</button>
				</div>
			</div>
		</div>

		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<button onClick="updatefloorSubmit();" id="updateFloor" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 修改并提交审核</button>
				<button onClick="addfloorSubmit();" id="addFloor" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
			<%--<button onClick="article_save();"  class="btn btn-secondary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存草稿</button>--%>
				<button onClick="removeFloor();"  class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
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

</body>
</html>
