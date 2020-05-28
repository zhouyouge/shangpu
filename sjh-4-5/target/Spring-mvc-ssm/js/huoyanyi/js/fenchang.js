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
