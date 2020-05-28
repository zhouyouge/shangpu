$(function () {
/*alert("outLogin");*/
});
function outLogin() {
    if(confirm("确定要退出登录吗？")){
        $.ajax({
            url:"login",
            type:"get",
            dataType:"json",
            success:function (result){
                alert(JSON.stringify(result));
                if(result.result==true&&result.flag==1){
                    location.href="index.jsp";
                }
            }
        });//ajax结束
    }
}