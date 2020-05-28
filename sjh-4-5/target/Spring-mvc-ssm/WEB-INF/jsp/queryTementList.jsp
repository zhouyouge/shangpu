<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${not empty queryTementList}">
    <c:forEach items="${queryTementList.data.tenementlnformationList}" var ="tenement">
        <tr class="text-c">
            <td><input type="checkbox" value="1" name=""></td>
            <td>${tenement.tenementId}</td>
            <td>${tenement.tenantCoding}</td>
            <td>${tenement.tenantName}</td>
            <td>${tenement.tenantType}</td>
            <td>${tenement.companyName}</td>
            <td>${tenement.IDNumber}</td>
            <td>${tenement.socialCreditCode}</td>
            <td>${tenement.managementForms}</td>
            <td>${tenement.rentalArea}</td>
            <td>${tenement.tenanPhone}</td>
            <td>${tenement.blacklistStatus}</td>
            <td>${tenement.telephone}</td>
            <td>${tenement.nationality}</td>
            <td>${tenement.email}</td>
            <td>${tenement.comment}</td>
            <td>${tenement.mailingAddress}</td>
            <td>${tenement.boothNumber}</td>
            <td class="td-status"><span class="label label-success radius">${tenement.tenanStatus}</span></td>
            <td><fmt:formatDate value="${tenement.tentment_createtime}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${tenement.tentment_updatetime}" pattern="yyyy-MM-dd"/></td>
            <td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a> <a title="编辑" href="javascript:;" onclick="member_edit('编辑','member-add.html','4','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="change_password('修改密码','change-password.html','10001','600','270')" href="javascript:;" title="修改密码"><i class="Hui-iconfont">&#xe63f;</i></a> <a title="删除" href="javascript:;" onclick="member_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="18">
            <div class="page">
                <a class="fenye" href="javascript:firstPage()">首页</a>
                <a class="fenye" href="javascript:prePage()">上一页</a>
                <a  class="fenye" href="javascript:nextPage()">下一页</a>
                <a  class="fenye" href="javascript:endPage()">末页</a>
                <span>
            当前页：第<span class="curPage">${queryTementList.data.curPage}</span>页
            /共<span class="totalPageCount">${queryTementList.data.totalPageCount}</span>页
            /共有<span class="">${queryTementList.data.totalCount}</span>条数据
     </span>
            </div>
        </td>
    </tr>
</c:if>

