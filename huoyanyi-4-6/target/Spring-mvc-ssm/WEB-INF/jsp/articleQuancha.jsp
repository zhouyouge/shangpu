<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${articleList.result==true}">
<c:if test="${not empty articleList}">
    <c:forEach items="${articleList.data.breakoutList}" var ="article">
        <tr class="text-c">
            <td><input type="checkbox" value="1" name=""></td>
            <td>${article.breakoutName}</td>
            <td>${article.brabbreviation}</td>
            <td>${article.brcoding}</td>
            <td>${article.brprincipal}</td>
            <td>${article.brworkType}</td>
            <td>${article.brcoveredArea}</td>
            <td>${article.broperatingArea}</td>
            <td>${article.brresidentialPool}</td>
            <td>${article.broperationalRegime}</td>
            <td>${article.brcomment}</td>
            <td>${article.brBreakoutDiagram}</td>
            <td>${article.brBreakoutLicense}</td>
            <td class="td-status"><span class="label label-success radius">${article.brBreakoutStatus}</span></td>
            <td><fmt:formatDate value="${article.br_createtime}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${article.br_updatetime}" pattern="yyyy-MM-dd"/></td>
            <td class="td-manage">
                    <%-- <a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用">--%>
                    <%--<i class="Hui-iconfont">&#xe631;</i></a>--%> <a title="编辑"  onclick="xiugaiArticle('${article.breakoutName}')" class="ml-5" style="text-decoration:none">
                <i class="Hui-iconfont">&#xe6df;</i>
            </a>
                    <%-- <i class="Hui-iconfont">&#xe63f;</i>--%>
                </a>
                <a title="删除"  onclick="deleteArticle('${article.breakoutName}')" class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6e2;</i>
                </a>
            </td>
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
            当前页：第<span class="curPage">${articleList.data.curPage}</span>页
            /共<span class="totalPageCount">${articleList.data.totalPageCount}</span>页
            /共有<span class="">${articleList.data.totalCount}</span>条数据
     </span>
            </div>
        </td>
    </tr>
</c:if>
</c:if>
<c:if test="${articleList.result==false}" >
    <tr>
        <td colspan="15">
            <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
        </td>
    </tr>
</c:if>
