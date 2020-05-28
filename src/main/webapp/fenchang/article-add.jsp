<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--_meta 作为公共模版分离出去-->
<script type="text/javascript" src="../statics/js/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="../js/huoyanyi/js/fenchang.js" ></script>
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
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	<!--[if IE 6]>
	<script type="text/javascript" src="../js/DD_belatedPNG_0.0.8a-min.js" ></script>

	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<!--/meta 作为公共模版分离出去-->

	<title>新增分场信息</title>
	<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
	<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container"><br/>
	<div style="background-color: rgba(0,176,240,0.5)">新增分场信息</div>
	<form class="form form-horizontal" <%--id="form-article-add"--%>>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>分场简称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="分场简称：必填" id="br_abbreviation" name="ffff">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>分场名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="分场名称：必填" id="breakoutName" name="ffff">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>分场编码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="分场编码：自动生成" id="br_coding" name="ffff">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>负责人：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="分场负责人：下拉框" id="br_principal" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>经营类型：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="网点、菜场、必填" id="br_workType" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>建筑面积：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="必填、保留两位小数" id="br_coveredArea" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>公摊面积：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="公摊面积：选填、保留两位小数" id="br_residentialPool Area" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>经营面积：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="系统自动计算" id="br_operatingArea" name="articletitle2">
			</div>
		</div>


		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">营运状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<%--<input type="text" class="input-text" value="" placeholder="" id="br_operationalRegime" name="articletitle2">--%>
				<label for="br_operationalRegime1">
					<input type="radio" name="allowcomments" id="br_operationalRegime1" value="改营">改营&emsp;&emsp;&emsp;
				</label>
				<label for="br_operationalRegime2">
					<input type="radio"  name="allowcomments" id="br_operationalRegime2" value="在建" checked="checked">在建&emsp;&emsp;&emsp;
				</label>
				<label for="br_operationalRegime3">
					<input type="radio"  name="allowcomments" id="br_operationalRegime3" value="关闭">关闭<br/>
				</label>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>分场信息状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<label for="br_operationalRegime1">
					<input type="radio" name="br_BreakoutStatus2" id="br_BreakoutStatus1" value="改建">改建&emsp;&emsp;&emsp;
				</label>
				<label for="br_operationalRegime2">
					<input type="radio"  name="br_BreakoutStatus2" id="br_BreakoutStatus2" value="在营" checked="checked">在营&emsp;&emsp;&emsp;
				</label>
			</div>
		</div>

		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">备注：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea name="abstract" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="$.Huitextarealength(this,200)" id="brcomment"></textarea>
				<p class="textarea-numberbar"><em class="textarea-length">选填</em>/200</p>
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

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">分场简图：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<div class="uploader-thum-container">
					<div id="fileList" class="uploader-list"></div>
					<div id="filePicker">选择图片</div>
					<button id="btn-star" class="btn btn-default btn-uploadstar radius ml-10">开始上传</button>
				</div>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">分场营业执照：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<div class="uploader-thum-container">
					<div id="fileList2" class="uploader-list"></div>
					<div id="filePicker2">选择图片</div>
					<button id="btn-star2" class="btn btn-default btn-uploadstar radius ml-10">开始上传</button>
				</div>
			</div>
		</div>
<br/>
		<div style="background-color: rgba(0,176,240,0.5)">新增甲方合同信息</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>甲方公司抬头：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="甲方公司抬头，必填" id="companyTitle" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>甲方地址：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="甲方地址，必填" id="companyAddress" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>甲方电话：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="甲方电话，必填" id="companyPhone" name="articletitle2">
			</div>
		</div>

		<br/>
		<div style="background-color: rgba(0,176,240,0.5)">新增银行账户信息</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="开户行名称，必填" id="bankName" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行账号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="开户行账号，必填" id="bank_account" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="开户行名称，必填" id="bank_rownum" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行名称2：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="开户行名称2，必填" id="bankName2" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行账号2：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="开户行账号2，必填" id="bank_account2" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行号2：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="开户行号2，必填" id="bank_rownum2" name="articletitle2">
			</div>
		</div>

		<br/>
		<div style="background-color: rgba(0,176,240,0.5)">新增开票信息</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开票名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="开票名称，必填" id="billingName" name="kaipiaomingcheng">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>纳税人识别号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="纳税人识别号，必填" id="ratepayerNumber" name="kaipiaomingcheng">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>纳税人地址：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="纳税人地址，必填" id="billAddress" name="kaipiaomingcheng">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>纳税人电话：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="纳税人电话，必填" id="billPhone" name="billPhone">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="开户行名称，必填" id="bankNames" name="bankName2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行账户：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="开户行账户，必填" id="billAccount" name="kaipiaomingcheng">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>租金税率：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="租金税率，必填" id="rent_taxRate" name="rent_taxRate">
			</div>
		</div>

		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<button onclick="addarticle();" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
				<button onclick="article_save();" class="btn btn-secondary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存草稿</button>
				<button onclick="removeIframe();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
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
/*	$(function(){
		$('.skin-minimal input').iCheck({
			checkboxClass: 'icheckbox-blue',
			radioClass: 'iradio-blue',
			increaseArea: '20%'
		});

	/!*	//表单验证
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

			}
*!/

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
				mimeTypes: 'image/!*'
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
	});*/
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>