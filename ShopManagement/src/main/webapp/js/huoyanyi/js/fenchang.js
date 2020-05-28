 //分场信息添加页面显示
    function addbreakout() {
        /*alert("分场信息添加");*/
        $('#wodezhuomian').attr('src', 'fenchang/article-add.jsp');
    }

    //分场信息添加提交
 function addarticle() {
   /*  alert("分场信息添加提交");*/
     var param={};
     param.brabbreviation=$("#br_abbreviation").val();
     param.breakoutName=$("#breakoutName").val();
     param.brcoding=$("#br_coding").val();
     param.brprincipal=$("#br_principal").val();
     param.brworkType=$("#br_workType").val();
     param.brcoveredArea=$("#br_coveredArea").val();
     param.broperatingArea=$("#br_residentialPool").val();
     var zongmianji=$("#br_coveredArea").val();
     var zupingmianji=$("#br_residentialPool").val();
     param.brresidentialPool=zongmianji-zupingmianji;
     alert(param.brresidentialPool);
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
     if($("#br_BreakoutStatus1").val()!=null){
         brBreakoutStatus=$("#br_BreakoutStatus1").val();
         num=1;
     }else if($("#br_BreakoutStatus2").val()!=null){
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
     //分场营业执照
     /*param.brBreakoutLicense=$("#star2").val();*/
     param.brBreakoutLicense="分场营业执照";

     //霍彦伊的代码开始
     param.comparyTitle=$("#companyTitle").val();
     param.companyAddress=$("#companyAddress").val();
     param.comanyPhone=$("#companyPhone").val();

     param.bankName=$("#bankName").val();
     param.bankaccount=$("#bank_account").val();
     param.bankrownum=$("#bank_rownum").val();
     param.bankName2=$("#bankName2").val();
     param.bankaccount2=$("#bank_account2").val();
     param.bankrownum2=$("#bank_rownum2").val();

     param.billingName=$("#billingName").val();
     param.ratepayerNumber=$("#ratepayerNumber").val();
     param.billAddress=$("#billAddress").val();
     param.billPhone=$("#billPhone").val();
     param.bankName1=$("#bankNames").val();
     param.billAccount=$("#billAccount").val();
     param.rent_taxRate=$("#rent_taxRate").val();
     var billcreatetime=new Date($("#bill_createtime").val());
     param.bill_createtime=bill_createtime;
     var billupdatetime=new Date($("#bill_updatetime").val());
     param.bill_updatetime=bill_updatetime;
     alert(bill_updatetime+":"+bill_createtime);
     //霍彦一的代码结束
     alert("参数："+JSON.stringify(param));
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

 //取消添加
 function removeArticle() {
     window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/article-add.jsp";
 }
 
 //分场信息修改提交
 function updateArticle(breakoutName) {
   alert("分场信息修改提交"+breakoutName);
     var param={};
     param.brabbreviation=$("#br_abbreviation").val();
     param.breakoutName=$("#breakoutName").val();
     param.brcoding=$("#br_coding").val();
     param.brprincipal=$("#br_principal").val();
     param.brworkType=$("#br_workType").val();
     param.brcoveredArea=$("#br_coveredArea").val();
     param.broperatingArea=$("#br_residentialPool").val();
     var zongmianji=$("#br_coveredArea").val();
     var zupingmianji=$("#br_residentialPool").val();
     param.brresidentialPool=zongmianji-zupingmianji;
     alert(param.brresidentialPool);
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
     if($("#br_BreakoutStatus1").val()!=null){
         brBreakoutStatus=$("#br_BreakoutStatus1").val();
         num=1;
     }else if($("#br_BreakoutStatus2").val()!=null){
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
     //分场营业执照
     /*param.brBreakoutLicense=$("#star2").val();*/
     param.brBreakoutLicense="分场营业执照";
     $.ajax({
         url:"http://localhost:8080/ShopManagement/updateBreakOut",
         type:"post",
         data:param,
         dataType:"json",
         success:function(result){
             alert("result"+JSON.stringify(result));
             if(result.result==true){
                 window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/article-list.jsp'";
             }else{
                 alert(result.data);
             }
         }
     });
 }

 //
 function xiugaiArticle(breakoutName) {
     alert("修改楼栋信息"+breakoutName);
     window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/article-add.jsp'&&breakoutName="+breakoutName;
 }

 //修改分场信息渲染
 function xiugaiArticleShow(breakoutName ) {
     alert("修改楼栋信息渲染"+breakoutName);
     $.ajax({
         url:"http://localhost:8080/ShopManagement/updateBreakShow?breakoutName="+breakoutName,
         type:"post",
         dataType:"json",
         success:function(result){
             alert("result 222222"+JSON.stringify(result));
             $("#br_abbreviation").val(result.data.brabbreviation);
             $("#breakoutName").val(result.data.breakoutName);
             $("#br_coding").val(result.data.brcoding);
             $("#br_principal").val(result.data.brprincipal);
             $("#br_workType").val(result.data.brworkType);
             $("#br_coveredArea").val(result.data.brcoveredArea);
             $("#br_operatingArea").val(result.data.broperatingArea);
             $("#br_residentialPool").val(result.data.brabbreviation);
             $("#br_residentialPoolArea").val(result.data.brresidentialPool);
             if((result.data.broperationalRegime)!="改营"){
               $("#br_operationalRegime1").attr('checked','true');
             }else if((result.data.broperationalRegime)!="在建"){
                 $("#br_operationalRegime2").attr('checked','true');
             }else if((result.data.broperationalRegime)!="关闭"){
                 $("#br_operationalRegime3").attr('checked','true');
             }
             $("#brcomment").val(result.data.brcomment);
             $("#br_abbreviation").val(result.data.brabbreviation);
             var now4 = new Date(result.data.br_createtime);
             var day4 = ("0" + now4.getDate()).slice(-2);
             var month4 = ("0" + (now4.getMonth() + 1)).slice(-2);
             var today4 = now4.getFullYear()+"-"+(month4)+"-"+(day4) ;
             $("#bill_createtime").val(today4);
             var now3 = new Date(result.data.br_updatetime);
             var day3 = ("0" + now3.getDate()).slice(-2);
             var month3 = ("0" + (now4.getMonth() + 1)).slice(-2);
             var today3 = now3.getFullYear()+"-"+(month3)+"-"+(day3) ;
             $("#bill_updatetime").val(today3);
             if($(result.data.brBreakoutStatus)!="改建"){
                 brBreakoutStatus=$("#br_BreakoutStatus1").attr('checked','true');
             }else if((result.data.brBreakoutStatus)!="在营"){
                 brBreakoutStatus=$("#br_BreakoutStatus2").attr('checked','true');
             }
             //图片暂时无法上传
             /* param.brBreakoutDiagram=$("#filePicker").val();*/
          /*   param.brBreakoutDiagram='ddddddddddddd';
             //分场营业执照
             /!*param.brBreakoutLicense=$("#star2").val();*!/
             param.brBreakoutLicense="分场营业执照";*/
         }
     });
 }

 //批量删除
 function deleteAllArticle() {
     alert("删除楼栋信息");
 }

 //删除分场信息
 function deleteArticle(breakoutName) {
     alert("删除楼栋信息"+breakoutName);
     $.ajax({
         url: "http://localhost:8080/ShopManagement/deleteBreakOut?breakoutName="+breakoutName,
         type: "post",
         success: function (result) {
             alert("result" + JSON.stringify(result));
             if(result.result==true){
                 alert("删除成功");
                 window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/article-list.jsp'";
             }else{
                 alert(result.data);
             }
         }
     });
 }


 //删除所有
 function deleteAtrile() {
     alert("删除所有");
 }
