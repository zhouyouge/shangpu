<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${not empty queryBankAccountList}">
    <c:forEach items="${queryBankAccountList.data.bankAccountList}" var ="queryHouseSourceList">
        <tr class="text-c">
            <td><input type="checkbox" value="1" name=""></td>
            <td>${queryHouseSourceList.bankName}</td>
            <td>${queryHouseSourceList.bankaccount}</td>
            <td>${queryHouseSourceList.bankrownum}</td>
            <td>${queryHouseSourceList.bankName2}</td>
            <td>${queryHouseSourceList.bankaccount2}</td>
            <td>${queryHouseSourceList.bankrownum2}</td>
            <td>${queryHouseSourceList.breakId}</td>
            <td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a> <a title="编辑" href="javascript:;" onclick="member_edit('编辑','member-add.html','4','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="change_password('修改密码','change-password.html','10001','600','270')" href="javascript:;" title="修改密码"><i class="Hui-iconfont">&#xe63f;</i></a> <a title="删除" href="javascript:;" onclick="member_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="15">
            <div class="page">
                <a class="fenye" href="javascript:firstPage()">首页</a>
                <a class="fenye" href="javascript:prePage()">上一页</a>
                <a  class="fenye" href="javascript:nextPage()">下一页</a>
                <a  class="fenye" href="javascript:endPage()">末页</a>
                <span>
            当前页：第<span class="curPage">${queryBankAccountList.data.curPage}</span>页
            /共<span class="totalPageCount">${queryBankAccountList.data.totalPageCount}</span>页
            /共有<span class="">${queryBankAccountList.data.totalCount}</span>条数据
     </span>
            </div>
        </td>
    </tr>
</c:if>

