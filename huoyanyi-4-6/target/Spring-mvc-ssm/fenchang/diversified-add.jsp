<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="../statics/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../js/huoyanyi/js/duojing.js" ></script>
<script>
    $(function () {
             $("#id").val("");
             $("#type").val("");
             var id=<%=session.getAttribute("boothId")%>;
             alert("id"+id);
             if(id!=null){
                 $("#id").val(id);
                 $("#xiugaiDiverfied").show();
                 $("#addDiverfied").hide();
                 $(".title1").text("修改多经信息");
                 <%session.removeAttribute("boothId");%>
                 updateDiversified(id);
            }
    });
</script>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
    <style>
    /*    #title1{
            !*background-color: rgba(0,176,240,0.5);*!width: 100%;
            height:25px; line-height: 25px;
            font-size: 20px; font-weight: bold;
            text-align: center;
        }*/

    </style>
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
    <link rel="stylesheet" type="text/css" href="../css/wangtao/selectxiala.css" />
    <%--自己的css样式--%>
    <%--<link rel="stylesheet" type="text/css" href="css/style.css" />--%>
    <!--[if IE 6]>
    <script type="text/javascript" src="../js/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <!--/meta 作为公共模版分离出去-->

    <title class="title1">新增多经信息</title>
    <meta name="keywords" content="新增多经信息">
    <meta name="description" content="新增多经信息">
</head>
<body>
<br/>
<div class="title1" >新增多经信息</div>
<article class="page-container">
   <%-- <form class="form form-horizontal" &lt;%&ndash;id="form-article-add"&ndash;%&gt;>--%>
    <div class="form form-horizontal">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>多经编码：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text"  placeholder="多经编码：自动生成" id="diversifiedCoding" name="diversifiedCoding">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>所属分场：</label>
            <div class="formControls col-xs-8 col-sm-9">
             <select  id="breakoutName" class="select">
                 <option>分场1</option>
                 <option >分场2</option>
                 <option>分场3</option>
             </select>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>所属楼栋：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <select id="towerName" class="select" >
                    <option>楼栋1</option>
                    <option >楼栋2</option>
                    <option>楼栋3</option>
                </select>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>所属楼层：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <select id="floorName" class="select" >
                    <option>楼层1</option>
                    <option >楼层2</option>
                    <option>楼层3</option>
                </select>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>多经名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text"  placeholder="多经名称：必填" id="diversifiedName" name="diversifiedName">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>多经状态：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <label for="diversifiedStatus1">
                    <input type="radio"  value="可租"  id="diversifiedStatus1" name="diversifiedStatus" checked="checked"/>
                    可租&emsp;&emsp;&emsp;
                </label>
                <label for="diversifiedStatus2">
                    <input type="radio"  value="不可租"  id="diversifiedStatus2" name="diversifiedStatus"/>
                    不可租&emsp;&emsp;&emsp;
                </label>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">建筑面积：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text"  placeholder="建筑面积：保留两位:必填" id="coveredArea" name="coveredArea">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>多经类型：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <select id="diversifiedType" class="select">
                    <option>广告位</option>
                    <option>基站</option>
                    <option>atm</option>
                    <option>其他</option>
                </select>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>是否露天：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <label for="outdoors1">
                    <input type="radio"  value="是" placeholder="" id="outdoors1" name="outdoors" checked="checked"/>
                    是&emsp;&emsp;&emsp;
                </label>
                <label for="outdoors2">
                    <input type="radio"  value="否" placeholder="" id="outdoors2" name="outdoors"/>
                    否&emsp;&emsp;&emsp;
                </label>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">租金标准(m2/天)：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text"  placeholder="租金标准：保留两位:必填" id="standardRent" name="standardRent">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">备注：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text"  placeholder="菜场历史合同价：保留两位:选填" id="comment" name="comment">
            </div>
        </div>

<%--        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">创建时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="date" class="input-text" value=""  id="ashop_createtime" name="ashop_createtime">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">修改时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="date" class="input-text" value=""  id="ashop_updatetime" name="ashop_updatetime">
            </div>
        </div>--%>

        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                <button onClick="updateDiversifiedSumbit();" class="btn btn-primary radius" type="submit" style="display: none" id="xiugaiDiverfied"><i class="Hui-iconfont">&#xe632;</i> 修改提交审核</button>
                <button onClick="addDiversifiedSumbit();" class="btn btn-primary radius" type="submit" id="addDiverfied"><i class="Hui-iconfont" >&#xe632;</i> 添加提交审核</button>
              <%--  <button onClick="article_save();" class="btn btn-secondary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存草稿</button>--%>
                <button onClick="removeIframe();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
            </div>
        </div>
    </div>
   <%-- </form>--%>
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
