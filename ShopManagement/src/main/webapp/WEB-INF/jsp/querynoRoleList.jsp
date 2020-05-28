<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${not empty RoleList}">
    <c:if test="${RoleList.result==true}">
        <c:forEach items="${RoleList.data.quanxianList}" var ="role">
            <tr class="text-c">
                <td><input type="checkbox" value="1" name=""></td>
                <td>${role.id}</td>
                <td>${role.roleName}</td>
                <td>${role.comment}</td>
                <td><fmt:formatDate value="${role.ro_createDate}" pattern="yyyy-MM-dd"/></td>
                <td><fmt:formatDate value="${role.ro_modificationDate}" pattern="yyyy-MM-dd"/></td>
                <td class="td-manage">
                    <a title="编辑" href="javascript:;" onclick="Rolexiugai2(${role.id})" class="ml-5" style="text-decoration:none">
                        <i class="Hui-iconfont">&#xe6df;</i>
                    </a>
                    <a title="删除" href="javascript:;" onclick="deleteRole(${role.id})" class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6e2;</i>
                </a>
                </td>
            </tr>
        </c:forEach>
    </c:if>
    </c:if>
    <c:if test="${RoleList.result==false}">
        <tr >
            <td colspan="7">
                <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
            </td>
        </tr>
    </c:if>




