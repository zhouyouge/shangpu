<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript" src="js/wangtao/js/layui.all.js"></script>
<script type="text/javascript" src="js/wangtao/js/layui.js"></script>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layPage快速使用</title>
    <link rel="stylesheet" href="css/layui.css" media="all">
</head>
<body>

<div id="test1"></div>

<script src="js/wangtao/js/layui.js"></script>
<script>
    layui.use('laypage', function(){
        var laypage = layui.laypage;

        //执行一个laypage实例
        laypage.render({
            elem: 'test1' //注意，这里的 test1 是 ID，不用加 # 号
            ,count: 50 //数据总数，从服务端得到
        });
    });
</script>
</body>
</html>
<%--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="js/wangtao/js/layui.all.js"></script>
<script type="text/javascript" src="js/wangtao/js/layui.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <input type="" name="" id="" value="" />
    <div id="text"></div>
    <script>
        layui.user(['laydate','laydate']),function (){
            var laydate =layui.laydate,
                laypage=layui.laypage;
            laydate.render({
                elem: 'date',
                type: 'date',
                format: "yyyy/MM/dd",
                theme: "grid"
            });
            laypage.render({
                elem:"text",
                count:"10"
            });
        }
    </script>
</div>
</body>
</html>
--%>
