 //分场信息添加页面显示
    function addbreakout() {
        alert("分场信息添加");
        $('#wodezhuomian').attr('src', 'fenchang/article-add.jsp');
    }

    //分场信息添加提交
 function addarticle() {
     alert("分场信息添加提交");
     var param={};
     param.brabbreviation=$("#br_abbreviation").val();
     param.breakoutName=$("#breakoutName").val();
     param.brcoding=$("#br_coding").val();
     param.brprincipal=$("#br_principal").val();
     param.brworkType=$("#br_workType").val();
     param.brcoveredArea=$("#br_coveredArea").val();
     param.broperatingArea=$("#br_residentialPool").val();
     //无法获取公摊面积
   /*  param.brresidentialPool= $("#br_residentialPool").val()-$("#br_residentialPool").val();*/
     param.brresidentialPool=11;
     var  aa= $("#br_coveredArea").val();
     var  bb=$("#br_residentialPool").val();
     alert("mainji:"+(aa-bb));
     var broperationalRegime;
     if($("#br_operationalRegime1")!=null){
         broperationalRegime=$("#br_operationalRegime1").val();
     }else if($("#br_operationalRegime2")!=null){
         broperationalRegime=$("#br_operationalRegime2").val();
     }else if($("#br_operationalRegime3")!=null){
         broperationalRegime=$("#br_operationalRegime3").val();
     }
     param.broperationalRegime=broperationalRegime;
     var brBreakoutStatus;
     var num;
     if($("#br_BreakoutStatus1")!=null){
         brBreakoutStatus=$("#br_BreakoutStatus1").val();
         num=1;
     }else if($("#br_BreakoutStatus2")!=null){
         brBreakoutStatus=$("#br_BreakoutStatus2").val();
         num=2;
     }
     param.brBreakoutStatus=num;
     param.brcomment=$("#brcomment").val();
     param.br_abbreviation=$("#commentdatemin").val();
     param.br_abbreviation=$("#commentdatemax").val();
     //图片暂时无法上传
    /* param.brBreakoutDiagram=$("#filePicker").val();*/
     param.brBreakoutDiagram='ddddddddddddd';
     param.brBreakoutLicense=$("#star2").val();
     alert(JSON.stringify(param));
     $.ajax({
         url:"http://localhost:8080/ShopManagement/addBreakOut",
         type:"post",
         data:param,
         dataType:"json",
         success:function(result){
             alert("result"+JSON.stringify(result));
         }
     });



 }
 $(
     function(){
        /* alert("wwwwwwwwwwwwwwwwwwwwwwwwwwww");*/
     }
 );
