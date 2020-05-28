<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${not empty commerList}">
    <c:if test="${commerList.result==true}">
    <c:forEach items="${commerList.data.commercialactivitiesList}" var ="commer">
        <tr class="text-c">
            <td><input type="checkbox" value="1" name=""></td>
            <td>${commer.commercialId}</td>
            <td>${commer.commercialName}</td>
            <td><fmt:formatDate value="${commer.cc_createDate}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${commer.cc_modificationDate}" pattern="yyyy-MM-dd"/></td>
            <td class="td-status"><span class="label label-success radius">${commer.commercialStatus}</span></td>
            <td class="td-manage">
                    <%-- <a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用">--%>
                    <%--<i class="Hui-iconfont">&#xe631;</i></a>--%> <a title="编辑"  onclick="xiugaiCommer('${commer.commercialName}')" class="ml-5" style="text-decoration:none">
                <i class="Hui-iconfont">&#xe6df;</i>
            </a>
                    <%-- <i class="Hui-iconfont">&#xe63f;</i>--%>
                </a>
                <a title="删除"  onclick="deleteCommer(${commer.commercialId},'${commer.commercialName}')" class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6e2;</i>
                </a>
            </td>
        </tr>
        </tr>
    </c:forEach>
        <tr>
        <td colspan="7">
            <div class="page">
                <a class="fenye" href="javascript:firstPage()">首页</a>
                <a class="fenye" href="javascript:prePage()">上一页</a>
                <a  class="fenye" href="javascript:nextPage()">下一页</a>
                <a  class="fenye" href="javascript:endPage()">末页</a>
                <span>
            当前页：第<span class="curPage">${commerList.data.curPage}</span>页
            /共<span class="totalPageCount">${commerList.data.totalPageCount}</span>页
            /共有<span class="">${commerList.data.totalCount}</span>条数据
     </span>
            </div>
        </td>
</c:if>
</c:if>
<c:if test="${commerList.result==false}"  >
    <tr >
        <td colspan="7">
            <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
        </td>
    </tr>
</c:if>

