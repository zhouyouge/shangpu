<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style>
        table tr>th{
            background: rgba(240,100,80,0.6);
        }
        /*设置奇数行颜色*/
        table tr:nth-child(odd)
        {
            background: rgba(80,80,80,0.6);
        }
        /*设置偶数行颜色*/
        table tr:nth-child(even)
        {
            background: #ccc;
        }
    </style>
    <script type="text/javascript" src="statics/js/jquery-1.12.4.min.js"></script>
    <script >
        $(function () {

        });

        //查看全部业态
        function getCommer() {
            alert("查看全部业态---------------------------");
            $.ajax({
                url:"commerList",
                type:"get",
                success:function(result){
                    alert("result"+result);
                    $("#commers").html(result);
                }
            });
        }
        //条状到index.html
        function tiaozhuan() {
            alert("正在跳转");
            /*location.href="http://localhost:8081/shopManagement2/src/main/webapp/index1.html?_ijt=avf6tpn1er1f5il35oqeqvf4r0";
           */
            location.href="index.jsp";

            /*/src/main/webapp/index1.jsp?_ijt=tf3bkaaj5e49rdabko8vv2hnhu*/
        }
    </script>
</head>
<body>
<div id="one">
    <div id="page">
        <div>
            <a href="#" onclick="getCommer()">查看全部业态</a>
        </div>
    </div>
    <div id="commerModule">
        <div id="commers">111
        </div>
    </div>
    <div id="yetai">
        <input  type="button" onclick="tiaozhuan()" />
    </div>

</div>
</body>
</html>