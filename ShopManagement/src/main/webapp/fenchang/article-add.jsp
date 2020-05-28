<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--_meta 作为公共模版分离出去-->
<script type="text/javascript" src="../statics/js/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="../js/huoyanyi/js/fenchang.js" ></script>
<script>
    $(function () {
        $("#id").val("");
        $("#type").val("");
        var breakoutName='<%=session.getAttribute("breakoutName")%>';
        if(${sessionScope.breakoutName!=null}){
            alert("不为空");
            $("#id").val(breakoutName);
            $("#Addjiafang").hide();
            $("#AddKaipiao").hide();
            $("#AddBank").hide();

            $("#updateArticle1").show();
            $("#addarticle1").hide();
            $("#title").text("修改楼栋信息");
            $("#breakoutName").attr('readOnly','readOnly');
            xiugaiArticleShow(breakoutName);
            <%session.removeAttribute("breakoutName");%>
        }else{
            $("#updateArticle1").hide();
            $("#addarticle1").show();
        }
    })
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
	<%--<link rel="stylesheet" type="text/css" href="css/style.css" />--%>
    <%--自己的css样式--%>
    <link rel="stylesheet" type="text/css" href="../css/wangtao/selectxiala.css"  />
    <%--自己的css样式--%>
	<!--[if IE 6]>
	<script type="text/javascript" src="../js/DD_belatedPNG_0.0.8a-min.js" ></script>

	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<!--/meta 作为公共模版分离出去-->

	<title>新增分场信息</title>
	<meta name="keywords" content="新增分场信息">
	<meta name="description" content="新增分场信息">
</head>
<body>
<article class="page-container"><br/>

	<div class="title1" id="title">新增分场信息</div>
		<div class="form form-horizontal">
            <div id="AddArticle">
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
				<input type="text" class="input-text" value="" placeholder="公摊面积：选填、保留两位小数" id="br_residentialPool" name="br_residentialPool">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>经营面积：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="系统自动计算" id="br_operatingArea" name="br_operatingArea">
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
				<input type="date"  id="bill_createtime" name="commentdatemin" class="input-text Wdate">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">修改日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="date" id="bill_updatetime" name="commentdatemax" class="input-text Wdate">
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
      </div>

      <div id="Addjiafang">
        <br/>
		<div class="title1">新增甲方合同信息</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>甲方公司抬头：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="甲方公司抬头，必填" id="companyTitle" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>甲方地址：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="甲方地址，必填" id="companyAddress" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>甲方电话：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="甲方电话，必填" id="companyPhone" name="articletitle2">
			</div>
		</div>

          <div id="AddBank">
		<br/>
		<div class="title1">新增银行账户信息</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="开户行名称，必填" id="bankName" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行账号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="开户行账号，必填" id="bank_account" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="开户行名称，必填" id="bank_rownum" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行名称2：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="开户行名称2，必填" id="bankName2" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行账号2：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="开户行账号2，必填" id="bank_account2" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行号2：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="开户行号2，必填" id="bank_rownum2" name="articletitle2">
			</div>
		</div>
      </div>

      <div id="AddKaipiao">
		<br/>
		<div class="title1">新增开票信息</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开票名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="开票名称，必填" id="billingName" name="kaipiaomingcheng">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>纳税人识别号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="纳税人识别号，必填" id="ratepayerNumber" name="kaipiaomingcheng">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>纳税人地址：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="纳税人地址，必填" id="billAddress" name="kaipiaomingcheng">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>纳税人电话：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="纳税人电话，必填" id="billPhone" name="billPhone">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="开户行名称，必填" id="bankNames" name="bankName2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>开户行账户：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="开户行账户，必填" id="billAccount" name="kaipiaomingcheng">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>租金税率：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  placeholder="租金税率，必填" id="rent_taxRate" name="rent_taxRate">
			</div>
		</div>
      </div>
      </div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                <button onclick="updateArticle();" id="updateArticle1" class="btn btn-primary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 修改并提交审核</button>
				<button onclick="addarticle();" id="addarticle1" class="btn btn-primary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
				<button onclick="removeArticle();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
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