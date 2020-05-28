<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${queryDisverfiedList.result==true}">
    <c:if test="${not empty queryDisverfiedList.data.disversifiedList}">
        <c:forEach items="${queryDisverfiedList.data.disversifiedList}" var ="disverfied">
            <tr class="text-c">
                <td><input type="checkbox" value="1" name=""></td>
                <td>${disverfied.boothId}</td>
                <td>${disverfied.diversifiedCoding}</td>
                <td>${disverfied.breakoutName}</td>
                <td>${disverfied.towerName}</td>
                <td>${disverfied.floorName}</td>
                <td>${disverfied.diversifiedName}</td>
                <td>${disverfied.diversifiedStatus}</td>
                <td>${disverfied.coveredArea}</td>
                <td>${disverfied.diversifiedType}</td>
                <td>${disverfied.outdoors}</td>
                <td>${disverfied.standardRent}</td>
                <td>${disverfied.commnet}</td>
                <td class="td-status"><span class="label label-success radius">${disverfied.diversified}</span></td>
                <td class="td-manage">
                   <%-- <a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用">--%>
                    <%--<i class="Hui-iconfont">&#xe631;</i></a>--%> <a title="编辑" href="javascript:;" onclick="xiugai(${disverfied.boothId})" class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6df;</i>
                </a>
                       <%-- <i class="Hui-iconfont">&#xe63f;</i>--%>
                    </a>
                    <a title="删除" href="" onclick="deleteDisverfied(${disverfied.boothId})" class="ml-5" style="text-decoration:none">
                        <i class="Hui-iconfont">&#xe6e2;</i>
                    </a>
                </td>
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
            当前页：第<span class="curPage">${queryDisverfiedList.data.curPage}</span>页
            /共<span class="totalPageCount">${queryDisverfiedList.data.totalPageCount}</span>页
            /共有<span class="">${queryDisverfiedList.data.totalCount}</span>条数据
     </span>
                </div>
            </td>
        </tr>
    </c:if>
</c:if>
<c:if test="${queryDisverfiedList.result==false}" >
    <tr >
    <td colspan="15">
        <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
    </td>
    </tr>
</c:if>


