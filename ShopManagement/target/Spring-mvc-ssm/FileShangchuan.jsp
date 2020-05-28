<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="statics/js/jquery-1.12.4.min.js"></script>
<script>
    $(function () {
        alert("ffffff");
    })
    function yuSuandaoRu() {
        $.ajax({
            url:"importExcelss",
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
    <title>Title</title>
</head>
<body>
<div>
    <div>
        <a href="exportExcel">导出</a>
        <a  onclick="yuSuandaoRu()" href="#">导入</a>
    </div>
    <div id="daoru"></div>
</div>

</body>
</html>
