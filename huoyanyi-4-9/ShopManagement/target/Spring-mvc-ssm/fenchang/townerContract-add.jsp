<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--_meta 作为公共模版分离出去-->
<script type="text/javascript" src="../statics/js/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="../js/huoyanyi/js/loudong.js" ></script>
<script>
	$(function () {
		$("#id").val("");
		$("#type").val("");
		var towerName='<%=session.getAttribute("towerName")%>';
		//alert(towerName);
		if(${sessionScope.towerName!=null}){  //AddShoukuan  AddHouse  AddHuseGo  addTowner1
			alert("11");
			$("#id").val(towerName);
			$("#AddShoukuan").hide();
			$("#AddHouse").hide();
			$("#AddHuseGo").hide();
			$("#AddHuseGo").hide();
			$("#addTowner1").show();

			$("#upaateTowner").show();
			$("#addTowner").hide();
			$("#title").text("修改楼栋信息");
			$("#towerName").attr('readOnly','readOnly');
			xiugaiTowenerShow(towerName);
			<%session.removeAttribute("towerName");%>
		}
        var houseId=<%=session.getAttribute("houseId")%>;
		if(${sessionScope.houseId!=null}){
            //alert(houseId)
            $("#id").val(houseId);
            $("#AddShoukuan").hide();
            $("#AddHouse").hide();
            $("#AddHuseGo").show();
            $("#addTowner1").hide();
            $("#addTowner").hide();
            $("#upaateTowner").hide();
            $("#updateHouse").show();
            $("#House").text("修改房屋来源信息(多记录)");
            xiugaiHouseShow(houseId);
            <%session.removeAttribute("houseId");%>
        }
        var goHourseId=<%=session.getAttribute("goHourseId")%>;
        if(${sessionScope.goHourseId!=null}){
            alert(goHourseId)
            $("#id").val(goHourseId);
            $("#AddShoukuan").hide();
            $("#AddHouse").show();
            $("#AddHuseGo").hide();
            $("#addTowner1").hide();
            $("#addTowner").hide();
            $("#upaateTowner").hide();
            $("#updateHouse").show();
            $("#House").text("修改房屋去向信息(多记录)");
            updateChaHousingGoDown(goHourseId);
            <%session.removeAttribute("goHourseId");%>
        }
        var getheringId=<%=session.getAttribute("getheringId")%>;
        if(${sessionScope.getheringId!=null}){
            alert(getheringId)
            $("#id").val(getheringId);
            $("#AddShoukuan").show();
            $("#AddHouse").hide();
            $("#AddHuseGo").hide();
            $("#addTowner1").hide();
            $("#addTowner").hide();
            $("#upaateTowner").hide();
            $("#updateHouse").show();
            $("#House").text("修改收款方信息(多记录)");
            updatepaymentterm(getheringId);
            <%session.removeAttribute("getheringId");%>
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

	<title>新增楼栋信息</title>
	<meta name="keywords" content="新增楼栋信息">
	<meta name="description" content="新增楼栋信息">
</head>
<body>
<article class="page-container">
	<%--<form class="form form-horizontal" &lt;%&ndash;id="form-article-add"&ndash;%&gt;>--%>
		<div class="form form-horizontal">
			<div id="addTowner1">
		<br/>
		<div class="title1"  id="title">新增楼栋信息</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>分场名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="分场名称：下拉选取" id="breakoutName" name="breakoutName">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>楼栋编码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="楼栋编码：自动生成" id="towerCoding" name="articletitle">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>楼栋名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="楼栋名称：唯一：必填" id="towerName" name="articletitle">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">地下楼层数：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="选填：非零" id="upFloorNumber" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">地上楼层数：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="选填：非零" id="downFloorNumber" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>建筑面积：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="必填、保留两位小数" id="coveredArea" name="articletitle2">
			</div>
		</div>


		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>经营面积：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="系统自动计算" id="operatingArea" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>楼栋状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<label for="towerStatus1">
					<input type="radio" name="allowcomments" id="towerStatus1" value="可租" checked="checked"/>可租&emsp;&emsp;&emsp;
				</label>
				<label for="towerStatus2">
					<input type="radio"  name="allowcomments" id="towerStatus2" value="不可组"/>不可组&emsp;&emsp;&emsp;
				</label>
			</div>
		</div>


		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>楼栋信息状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<label for="tower_BreakoutStatus1">
					<input type="radio" name="allowcomments2" id="tower_BreakoutStatus1" value="信息可用" checked="checked"/>信息可用&emsp;&emsp;&emsp;
				</label>
				<label for="tower_BreakoutStatus2">
					<input type="radio"  name="allowcomments2" id="tower_BreakoutStatus2" value="信息不可用"/>信息不可用&emsp;&emsp;&emsp;
				</label>
				<label for="tower_BreakoutStatus3">
					<input type="radio"  name="allowcomments2" id="tower_BreakoutStatus3" value="审核中"/>审核中<br/>
				</label>
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
			<label class="form-label col-xs-4 col-sm-2">创建日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="date" id="commentdatemin" name="commentdatemin" class="input-text Wdate">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">修改日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="date"  id="commentdatemax" name="commentdatemax" class="input-text Wdate">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">楼栋简图：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<div class="uploader-thum-container">
					<div id="fileList" class="uploader-list"></div>
					<div id="filePicker">选择图片</div>
					<button id="btn-star" class="btn btn-default btn-uploadstar radius ml-10">开始上传</button>
				</div>
			</div>
		</div>
			</div>

		<div id="AddHuseGo">
		<br/>
		<div class="title1">新增房屋来源信息(多记录)</div>
        <input type="hidden" id="houseId">
        <input type="hidden" id="gatheringId">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>房屋来源：</label>
			<div class="formControls col-xs-8 col-sm-9">
			<select id="hoseSource" class="select">
				<option>自有产权</option>
				<option>内部租凭</option>
				<option>委托管理</option>
				<option>使用权租凭</option>
				<option>社会租凭</option>
			</select>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>产证编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="产证编号，选填" id="ProduceLabel" name="ProduceLabel">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">产权人：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="产权人，选填" id="propertyOwner" name="articletitle2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">租凭/委托甲方名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="甲方名称，选填" id="townerName" name="townerName">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">租凭/委托乙方名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="乙方名称，选填" id="purchaserName" name="purchaserName">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">租凭/委托开始时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value=""  id="startTime" name="startTime">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">租凭/委托结束时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value=""  id="outTime" name="outTime">
			</div>
		</div>
		</div>

			<div id="AddHouse">
		<br/>
		<div <%--style="background-color: rgba(0,176,240,0.5)"--%> class="title1">新增房屋去向信息</div>
				<input type="hidden" id="goHourseId">
				<input type="hidden" id="tenementId">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">房屋去向：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select id="hourseGoDown" class="select">
					<option>社会租凭</option>
					<option>内部租凭</option>
					<option>委托租凭</option>
				</select>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">租凭/委托甲方名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="甲方名称，选填" id="townerName2" name="townerName">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">租凭/委托乙方名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="乙方名称，选填" id="purchaserName2" name="purchaserName">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">租凭/委托开始时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="date" class="input-text" value=""  id="startTime2" name="startTime">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">租凭/委托结束时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="date" class="input-text" value=""  id="outTime2" name="outTime">
			</div>
		</div>
			</div>
			<div id="AddShoukuan">
		<br/>
		<div class="title1">新增收款方信息(多记录)</div>
				<input type="hidden" id="getheringId">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">收款方名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="收款方名称，选填" id="gatheringName" name="gatheringName">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">开户行号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="收款方名称，选填" id="bankNo" name="gatheringName">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">开户名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="开户名称，选填" id="accountName" name="accountName">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">开户账号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="开户账号，选填" id="accountNumber" name="accountNumber">
			</div>
		</div>
			</div>

		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<button onclick="updaetTowerSumbit();" id="updateTowner" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 修改并提交审核</button>
				<button onclick="addTowerSumbit();" id="addTowner" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
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
