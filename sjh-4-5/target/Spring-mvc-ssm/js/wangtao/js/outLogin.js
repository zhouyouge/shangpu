$(function () {
/*alert("outLogin");*/
});
function outLogin() {
    if(confirm("确定要退出登录吗？")){
        $.ajax({
            url:"login2.jsp",
            type:"get",
            dataType:"json",
            success:function (result){
                if(result.result==true&&result.flag==1){
                    location.href="index.jsp";
                }
            }
        });//ajax结束
    }
}