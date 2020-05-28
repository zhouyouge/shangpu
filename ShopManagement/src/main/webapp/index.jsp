<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="statics/js/jquery-1.12.4.min.js"></script>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="/favicon.ico" />
    <link rel="Shortcut Icon" href="/favicon.ico" />
    <%--	<!--[if lt IE 9]>
        <script type="text/javascript" src="lib/html5shiv.js"></script>
        <script type="text/javascript" src="lib/respond.min.js"></script>
        <![endif]-->--%>
    <link rel="stylesheet" type="text/css" href="css/min.css" />
    <link rel="stylesheet" type="text/css" href="css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="css/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="css/skin.css" id="skin" />
    <%--style.css为自己的样式--%>
    <%--<link rel="stylesheet" type="text/css" href="static/css/style.css" />--%>
    <!--[if IE 6]>
    <script type="text/javascript" src="js/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>商铺管理系统</title>
    <meta name="keywords" content="商铺管理系统">
    <meta name="description" content="商铺管理系统">
</head>
<body>
<header class="navbar-wrapper">
<c:if test="${empty user}">
<script>
/*   alert("用户未登录，请登录");*/
   location.href="login2.jsp";
</script>
</c:if>
    <div class="navbar navbar-fixed-top">
            <span class="logo navbar-slogan f-l mr-10 hidden-xs">商铺系统管理 版本v1.0</span>
            <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
            <nav class="nav navbar-nav">
                <ul class="cl">
                    <li class="dropDown dropDown_hover"><a href="javascript:;" class="dropDown_A"><i class="Hui-iconfont">&#xe600;</i> 新增 <i class="Hui-iconfont">&#xe6d5;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" onclick="article_add('添加资讯','article-add.html')"><i class="Hui-iconfont">&#xe616;</i> 资讯</a></li>
                            <li><a href="javascript:;" onclick="picture_add('添加资讯','picture-add.html')"><i class="Hui-iconfont">&#xe613;</i> 图片</a></li>
                            <li><a href="javascript:;" onclick="product_add('添加资讯','product-add.html')"><i class="Hui-iconfont">&#xe620;</i> 产品</a></li>
                            <li><a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')"><i class="Hui-iconfont">&#xe60d;</i> 用户</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
            <nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
                <ul class="cl">
                    <li>${user.roleName}</li>
                    <li class="dropDown dropDown_hover">
                        <a href="#" class="dropDown_A">${user.userName}<i class="Hui-iconfont">&#xe6d5;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" onClick="myselfinfo()">个人信息</a></li>
                            <li><a href="#">切换账户</a></li>
                            <li  onclick="javascript:outLogin()"><a href="#">退出</a></li>
                        </ul>
                    </li>
                    <li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
                    <li id="Hui-skin" class="dropDown right dropDown_hover"> <a href="javascript:;" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
                            <li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
                            <li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
                            <li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
                            <li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
                            <li><a href="javascript:;" data-val="orange" title="橙色">橙色</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<aside class="Hui-aside">
    <div class="menu_dropdown bk_2">
        <dl id="menu-article" >
            <dt id="dianji1"><i class="Hui-iconfont">&#xe616;</i> 基础模块<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd >
                <ul>
                    <li><a  data-title="资讯管理" onclick="javascript:addbreakout()">新增分场信息</a></li>
                    <li><a  data-title="资讯管理" onclick="javascript:addtower()">新增楼栋信息</a></li>
                    <li><a  data-title="资讯管理" onclick="javascript:addfloor()">新增楼层信息</a></li>
                    <li><a  data-title="资讯管理" onclick="javascript:addbooth()">新增摊位信息</a></li>
                    <li><a  data-title="资讯管理" onclick="javascript:addtenement()">新增租户信息</a></li>
                    <li><a  data-title="资讯管理" onclick="javascript:addshopPrice()">新增一铺一价信息</a></li>
                    <li><a  data-title="资讯管理" onclick="javascript:adddiversified(1)">新增多经信息</a></li>
                </ul>
            </dd>
        </dl>
        <dl >
            <dt id="dianji2"><i class="Hui-iconfont">&#xe613;</i> 图片管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="picture-list.html" data-title="图片管理" href="javascript:void(0)">图片管理</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-product" >
            <dt id="dianji3" ><i class="Hui-iconfont">&#xe620;</i> 数据管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a  data-title="品牌管理" onclick="javascript:queryArticleList()">分场信息管理</a></li>
                    <li><a  data-title="分类管理" onclick="queryTownerPriceList()">楼栋信息管理</a></li>
                    <li><a  data-title="产品管理" onclick="queryFloorList()">楼层信息管理</a></li>
                    <li><a  data-title="产品管理" onclick="queryBoothList()">摊位信息管理</a></li>
                    <li><a  data-title="产品管理" onclick="queryTenementList()">租户信息管理</a></li>
                    <li><a  data-title="产品管理" onclick="queryAshopPriceList()">一铺一价信息管理</a></li>
                    <li><a  data-title="产品管理" onclick="queryDiversidiedList()">多经信息管理</a></li>
                    <li><a  data-title="产品管理" onclick="queryHousingSource()">房屋来源信息管理</a></li>
                    <li><a  data-title="产品管理" onclick="queryHouseSourceList()">房屋去向信息管理</a></li>
                    <li><a  data-title="产品管理" onclick="queryPaymentTermList()">收款方信息管理</a></li>
                    <li><a  data-title="产品管理" onclick="queryTownercontractList()">甲方合同信息管理</a></li>
                    <li><a  data-title="产品管理" onclick="queryPaymentTermList()">银行账户信息管理</a></li>
                    <li><a  data-title="产品管理" onclick="queryPaymentTermList()">开票信息管理</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-comments">
            <dt id="dianji4"><i class="Hui-iconfont">&#xe622;</i> 评论管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="http://h-ui.duoshuo.com/admin/" data-title="评论列表" href="javascript:;">评论列表</a></li>
                    <li><a data-href="feedback-list.html" data-title="意见反馈" href="javascript:void(0)">意见反馈</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-member">
            <dt id="dianji5"><i class="Hui-iconfont">&#xe60d;</i> 会员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="member-list.jsp" data-title="会员列表" href="javascript:;">会员列表</a></li>
         <%--           <li><a data-href="member-del.jsp" data-title="删除的会员" href="javascript:;">删除的会员</a></li>
                    <li><a data-href="member-level.jsp" data-title="等级管理" href="javascript:;">等级管理</a></li>
                    <li><a data-href="member-scoreoperation.jsp" data-title="积分管理" href="javascript:;">积分管理</a></li>
                    <li><a data-href="member-record-browse.jsp" data-title="浏览记录" href="javascript:void(0)">浏览记录</a></li>
                    <li><a data-href="member-record-download.jsp" data-title="下载记录" href="javascript:void(0)">下载记录</a></li>
                    <li><a data-href="member-record-share.jsp" data-title="分享记录" href="javascript:void(0)">分享记录</a></li>--%>
                </ul>
            </dd>
        </dl>
        <dl id="yetaiguanli">
            <dt id="dianji9"><i class="Hui-iconfont">&#xe60d;</i> 业态管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a  onclick="getCommers()">业态列表</a></li>
<%--                    <li><a data-href="member-del.jsp" data-title="删除的会员" href="javascript:;">删除的会员</a></li>
                    <li><a data-href="member-level.jsp" data-title="等级管理" href="javascript:;">等级管理</a></li>
                    <li><a data-href="member-scoreoperation.jsp" data-title="积分管理" href="javascript:;">积分管理</a></li>
                    <li><a data-href="member-record-browse.jsp" data-title="浏览记录" href="javascript:void(0)">浏览记录</a></li>
                    <li><a data-href="member-record-download.jsp" data-title="下载记录" href="javascript:void(0)">下载记录</a></li>
                    <li><a data-href="member-record-share.jsp" data-title="分享记录" href="javascript:void(0)">分享记录</a></li>--%>
                </ul>
            </dd>
        </dl>
        <dl id="menu-admin">
            <dt id="dianji6"><i class="Hui-iconfont">&#xe62d;</i> 管理员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a  data-title="角色管理" onclick="roleList()">角色管理</a></li>
                    <li><a data-href="admin-permission.jsp" data-title="权限管理" onclick="Quanxianguanli()">员工角色对照信息管理</a></li>
                    <li><a data-href="admin-list.jsp" data-title="管理员列表" onclick="guanliyuanliebiao()">员工列表</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-tongji">
            <dt id="dianji7"><i class="Hui-iconfont">&#xe61a;</i> 系统统计<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a  data-title="折线图" onclick="Yusuanguanli()">预算导入导出</a></li>
                    <li><a  data-title="折线图" onclick="AtricleBoothCount()">折线图</a></li>
      <%--              <li><a data-href="charts-2.jsp" data-title="时间轴折线图" href="javascript:void(0)">时间轴折线图</a></li>
                    <li><a data-href="charts-3.jsp" data-title="区域图" href="javascript:void(0)">区域图</a></li>
                    <li><a data-href="charts-4.jsp" data-title="柱状图" href="javascript:void(0)">柱状图</a></li>
                    <li><a data-href="charts-5.jsp" data-title="饼状图" href="javascript:void(0)">饼状图</a></li>
                    <li><a data-href="charts-6.jsp" data-title="3D柱状图" href="javascript:void(0)">3D柱状图</a></li>
                    <li><a data-href="charts-7.jsp" data-title="3D饼状图" href="javascript:void(0)">3D饼状图</a></li>--%>
                </ul>
            </dd>
        </dl>
        <dl id="menu-system">
            <dt id="dianji8"><i class="Hui-iconfont">&#xe62e;</i> 系统管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="system-base.jsp" data-title="系统设置" href="javascript:void(0)">系统设置</a></li>
  <%--                  <li><a data-href="system-category.jsp" data-title="栏目管理" href="javascript:void(0)">栏目管理</a></li>
                    <li><a data-href="system-data.jsp" data-title="数据字典" href="javascript:void(0)">数据字典</a></li>
                    <li><a data-href="system-shielding.jsp" data-title="屏蔽词" href="javascript:void(0)">屏蔽词</a></li>
                    <li><a data-href="system-log.jsp" data-title="系统日志" href="javascript:void(0)">系统日志</a></li>--%>
                </ul>
            </dd>
        </dl>
    </div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
    <div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
        <div class="Hui-tabNav-wp">
            <ul id="min_title_list" class="acrossTab cl">
                <li class="active">
                    <span title="我的桌面" data-href="welcome2.jsp">我的桌面</span>
                    <em></em></li>
            </ul>
        </div>
        <div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
    </div>
    <div id="iframe_box" class="Hui-article">
        <div class="show_iframe">
            <div style="display:none" class="loading"></div>
            <iframe scrolling="yes" frameborder="0" src="welcome2.jsp" id="wodezhuomian">
                <%-- <div id="commers"></div>--%>
            </iframe>
        </div>
    </div>
</section>

<div class="contextMenu" id="Huiadminmenu">
    <ul>
        <li id="closethis">关闭当前 </li>
        <li id="closeall">关闭全部 </li>
    </ul>
</div>
<div id="hidden" style="display: none">
    <input value=<%=request.getParameter("name")%> id="hidden"  style="display: none" />
</div>
<script>//
    <%
     if(request.getParameter("UserRoleid")!=null){
       session.setAttribute("UserRoleid",request.getParameter("UserRoleid"));
    }
      if(request.getParameter("userId")!=null){
       session.setAttribute("userId",request.getParameter("userId"));
    }
     if(request.getParameter("id")!=null){
       session.setAttribute("id",request.getParameter("id"));
    }
     if(request.getParameter("commercialName")!=null){
       session.setAttribute("commercialName",request.getParameter("commercialName"));
    }
    if(request.getParameter("boothId")!=null){
       session.setAttribute("boothId",request.getParameter("boothId"));
    }
    if(request.getParameter("ashopId")!=null){
         session.setAttribute("ashopId",request.getParameter("ashopId"));
    }
     if(request.getParameter("tenementId")!=null){
         session.setAttribute("tenementId",request.getParameter("tenementId"));
    }
   if(request.getParameter("boothNumber")!=null){
         session.setAttribute("boothNumber",request.getParameter("boothNumber"));
    }
    if(request.getParameter("floorName")!=null){
         session.setAttribute("floorName",request.getParameter("floorName"));
    }
     if(request.getParameter("towerName")!=null){
         String towerName=request.getParameter("towerName");
         session.setAttribute("towerName",towerName);
    }
        if(request.getParameter("breakoutName")!=null){
         String breakoutName=request.getParameter("breakoutName");
         session.setAttribute("breakoutName",breakoutName);
    }
              if(request.getParameter("type1")!=null){
         String type1=request.getParameter("type1");
         session.setAttribute("type1",type1);
    }
    %>
   if( $("#hidden").val()!=null){
       $('#wodezhuomian').attr('src',<%=request.getParameter("name")%>);  //Request.QueryString["towerName"].ToString()
   }
    if( $("#hidden").val()==null){
        $('#wodezhuomian').attr('src','welcome.jsp');
    }
</script>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/layer.js"></script>
<script type="text/javascript" src="js/H-ui.min.js"></script>
<script type="text/javascript" src="statics/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/H-ui.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="js/jquery.contextmenu.r2.js"></script>
<%--商铺管理项目仙相关js,开始--%>
<script type="text/javascript" src="js/wangtao/js/zuocecaidan.js"></script><%--左侧菜单下拉js--%>
<script type="text/javascript" src="js/wangtao/js/yetai.js"></script><%--业态操作js--%>
<script type="text/javascript" src="js/huoyanyi/js/fenchang.js"></script><%--分场操作js--%>
<script type="text/javascript" src="js/huoyanyi/js/loudong.js"></script><%--楼栋操作js--%>
<script type="text/javascript" src="js/huoyanyi/js/louceng.js"></script><%--楼层操作js--%>
<script type="text/javascript" src="js/huoyanyi/js/tanwei.js"></script><%--摊位操作js--%>
<script type="text/javascript" src="js/huoyanyi/js/zuhu.js"></script><%--租户操作js--%>
<script type="text/javascript" src="js/huoyanyi/js/yipuyijia.js"></script><%--一铺一价操作js--%>
<script type="text/javascript" src="js/huoyanyi/js/duojing.js"></script><%--多经操作js--%>
<script type="text/javascript" src="js/huoyanyi/js/Quancha.js"></script><%--分场操作js--%>
<script type="text/javascript" src="js/wangtao/js/outLogin.js"></script><%--退出登录--%>
<%--商铺管理项目仙相关js,结束--%>
<script type="text/javascript">
    $(function(){

      /*  alert("楼栋添加");
    //分场添加
      location.href="fenchang/article-add.jsp";
    	$("#min_title_list li").contextMenu('Huiadminmenu', {
            bindings: {
                'closethis': function(t) {
                    console.log(t);
                    if(t.find("i")){
                        t.find("i").trigger("click");
                    }
                },
                'closeall': function(t) {
                    alert('Trigger was '+t.id+'\nAction was Email');
                },
            }
        });*/
    });  //入口函数结束

        /*个人信息*/
    function myselfinfo(){
        layer.open({
            type: 1,
            area: ['300px','200px'],
            fix: false, //不固定
            maxmin: true,
            shade:0.4,
            title: '查看信息',
            content: '<div>管理员信息</div>'
        });
    }

    /*资讯-添加*/
    function article_add(title,url){
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }
    /*图片-添加*/
    function picture_add(title,url){
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }
    /*产品-添加*/
    function product_add(title,url){
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }
    /*用户-添加*/
    function member_add(title,url,w,h){
        layer_show(title,url,w,h);
    }

</script>


</body>
</html>
