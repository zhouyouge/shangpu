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
     var aa=$("#br_coveredArea").val();
     if(aa!=""){
         param.brcoveredArea=aa;
     }
     var aaa=$("#br_residentialPool").val();
     if(aaa!=""){
         param.broperatingArea=aaa;
     }
     var zongmianji=$("#br_coveredArea").val();
     var zupingmianji=$("#br_residentialPool").val();
     var aaaa=zongmianji-zupingmianji;
     if(aaaa!=""){
         param.brresidentialPool=aaaa;
     }
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
     //甲方合同
     param.breakId=$("#breakId").val();
     param.comparyTitle=$("#companyTitle").val();
     param.companyAddress=$("#companyAddress").val();
     param.comanyPhone=$("#companyPhone").val();
     param.breakoutNamee=$("#breakoutNamee").val();
     //银行
     param.bankId=$("#bankId").val();
     param.breakIdd=$("#breakIdd").val();
     param.bankName=$("#bankName").val();
     param.bankaccount=$("#bank_account").val();
     param.bankrownum=$("#bank_rownum").val();
     param.bankName2=$("#bankName2").val();
     param.bankaccount2=$("#bank_account2").val();
     param.bankrownum2=$("#bank_rownum2").val();
     //开票
     param.billId=$("#billId").val();
     param.breakoutNameee=$("#breakoutNameee").val();
     param.billingName=$("#billingName").val();
     param.ratepayerNumber=$("#ratepayerNumber").val();
     param.billAddress=$("#billAddress").val();
     param.billPhone=$("#billPhone").val();
     param.bankNamee=$("#bankNames").val();
     param.billAccount=$("#billAccount").val();
     var rent_taxRate=$("#rent_taxRate").val();
     if(rent_taxRate!=""){
         param.rent_taxRate=rent_taxRate;
     }
     $.ajax({
         url:"http://localhost:8080/ShopManagement/updateBreakOut",
         type:"post",
         data:param,
         dataType:"json",
         success:function(result){
             alert("result"+JSON.stringify(result));
             if(result.result==true){
                 if(result.data=="修改成功甲方合同"){
                     window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Townercontract_List.jsp'";
                 }
                 if(result.data=="修改成功"){
                     window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/article-list.jsp'";
                 }
                 if(result.data=="修改成功银行"){
                     window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/BankAccount_List.jsp'";
                 }
                 if(result.data=="修改成功开票"){
                     window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/BillinformationExpression_List.jsp'";
                 }
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
         url: "http://localhost:8080/ShopManagement/deleteArticle?breakoutName="+breakoutName,
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
 //删除甲方合同信息
 function deleteTownercontract(breakId) {
     alert("删除甲方合同信息"+breakId);
     $.ajax({
         url: "http://localhost:8080/ShopManagement/deleteTownercontract?breakId="+breakId,
         type: "post",
         success: function (result) {
             alert("result" + JSON.stringify(result));
             if(result.result==true){
                 alert("删除成功");
                 window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/Townercontract_List.jsp'";
             }else{
                 alert(result.data);
             }
         }
     });
 }
 //删除银行信息
 function delete1BankAccount(bankId) {
     alert("删除银行信息"+bankId);
     $.ajax({
         url: "http://localhost:8080/ShopManagement/delete1BankAccount?bankId="+bankId,
         type: "post",
         success: function (result) {
             alert("result" + JSON.stringify(result));
             if(result.result==true){
                 alert("删除成功");
                 window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/BankAccount_List.jsp'";
             }else{
                 alert(result.data);
             }
         }
     });
 }
 //删除开票信息
 function deleteBillinformation(billId) {
     alert("删除开票信息"+billId);
     $.ajax({
         url: "http://localhost:8080/ShopManagement/deleteBillinformation?billId="+billId,
         type: "post",
         success: function (result) {
             alert("result" + JSON.stringify(result));
             if(result.result==true){
                 alert("删除成功");
                 window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/gongneng/BillinformationExpression_List.jsp'";
             }else{
                 alert(result.data);
             }
         }
     });
 }
 //修改甲方合同
 function xiugaiTownercontract(breakId) {
     alert("修改甲方合同信息"+breakId);
     window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/article-add.jsp'&&breakId="+breakId;
 }


 //修改甲方信息渲染
 function updateTownercontract(breakId ) {
     alert("修改楼栋信息渲染"+breakId);
     $.ajax({
         url:"http://localhost:8080/ShopManagement/updateTownercontract?breakId="+breakId,
         type:"post",
         dataType:"json",
         success:function(result){
             alert("result 222222"+JSON.stringify(result));
             $("#companyTitle").val(result.data.comparyTitle);
             $("#companyAddress").val(result.data.companyAddress);
             $("#companyPhone").val(result.data.comanyPhone);
             $("#breakoutNamee").val(result.data.breakoutName);
             $("#breakId").val(result.data.breakId);
         }
     });
 }
 //修改银行
 function xiugai1BankAccount(bankId) {
     alert("修改银行信息"+bankId);
     window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/article-add.jsp'&&bankId="+bankId;
 }
 //修改银行信息渲染
 function updateBankAccount(bankId) {
     alert("修改银行信息渲染"+bankId);
     $.ajax({
         url:"http://localhost:8080/ShopManagement/updateBankAccount?bankId="+bankId,
         type:"post",
         dataType:"json",
         success:function(result){
             alert("result 222222"+JSON.stringify(result));
             $("#bankName").val(result.data.bankName);
             $("#bank_account").val(result.data.bankaccount);
             $("#bank_rownum").val(result.data.bankrownum);
             $("#bankName2").val(result.data.bankName2);
             $("#bank_account2").val(result.data.bankaccount2);
             $("#bank_rownum2").val(result.data.bankrownum2);
             $("#bankId").val(result.data.bankId);
             $("#breakIdd").val(result.data.breakId);
         }
     });
 }

 //修改甲方合同
 function xiugiaBillinformation(billId) {
     alert("修改开票信息"+billId);
     window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/article-add.jsp'&&billId="+billId;
 }
 //修改开票信息渲染
 function updateBillinformation(billId) {
     alert("修改开票渲染"+billId);
     $.ajax({
         url:"http://localhost:8080/ShopManagement/updateBillinformation?billId="+billId,
         type:"post",
         dataType:"json",
         success:function(result){
             alert("result 222222"+JSON.stringify(result));
             $("#billId").val(result.data.billId);
             $("#breakoutNameee").val(result.data.breakoutName);
             $("#billingName").val(result.data.billingName);
             $("#ratepayerNumber").val(result.data.ratepayerNumber);
             $("#billAddress").val(result.data.billAddress);
             $("#billPhone").val(result.data.billPhone);
             $("#bankNames").val(result.data.bankName);
             $("#billAccount").val(result.data.billAccount);
             $("#rent_taxRate").val(result.data.rent_taxRate);
         }
     });
 }
