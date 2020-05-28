<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--_meta 作为公共模版分离出去-->
<script type="text/javascript" src="../statics/js/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="../js/huoyanyi/js/pinpai.js" ></script>
<script>
    $(function () {
        $("#id").val("");
        $("#type").val("");
        var brandId='<%=session.getAttribute("brandId")%>';
        //alert(towerName);
        if(${sessionScope.brandId!=null}){  //AddShoukuan  AddHouse  AddHuseGo  addTowner1
            alert(brandId);
            $("#id").val(brandId);
            $("#upateTowner").show();
            $("#addTowner").hide();
            $("#title").text("修改品牌信息");
            $("#brandId").attr('readOnly','readOnly');
            toupdateBrandinformation(brandId);
            <%session.removeAttribute("brandId");%>
        }
        else{
            alert("22");
            $("#updateTowner").hide();
            $("#addTowner").show();
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

	<title>新增品牌信息</title>
	<meta name="keywords" content="新增品牌信息">
	<meta name="description" content="新增品牌信息">
</head>
<body>
<article class="page-container">
	<%--<form class="form form-horizontal" &lt;%&ndash;id="form-article-add"&ndash;%&gt;>--%>
		<div class="form form-horizontal">
			<div id="addTowner1">
		<br/>
		<div class="title1"  id="title">新增品牌信息</div>
		<input type="text" id="brandId">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>品牌编码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="品牌编码" id="brandCoding" name="breakoutName">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>品牌名称(中)：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="品牌名称(中)" id="brandNameCh" name="articletitle">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>品牌名称(英)：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="品牌名称(英)" id="brandNameEh" name="articletitle">
			</div>
		</div>
				<div class="row cl">
					<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>所属业态：</label>
					<div class="formControls col-xs-8 col-sm-9">
						<select id="commercialActivities" class="select">
							<option>猪肉</option>
							<option>牛羊肉</option>
							<option>河鲜</option>
							<option>海鲜</option>
							<option>蔬菜</option>
							<option>豆制品</option>
							<option>冷鲜禽</option>
							<option>分割禽</option>
							<option>禽蛋</option>
							<option>南北货</option>
							<option>乳制品</option>
							<option>熟食</option>
							<option>半制成品</option>
							<option>小水产</option>
							<option>水果</option>
							<option>酱菜</option>
							<option>手工点心</option>
							<option>面制品</option>
							<option>超市</option>
							<option>棋牌</option>
							<option>网吧</option>
							<option>大众早点</option>
							<option>现制现售</option>
							<option>其他</option>
						</select>
					</div>
				</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">品牌发源地：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="品牌发源地" id="birthplaceOfBrand" name="articletitle2">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>连锁/单店：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<label for="storeProperties1">
					<input type="radio" name="storeProperties" id="storeProperties1" value="连锁"/>连锁&emsp;&emsp;&emsp;
				</label>
				<label for="storeProperties2">
					<input type="radio"  name="storeProperties" id="storeProperties2" value="单店"/>单店&emsp;&emsp;&emsp;
				</label>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>连锁/单店：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<label for="businessNature1">
					<input type="radio" name="businessNature" id="businessNature1" value="直营" />直营&emsp;&emsp;
				</label>
				<label for="businessNature2">
					<input type="radio"  name="businessNature" id="businessNature2" value="加盟"/>加盟&emsp;&emsp;&emsp;
				</label>
				<label for="businessNature3">
					<input type="radio"  name="businessNature" id="businessNature3" value="个体"/>个体&emsp;&emsp;&emsp;
				</label>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">官方网址：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="官方网址" id="officialWebsite" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>总部地址：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="总部地址" id="headquarterAddress" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">品牌说明：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea name="abstract" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="$.Huitextarealength(this,200)" id="brandDescription"></textarea>
				<p class="textarea-numberbar"><em class="textarea-length">选填</em>/200</p>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">附件：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<div class="uploader-thum-container">
					<div id="fileList" class="uploader-list"></div>
					<div id="filePicker">选择图片</div>
					<button id="btn-star" class="btn btn-default btn-uploadstar radius ml-10">开始上传</button>
				</div>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>租户id：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="租户id" id="tenementId" name="articletitle2">
			</div>
		</div>
	</div>
	<div class="row cl">
		<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
			<button onclick="updaetBrandinformation();" id="updateTowner" class="btn btn-primary radius" type="submit" ><i class="Hui-iconfont">&#xe632;</i> 修改并提交审核</button>
			<button onclick="addBrandinformatio();" id="addTowner" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
			<button onclick="removeTowner();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
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
