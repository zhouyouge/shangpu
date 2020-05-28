<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${not empty userRoleList}">
    <c:if test="${userRoleList.result==true}">
        <c:forEach items="${userRoleList.data.quanxianList}" var ="user">
            <tr class="text-c">
                <td><input type="checkbox" value="1" name=""></td>
                <td>${user.id}</td>
                <td>${user.userId}/${user.userName}</td>
                <td>${user.userRank}</td>
                <td>${user.roleId}/${user.roleName}</td>
                <td>${user.comment}</td>
                <td><fmt:formatDate value="${user.ru_createDate}" pattern="yyyy-MM-dd"/></td>
                <td><fmt:formatDate value="${user.ru_modificationDate}" pattern="yyyy-MM-dd"/></td>
                <td class="td-manage">
                    <a title="编辑" href="javascript:;" onclick="UserRolexiugaiShow(${user.id})" class="ml-5" style="text-decoration:none">
                        <i class="Hui-iconfont">&#xe6df;</i>
                    </a>
                    <a title="删除" href="javascript:;" onclick="deleteUserRole(${user.id})" class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6e2;</i>
                </a>
                </td>
            </tr>
        </c:forEach>
    </c:if>
    </c:if>
    <c:if test="${userRoleList.result==false}">
        <tr >
            <td colspan="9">
                <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
            </td>
        </tr>
    </c:if>




