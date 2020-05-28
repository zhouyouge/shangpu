<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	<%--<link rel="stylesheet" type="text/css" href="css/style.css" />--%>
	<!--[if IE 6]>
	<script type="text/javascript" src="../js/DD_belatedPNG_0.0.8a-min.js" ></script>
	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<!--/meta 作为公共模版分离出去-->
	<title>新增租户信息</title>
	<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
	<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
	<%--<form class="form form-horizontal" id="form-article-add">--%>
	<div class="form form-horizontal">
		<br/>
		<div style="background-color: rgba(0,176,240,0.5)">新增租户信息</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>租户编码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="租户编码：自动生成" id="tenantCoding" name="articletitle">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>租户名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="租户名称：唯一：必填" id="tenantName" name="articletitle">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>租户性质：</label>
			<div class="formControls col-xs-8 col-sm-9">
			<select id="tenantType">
				<option id="geren">个人</option>
				<option id="gongsi">公司</option>
			</select>
			</div>
		</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>公司名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="公司名称：必填" id="companyName" name="articletitle2">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>身份证号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="文本：必填" id="IDNumber" name="articletitle2">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>统一社会信用代码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="文本：必填" id="socialCreditCode" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>经营业态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select id="managementForms">
					<option >业态，必填</option>
				</select>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>租户状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select id="tenanStatus">
					<option >租户状态，必填</option>
					<option >启用</option>
					<option >停用</option>
				</select>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>租凭面积：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="租凭面积，文本必填" id="rentalArea" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>手机号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="手机号，文本必填" id="tenanPhone" name="articletitle2">
			</div>
		</div>


		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>是否黑名单：</label>
			<div class="formControls col-xs-8 col-sm-9">
			<label for="blacklistStatus1">
				<input  type="radio" value="是" id="blacklistStatus1" />是&emsp;&emsp;&emsp;
			</label>
				<label for="blacklistStatus2">
					<input  type="radio" value="" id="blacklistStatus2" value="否" checked="checked" />否&emsp;&emsp;&emsp;
				</label>
			</div>
		</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">固定电话：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="固定电话，文本选填" id="phone" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">民族：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="民族，文本选填" id="nationality" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">邮箱：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="邮箱，文本选填" id="email" name="articletitle2">
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

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>通讯地址：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="通讯地址，文本必填" id="mailingAddress" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>摊位号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="摊位号，必填：下拉选取" id="boothNumber" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">创建日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'#F{$dp.$D(\'commentdatemax\')||\'%y-%M-%d\'}' })" id="commentdatemin" name="commentdatemin" class="input-text Wdate">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">修改日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'commentdatemin\')}' })" id="commentdatemax" name="commentdatemax" class="input-text Wdate">
			</div>
		</div>

		<br/>
		<div style="background-color: rgba(0,176,240,0.5)">新增证照信息</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>证照类型：</label>
			<div class="formControls col-xs-8 col-sm-9">
			<select id="certificateType">
				<option>营业执照</option>
				<option>食品流通许可证</option>
				<option>健康证</option>
				<option>餐饮许可证</option>
				<option>烟草专卖证</option>
				<option>酒类专卖证</option>
			</select>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">证照时间范围：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="date"  value="" placeholder="" id="CertificateTimeRange1" name="CertificateTimeRange1" />
				<input type="date"  value="" placeholder="" id="CertificateTimeRange2" name="CertificateTimeRange2" />
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">证照照片上传：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<div class="uploader-thum-container">
					<div id="fileList" class="uploader-list"></div>
					<div id="filePicker">选择图片</div>
					<button id="btn-star2" class="btn btn-default btn-uploadstar radius ml-10">开始上传</button>
				</div>
			</div>
		</div>

		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<button onClick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
				<button onClick="article_save();" class="btn btn-secondary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存草稿</button>
				<button onClick="removeIframe();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
			</div>
		</div>
	</form>
</article>

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
<script type="text/javascript">
	$(function(){
		$('.skin-minimal input').iCheck({
			checkboxClass: 'icheckbox-blue',
			radioClass: 'iradio-blue',
			increaseArea: '20%'
		});

		//表单验证
		$("#form-article-add").validate({
			rules:{
				articletitle:{
					required:true,
				},
				articletitle2:{
					required:true,
				},
				articlecolumn:{
					required:true,
				},
				articletype:{
					required:true,
				},
				articlesort:{
					required:true,
				},
				keywords:{
					required:true,
				},
				abstract:{
					required:true,
				},
				author:{
					required:true,
				},
				sources:{
					required:true,
				},
				allowcomments:{
					required:true,
				},
				commentdatemin:{
					required:true,
				},
				commentdatemax:{
					required:true,
				},

			},
			onkeyup:false,
			focusCleanup:true,
			success:"valid",
			submitHandler:function(form){
				//$(form).ajaxSubmit();
				var index = parent.layer.getFrameIndex(window.name);
				//parent.$('.btn-refresh').click();
				parent.layer.close(index);
			}
		});

		$list = $("#fileList"),
				$btn = $("#btn-star"),
				state = "pending",
				uploader;

		var uploader = WebUploader.create({
			auto: true,
			swf: 'lib/webuploader/0.1.5/Uploader.swf',

			// 文件接收服务端。
			server: 'fileupload.php',

			// 选择文件的按钮。可选。
			// 内部根据当前运行是创建，可能是input元素，也可能是flash.
			pick: '#filePicker',

			// 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！
			resize: false,
			// 只允许选择图片文件。
			accept: {
				title: 'Images',
				extensions: 'gif,jpg,jpeg,bmp,png',
				mimeTypes: 'image/*'
			}
		});
		uploader.on( 'fileQueued', function( file ) {
			var $li = $(
					'<div id="' + file.id + '" class="item">' +
					'<div class="pic-box"><img></div>'+
					'<div class="info">' + file.name + '</div>' +
					'<p class="state">等待上传...</p>'+
					'</div>'
					),
					$img = $li.find('img');
			$list.append( $li );

			// 创建缩略图
			// 如果为非图片文件，可以不用调用此方法。
			// thumbnailWidth x thumbnailHeight 为 100 x 100
			uploader.makeThumb( file, function( error, src ) {
				if ( error ) {
					$img.replaceWith('<span>不能预览</span>');
					return;
				}

				$img.attr( 'src', src );
			}, thumbnailWidth, thumbnailHeight );
		});
		// 文件上传过程中创建进度条实时显示。
		uploader.on( 'uploadProgress', function( file, percentage ) {
			var $li = $( '#'+file.id ),
					$percent = $li.find('.progress-box .sr-only');

			// 避免重复创建
			if ( !$percent.length ) {
				$percent = $('<div class="progress-box"><span class="progress-bar radius"><span class="sr-only" style="width:0%"></span></span></div>').appendTo( $li ).find('.sr-only');
			}
			$li.find(".state").text("上传中");
			$percent.css( 'width', percentage * 100 + '%' );
		});

		// 文件上传成功，给item添加成功class, 用样式标记上传成功。
		uploader.on( 'uploadSuccess', function( file ) {
			$( '#'+file.id ).addClass('upload-state-success').find(".state").text("已上传");
		});

		// 文件上传失败，显示上传出错。
		uploader.on( 'uploadError', function( file ) {
			$( '#'+file.id ).addClass('upload-state-error').find(".state").text("上传出错");
		});

		// 完成上传完了，成功或者失败，先删除进度条。
		uploader.on( 'uploadComplete', function( file ) {
			$( '#'+file.id ).find('.progress-box').fadeOut();
		});
		uploader.on('all', function (type) {
			if (type === 'startUpload') {
				state = 'uploading';
			} else if (type === 'stopUpload') {
				state = 'paused';
			} else if (type === 'uploadFinished') {
				state = 'done';
			}

			if (state === 'uploading') {
				$btn.text('暂停上传');
			} else {
				$btn.text('开始上传');
			}
		});

		$btn.on('click', function () {
			if (state === 'uploading') {
				uploader.stop();
			} else {
				uploader.upload();
			}
		});

		var ue = UE.getEditor('editor');

	});
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>
