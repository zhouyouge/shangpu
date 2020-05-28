$(function () {
    queryList();
    var yemian=$("#yemian").val();
});

function queryList() {
    $("tbody").html("");
    var yemian=$("#yemian").val();
    //role表全查，已启用信息
    if(yemian=="RoleList") {
/*    if(param==null){
        var param={};
        param.curPage=1;
        param.PageSize=5;
    }*/
    $.ajax({
        url:"http://localhost:8080/ShopManagement/RoleList",
        type:"post",
        dataType:"html",
        success:function(result){
              alert("result"+result);
            $("tbody").html(result);
          }
       });
     }
    //未启用角色信息
    if(yemian=="noRoleList") {
        $.ajax({
            url:"http://localhost:8080/ShopManagement/noRoleList",
            type:"post",
            dataType:"html",
            success:function(result){
                alert("result"+result);
                $("tbody").html(result);
            }
        });
    }
    //用户信息全查
    if(yemian=="UserList") {
        $.ajax({
            url:"http://localhost:8080/ShopManagement/UserList",
            type:"post",
            dataType:"html",
            success:function(result){
              /*  alert("result"+result);*/
                $("tbody").html(result);
            }
        });
    }
    //未启用用户信息全查
    if(yemian=="noUserList") {
        $.ajax({
            url:"http://localhost:8080/ShopManagement/noUserList",
            type:"post",
            dataType:"html",
            success:function(result){
                $("tbody").html(result);
            }
        });
    }
    if(yemian=="UserRoleList") {
        $.ajax({
            url:"http://localhost:8080/ShopManagement/UserRoleList",
            type:"post",
            dataType:"html",
            success:function(result){
                $("tbody").html(result);
            }
        });
    }
    if(yemian=="noUserRoleList") {
        alert("noUserRoleList");
        $.ajax({
            url:"http://localhost:8080/ShopManagement/noUserRoleList",
            type:"post",
            dataType:"html",
            success:function(result){
                $("tbody").html(result);
            }
        });
    }

}
//修改noRoleList参数渲染  updatenoRoleShow
//修改RoleList参数渲染
function updatenoRoleShow(id) {
    alert("修改角色表信息1："+id);
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updatenoRoleShow?id="+id,
        type:"post",
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
            var type=2;
            if(result.result==true){
                var flag1=checkRole(result.data.roleName,result.data.comment,result.data.roleStatus,result.data.ro_createDate,result.data.ro_modificationDate,type);
                if(flag1){
                    $("#roleName").val(result.data.roleName);
                    $("#comment").val(result.data.comment);
                    if((result.data.roleStatus)==1){
                        $("#roleStatus1").attr('checked','true');
                    }else  if((result.data.roleStatus)==1) {
                        $("#roleStatus2").attr('checked','true');
                    }else  if((result.data.roleStatus)==1) {
                        $("#roleStatus3").attr('checked','true');
                    }
                    var now4 = new Date(result.data.ro_createDate);
                    var day4 = ("0" + now4.getDate()).slice(-2);
                    var month4 = ("0" + (now4.getMonth() + 1)).slice(-2);
                    var today4 = now4.getFullYear()+"-"+(month4)+"-"+(day4) ;
                    $("#ro_createDate").val(today4);
                    var now3 = new Date(result.data.ro_modificationDate);
                    var day3 = ("0" + now3.getDate()).slice(-2);
                    var month3 = ("0" + (now4.getMonth() + 1)).slice(-2);
                    var today3 = now3.getFullYear()+"-"+(month3)+"-"+(day3) ;
                    $("#ro_modificationDate").val(today3);
                }else{
                    alert("未获取将要修改的角色的参数，即将取消本次修改");
                    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/roleList.jsp'";
                }
            }else{
                alert(result.data);
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/roleList.jsp'";
            }
        }
    });
}

//修改RoleList参数渲染
function updateRoleShow(id) {
    alert("修改角色表信息1："+id);
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updateRoleShow?id="+id,
        type:"post",
        dataType:"json",
        success:function(result){
            alert("result"+JSON.stringify(result));
            var type=2;
            if(result.result==true){
                var flag1=checkRole(result.data.roleName,result.data.comment,result.data.roleStatus,result.data.ro_createDate,result.data.ro_modificationDate,type);
                if(flag1){
                    $("#roleName").val(result.data.roleName);
                    $("#comment").val(result.data.comment);
                    if((result.data.roleStatus)==1){
                        $("#roleStatus1").attr('checked','true');
                    }else  if((result.data.roleStatus)==1) {
                        $("#roleStatus2").attr('checked','true');
                    }else  if((result.data.roleStatus)==1) {
                        $("#roleStatus3").attr('checked','true');
                    }
                    var now4 = new Date(result.data.ro_createDate);
                    var day4 = ("0" + now4.getDate()).slice(-2);
                    var month4 = ("0" + (now4.getMonth() + 1)).slice(-2);
                    var today4 = now4.getFullYear()+"-"+(month4)+"-"+(day4) ;
                    $("#ro_createDate").val(today4);
                    var now3 = new Date(result.data.ro_modificationDate);
                    var day3 = ("0" + now3.getDate()).slice(-2);
                    var month3 = ("0" + (now4.getMonth() + 1)).slice(-2);
                    var today3 = now3.getFullYear()+"-"+(month3)+"-"+(day3) ;
                    $("#ro_modificationDate").val(today3);

                }else{
                    alert("未获取将要修改的角色的参数，即将取消本次修改");
                    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/roleList.jsp'";
                }
            }else{
                alert(result.data);
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/roleList.jsp'";
            }
        }
    });
}
// 修改角色表信息
function Rolexiugai(id) {
    var type1=1;
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/Role-add.jsp'&&id="+id+"&&type1="+type1;
}
// 修改角色表信息
function Rolexiugai2(id) {
    var type1=2;
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/Role-add.jsp'&&id="+id+"&&type1="+type1;
}
//删除角色表信息
function deleteRole(id) {
    alert("删除角色表信息"+id);
  if(confirm("是否删除该角色信息")){
      $.ajax({
          url:"http://localhost:8080/ShopManagement/deleteRole?id="+id,
          type:"post",
          dataType:"json",
          success:function(result){
              alert("result"+JSON.stringify(result));
              if(result.result==true){
                  alert("删除成功");
              }else{
                  alert(result.data);
              }
              window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/roleList.jsp'";
          }
      });
  }else{
      window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/roleList.jsp'";
  }

}

//添加参数验证
function checkRole(roleName,comment,roleStatus,chuangjian,xiugai,type) {
  if(type==1){
      var flag=false;
      if(roleName=="" || roleName==null){
          alert("角色名称不能为空");
          return false;
      }
      if(roleName=="" || roleName==null){
          alert("角色描述不能为空");
          return false;
      }
      return true;
  }else if(type==2){
      var flag=false;
      if(roleName=="" || roleName==null){
          alert("角色名称不能为空");
          return false;
      }
      if(roleName=="" || roleName==null){
          alert("角色描述不能为空");
          return false;
      }
      if(roleName=="" || roleName==null){
          alert("创建时间");
          return false;
      }
      if(roleName=="" || roleName==null){
          alert("修改时间");
          return false;
      }
      return true;
  }
}
//修改角色表信息提交
function updateRoleSumbit() {
    alert("修改角色表信息提交");
    var id=$("#id").val();
    var roleName=$("#roleName").val();
    var comment=$("#comment").val();
    var roleStatus1=$("#roleStatus").val();
    var roleStatus;
    if(roleStatus1=="信息可用"){
        roleStatus=1;
    }
    if(roleStatus1=="信息不可用"){
        roleStatus=2;
    }
    if(roleStatus1=="审核中"){
        roleStatus=3;
    }
    var chuangjian=new Date($("#ro_createDate").val());
    var xiugai=new Date($("#ro_modificationDate").val());
    alert(roleName+":"+comment+":"+roleStatus+":"+chuangjian+":"+xiugai);
    if(checkRole(roleName,comment,roleStatus,chuangjian,xiugai,2)){
        var param={};
        param.id=id;
        param.roleName=roleName;
        param.comment=comment;
        param.roleStatus=roleStatus;
        param.ro_createDate=chuangjian;
        param.ro_modificationDate=xiugai;
        $.ajax({
            url:"http://localhost:8080/ShopManagement/updateRole",
            type:"post",
            data:param,
            dataType:"json",
            success:function(result){
                alert("result"+JSON.stringify(result));
                if(result.result==true){
                    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/roleList.jsp'";
                }else{
                alert(result.data);
                }
            }
        });
    }else{
        alert("为正确获取到修改后的参数，即将返回角色全查页面");
        window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/roleList.jsp'";
    }


}
//添加角色表信息提交
function addRoleSumbit() {
    alert("添加角色表信息提交");
    var roleName=$("#roleName").val();
    var comment=$("#comment").val();
    var roleStatus1=$("#roleStatus").val();
    var roleStatus;
    if(roleStatus1=="信息可用"){
        roleStatus=1;
    }
    if(roleStatus1=="信息不可用"){
        roleStatus=2;
    }
    if(roleStatus1=="审核中"){
        roleStatus=3;
    }
    var chuangjian=new Date($("#ro_createDate").val());
    var xiugai=new Date($("#ro_modificationDate").val());
    if(checkRole(roleName,comment,roleStatus,chuangjian,xiugai,1)){
        var param={};
        param.roleName=roleName;
        param.comment=comment;
        param.roleStatus=roleStatus;
        param.ro_createDate=chuangjian;
        param.ro_modificationDate=xiugai;
        alert(JSON.stringify(param));
        $.ajax({
            url:"http://localhost:8080/ShopManagement/addRole",
            type:"post",
            data:param,
            dataType:'json',
            success:function(result){
                if(result.result==true|| result.flag==2){
                    alert(result.data);
                    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/roleList.jsp'";
                }else{
                    alert(result.data);
                }
            }
        });
    }
}
//取消添加角色表信息
function removeRole() {
    alert("取消添加角色表信息");
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/roleList.jsp'";
}

function deleteRoleAll() {
    alert("批量删除");
}

//  显示用户表信息修改页面
function UserxiugaiShow(userId) {
    /*alert("显示用户表信息修改页面11"+userId);*/
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/User-add.jsp'&&userId="+userId;
}

//渲染修改用户信息
function updateUserShow(userId){
  /*  alert("渲染修改用户信息"+userId);*/
    $.ajax({
        url:"http://localhost:8080/ShopManagement/updateUserShow?userId="+userId,
        type:"post",
        dataType:"json",
        success:function(result){
          /*  alert(JSON.stringify(result));*/
            if(result.result==true|| result.flag==2){
                /*alert(JSON.stringify(result.data));*/
                var userCreateTime =result.data.userCreateTime;
                var userModificationDate =result.data.userModificationDate;
                var flag=checkUser(result.data.userName,result.data.password,
                    result.data.userRank,userCreateTime,userModificationDate);
                 if(flag){
                     $("#userName").val(result.data.userName);
                     $("#password").val(result.data.password);
                     $("#userRank").val(result.data.userRank);
                     $("#userModificationDate").val(userModificationDate);
                     $("#UserCreateTime").val(userCreateTime);
                 }else{
                     alert("参数格式不正确，即将返回用户全查页面");
                       }
               }else{
                alert(result.data);
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/UserList.jsp'";
            }
            }
    });
}

//删除用户信息
function deleteUser(userId) {
    alert("删除用户信息"+userId);
    $.ajax({
        url:"http://localhost:8080/ShopManagement/deleteUser?userId="+userId,
        type:"post",
        dataType:"json",
        success:function(result){
            alert(JSON.stringify(result));
           if(result.result==true){
                    alert(result.data);
                    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/UserList.jsp'";
            }else{
                alert(result.data);
            }
        }
    });
}
//删除当前页所有的用户信息
function deleteUserAll() {
    alert("删除当前页所有的用户信息");
}

//用户信息修改提交
function updateUserSumbit() {
    alert("用户信息修改提交");
    var userId=$("#id").val();
    var userName=$("#userName").val();
    var password=$("#password").val();
    var userRank=$("#userRank").val();  //UserRank
    var time = new Date();
    var day = ("0" + time.getDate()).slice(-2);
    var month = ("0" + (time.getMonth() + 1)).slice(-2);
    var today = time.getFullYear() + "-" + (month) + "-" + (day);
    var  userModificationDate=today;
    var userCreateTime=today;
    var flag1=checkUser(userName,password,userRank,userCreateTime,userModificationDate);
    if(flag1){
        var param={};
        param.userId=userId;
        param.userName=userName;
        param.password=password;
        param.userRank=userRank;
        param.userCreateTime=new Date(userCreateTime);
        param.userModificationDate=new Date(userModificationDate);
       /* alert(JSON.stringify(param));*/
        $.ajax({
            url:"http://localhost:8080/ShopManagement/updateUser",
            type:"post",
            data:param,
            dataType:"json",
            success:function(result){
                /*alert(JSON.stringify(result));*/
                if(result.result==true|| result.flag==1){
                    alert(result.data);
                }else{
                    alert(result.data);
                }
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/UserList.jsp'";
            }
        });
    }else{
        alert("参数格式不正确，即将返回用户信息全查界面");
        window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/UserList.jsp'";
    }

}
//用户信息添加提交
function addUserSumbit() {
    alert("用户信息添加提交");
    var userName=$("#userName").val();
    var password=$("#password").val();
    var userRank=$("#userRank").val();  //UserRank
    alert("quanxian"+$("#userRank").val());
    var time = new Date();
    var day = ("0" + time.getDate()).slice(-2);
    var month = ("0" + (time.getMonth() + 1)).slice(-2);
    var today = time.getFullYear() + "-" + (month) + "-" + (day);
    var  userModificationDate=today;
    var userCreateTime=today;
    var flag1=checkUser(userName,password,userRank,userCreateTime,userModificationDate);
    if(flag1){
        var param={};
        param.userName=userName;
        param.password=password;
        param.userRank=userRank;
        param.userCreateTime=new Date(userCreateTime);
        param.userModificationDate=new Date(userModificationDate);
        alert(JSON.stringify(param));
        $.ajax({
            url:"http://localhost:8080/ShopManagement/addUser",
            type:"post",
            data:param,
            dataType:"json",
            success:function(result){
                alert(JSON.stringify(result));
                if(result.result==true|| result.flag==1){
                    alert(result.data);
                      }else{
                    alert(result.data);
                }
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/UserList.jsp'";
            }
        });
    }else{
        alert("参数格式不正确，即将返回用户信息全查界面");
        window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/UserList.jsp'";
    }
}
//用户信息添加取消
function removeUser() {
    alert("用户信息添加取消");
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/UserList.jsp'";
}
//添加参数判断
function checkUser(userName,password,userRank,userCreateTime,userModificationDate){
    var flag=false;
    if(userName=="" || userName==null){
        alert("用户名称不能为空");
        return false;
    }
    if(password=="" || password==null){
        alert("用户密码不能为空");
        return false;
    }
    if(userRank=="" || userRank==null || userRank<0){
        alert("用户权限格式不正确");
        return false;
    }
    if(isNaN(userRank)){
        alert("用户权限不是数字");
        return false;
    }
    if(userRank=="" || userRank==null){
        alert("角色名称不能为空");
        return false;
    }
    if(userCreateTime=="" || userCreateTime==null){
        alert("用户创建时间不能为空"+userCreateTime);
        return false;
    }
    if(userModificationDate=="" || userModificationDate==null){
        alert("用户修改时间不能为空");
        return false;
    }
    return true;
}

//用户角色对照页面修改显示
function UserRolexiugaiShow(UserRoleid) {
    alert("用户角色对照页面修改显示"+UserRoleid);
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/UserRole-add.jsp'&&UserRoleid="+UserRoleid;
}
  function f() {
      $.ajax({
          url:"http://localhost:8080/ShopManagement/updateUserRoleShow?id="+id,
          type:"post",
          dataType:"json",
          success:function(result){
              alert(JSON.stringify(result));
              if(result.result==true|| result.flag==2){
                  alert(result.data);

              }else{
                  alert(result.data);
              }
              alert("参数格式不正确，即将返回用户信息全查界面");
              window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/UserList.jsp'";
          }

      });
  }
//用户角色对照页面删除
function deleteUserRole(id) {
    alert("用户角色对照页面修改显示"+id);
}

function updateUserRoleShow(id){
      alert("渲染修改用户角色信息"+id);
    $.ajax({
        url:"http://localhost:8080/ShopManagement/usersList",
        type:"post",
        dataType:"json",
        success:function(result) {
            alert(JSON.stringify(result));
            if(result!=null){
                $.each(result,function (){
                    $("#userNames").append("<option value=this.userId>"+this.userName+"</option>");
                });
            }else{
                alert("未获取到要修改的用户名参数，即将返回用户全查页面");
            }
        }
    });
    $.ajax({
        url:"http://localhost:8080/ShopManagement/rolesList",
        type:"post",
        dataType:"json",
        success:function(result) {
            alert(JSON.stringify(result));
            if(result!=null){
                $.each(result,function (){
                    $("#roleNames").append("<option value=this.id>"+this.roleName+"</option>");
                });
            }else{
                alert("未获取到要修改的角色名参数，即将返回用户全查页面");
            }
        }
    });

   $.ajax({
        url:"http://localhost:8080/ShopManagement/updateUserRoleShow?id="+id,
        type:"post",
        dataType:"json",
        success:function(result){
            if(result.result==true){
                var id=result.id;
                $("#id").val(id);
                var ru_createDate =result.data.ru_createDate;
                var ru_modificationDate =result.data.ru_modificationDate;
                var flags=checkUserRole(ru_createDate,ru_modificationDate);
                if(flags){
                    $("#ru_createDate").val(ru_createDate);
                    $("#ru_modificationDate").val(ru_modificationDate);
                }else{
                    alert("参数格式不正确，即将返回用户全查页面");
                }
            }else{
                alert(result.data);
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/UserRoleList.jsp'";
            }
        }
    });
}
//参数验证
function checkUserRole(ru_createDate,ru_modificationDate) {
    var flag=false;
    if(ru_createDate==null || ru_createDate==""){
        alert("未获取到用户角色对照信息创建时间");
        return false;
    }
    if(ru_modificationDate==null || ru_modificationDate==""){
        alert("未获取到用户角色对照信息修改时间");
        return false;
    }
    return true;
}
//
function updateUserRoleSumbit() {
    alert("提交用户角色对照表");
    
}
//用户角色信息添加
function addUserRole() {
    alert("用户角色信息添加");
}
//批量删除全部
function deleteUserRoleAll() {
    alert("批量删除全部");
}
//添加用户角色信息验证
function checkUsreRole(userId,roleId,ru_createDate,ru_modificationDate) {
    var flag=false;
    if(userId==null || userId=="" || userId==0){
        alert("用户名称未选择");
        return false;
    }
    if(roleId==null || roleId==""|| roleId==0){
        alert("角色名称未选择");
        return false;
    }
    if(ru_createDate==null || ru_createDate==""){
        alert("用户角色创建时间为空");
        return false;
    }
    if(ru_modificationDate==null || ru_modificationDate==""){
        alert("用户角色修改时间为空");
        return false;
    }
    return true;
}
//添加用户角色信息
function addUserRoleSumbit() {
    alert("添加用户角色信息");
    var userId=$("#userNames").val();
    var roleId=$("#roleNames").val();
    var ru_createDate=$("#ru_createDate").val();
    var ru_modificationDate=$("#ru_modificationDate").val();
    alert("添加用户角色信息"+userId+":"+roleId+":"+ru_createDate+":"+ru_modificationDate);
    if(checkUsreRole(userId,roleId,ru_createDate,ru_modificationDate)){
        var param={};
        param.userId=userId;
        param.roleId=roleId;
        param.ru_createDate=new Date(ru_createDate);
        param.ru_modificationDate=new Date(ru_modificationDate);
        alert(JSON.stringify(param));
        $.ajax({
            url:"http://localhost:8080/ShopManagement/addUserRole",
            type:"post",
            data:param,
            dataType:"json",
            success:function(result){
               /* alert(JSON.stringify(result));*/
                if(result.result==true){
                    alert(result.data);
                }else{
                    alert(result.data);
                }
                window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/UserRoleList.jsp'";
            }
        });
    }else{
    alert("参数格式不正确，即将返回用户信息查询页面");
    }

}
//取消添加
function removeUserRole() {
    alert("取消添加用户角色");
    window.parent.location.href="http://localhost:8080/ShopManagement/index.jsp?name='fenchang/xitongGuanli/UserRoleList.jsp'";
}

function addXuanran() {
    $.ajax({
        url:"http://localhost:8080/ShopManagement/usersList",
        type:"post",
        dataType:"json",
        success:function(result) {
            /*alert(JSON.stringify(result));*/
            if(result!=null){
                $.each(result,function (){
                    $("#userNames").append("<option value="+this.userId+">"+this.userName+"</option>");
                });
            }else{
                alert("未获取到要修改的用户名参数，即将返回用户全查页面");
            }
        }
    });
    $.ajax({
        url:"http://localhost:8080/ShopManagement/rolesList",
        type:"post",
        dataType:"json",
        success:function(result) {
            alert(JSON.stringify(result));
            if(result!=null){
                $.each(result,function (){
                    $("#roleNames").append("<option value="+this.id+">"+this.roleName+"</option>");
                });
            }else{
                alert("未获取到要修改的角色名参数，即将返回用户全查页面");
            }
        }
    });
}