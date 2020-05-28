<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${not empty UserList}">
    <c:if test="${UserList.result==true}">
        <c:forEach items="${UserList.data.quanxianList}" var ="user">
            <tr class="text-c">
                <td><input type="checkbox" value="1" name=""></td>
                <td>${user.userId}</td>
                <td>${user.userName}</td>
                <td>${user.password}</td>
                <td>${user.userRank}</td>
                <td>${user.roleName}</td>
                <td>${user.comment}</td>
                <td><fmt:formatDate value="${user.userCreateTime}" pattern="yyyy-MM-dd"/></td>
                <td><fmt:formatDate value="${user.userModificationDate}" pattern="yyyy-MM-dd"/></td>
                <td class="td-manage">
                    <a title="编辑" href="javascript:;" onclick="UserxiugaiShow(${user.userId})" class="ml-5" style="text-decoration:none">
                        <i class="Hui-iconfont">&#xe6df;</i>
                    </a>
                    <a title="删除" href="javascript:;" onclick="deleteUser(${user.userId})" class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6e2;</i>
                </a>
                </td>
            </tr>
        </c:forEach>
    </c:if>
    </c:if>
    <c:if test="${UserList.result==false}">
        <tr >
            <td colspan="10">
                <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
            </td>
        </tr>
    </c:if>




