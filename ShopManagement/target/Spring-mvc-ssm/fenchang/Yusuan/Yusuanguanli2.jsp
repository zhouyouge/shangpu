<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="../../statics/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../../js/huoyanyi/js/yusuan.js"></script>
<script>
    $(function () {
        var yemian=$("#yemian").val();
        if(yemian=="Yusuan-list2"){
            $("#bb").css({"color":"#0C0C0C","margin":"0","display":"block"});
        }
    });
    function yuSuandaoRu() {
        $.ajax({
            url:"http://localhost:8080/ShopManagement/importExcelss",
            type:"post",
            success:function(result) {
                alert(result);
                $("#daoru").html(result);
            }
        });
    }
</script>
<html>
<head>
    <style>
        .page .fenye,.daoru,.daochu{border:1px solid #ccc;cursor:pointer;display:inline-block;
            margin-left:2px;text-align:center;text-decoration:none;
            color:#666;height:26px;line-height:26px;text-decoration:none;
            margin:0 0 6px 6px;padding:0 10px;font-size:14px}

        .page .fenye:hover{background:#5a98de;color:#fff}
        .biaoqian:link,.biaoqian:active,.biaoqian:visited,.biaoqian:hover,
        #daocus:link,#daocus:active,#daocus:visited,#daocus:hover,
        #daorus:link,#daorus:active,#daorus:visited,#daorus:hover
        {
            text-decoration:none;
        }
        a{
            font-size: 18px;
        }
    </style>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />


    <link rel="stylesheet" type="text/css" href="../../css/min.css" />
    <link rel="stylesheet" type="text/css" href="../../css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="../../css/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="../../css/skin.css" id="skin" />

    <!--[if IE 6]>
    <script type="text/javascript" src="../../js/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>预算管理</title>
</head>
<body>
<div>
    <div id="daoru"></div>
</div>

<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 预算管理 <span class="c-gray en">&gt;</span> 预算查询<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="text-c"> 日期范围：
        <input type="date"  id="datemin" class="input-text Wdate" style="width:120px;">
        <label>
        <a class="biaoqian">7月<input value="7" onclick="dianji(this)" type="checkbox" name="yue" class="ids" id="qiyue">&emsp;</a>
        </label>
        <label>
        <a class="biaoqian">8月<input value="8" onclick="dianji(this)" type="checkbox" name="yue" class="ids" id="bayue">&emsp;</a>
        </label>
        <label>
        <a class="biaoqian">9月<input value="9" onclick="dianji(this)" type="checkbox" name="yue" class="ids" id="jiuyue">&emsp;</a>
        </label>
        <label>
        <a class="biaoqian">10月<input value="10" onclick="dianji(this)" type="checkbox" name="yue" class="ids" id="shiyue">&emsp;</a>
        </label>
        <label>
        <a class="biaoqian">11月<input value="11" onclick="dianji(this)" type="checkbox" name="yue" class="ids" id="shiyiyue">&emsp;</a>
        </label>
        <label>
        <a class="biaoqian">12月<input value="12" onclick="dianji(this)" type="checkbox" name="yue" class="ids" id="shieryue">&emsp;</a>
        </label>
        <button type="button" id="qingchuTime"  class="btn btn-success radius" onclick="cleanTimeYusuan()" name="">清除时间</button>
        <button type="button" onclick="yuefenSumbit()" class="btn btn-success radius"  name=""><i class="Hui-iconfont">&#xe665;</i> 搜预算</button>
    </div>
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l"><a href="javascript:;" onclick="deleteAllYusuan()" class="btn btn-danger radius">
            <i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
              <a  href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/Yusuan/Yusuanguanli.jsp'" class="btn btn-primary radius" target="_parent">
                <span id="aa">1~6月预算信息</span></a>
            <a  href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/Yusuan/Yusuanguanli2.jsp'" class="btn btn-primary radius" target="_parent">
                <span id="bb">6~12月预算信息</span></a>
             <a href="http://localhost:8080/ShopManagement/exportExcel" class="daochu" id="daocus">导出</a>
        <a  onclick="yuSuandaoRu()" href="#" class="daoru" id="daorus">导入</a>
    </span> <span class="r"></span> </div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-hover table-bg table-sort">
            <thead>
            </thead>
            <tbody>
            </tbody>
        </table>
    </div>
</div>
<div id="hidden5">
    <input  type="hidden" value="Yusuan-list2" id="yemian"/>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../js/layer.js"></script>
<script type="text/javascript" src="../../js/H-ui.min.js"></script>
<script type="text/javascript" src="../../js/H-ui.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../../js/WdatePicker.js"></script>
<script type="text/javascript" src="../../js/jquery.dataTables.min.js"></script>
</body>
</html>