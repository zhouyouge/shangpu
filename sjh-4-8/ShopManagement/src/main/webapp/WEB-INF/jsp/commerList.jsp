<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${not empty commerLists}">
    <c:forEach items="${commerLists}" var ="commer">
        <tr class="text-c">
            <td><input type="checkbox" value="1" name=""></td>
            <td>${commer.commercialId}</td>
            <td>${commer.commercialName}</td>
            <td><fmt:formatDate value="${commer.cc_createDate}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${commer.cc_modificationDate}" pattern="yyyy-MM-dd"/></td>
            <td class="td-status"><span class="label label-success radius">已启用</span></td>
            <td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a> <a title="编辑" href="javascript:;" onclick="member_edit('编辑','member-add.html','4','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="change_password('修改密码','change-password.html','10001','600','270')" href="javascript:;" title="修改密码"><i class="Hui-iconfont">&#xe63f;</i></a> <a title="删除" href="javascript:;" onclick="member_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
        </tr>
    </c:forEach>
</c:if>

