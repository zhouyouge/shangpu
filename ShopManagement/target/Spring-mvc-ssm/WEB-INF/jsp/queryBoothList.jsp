<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${queryBoothList.result==true}">
    <c:if test="${not empty queryBoothList.data.boothList}">
        <c:forEach items="${queryBoothList.data.boothList}" var ="booth">
            <tr class="text-c">
                <td><input type="checkbox" value="1" name=""></td>
                <td>${booth.boothNumber}</td>
                <td>${booth.breakoutName}</td>
                <td>${booth.towerName}</td>
                <td>${booth.floorName}</td>
                <td>${booth.boothCoding}</td>
                <td>${booth.planningForms}</td>
                <td>${booth.coveredArea}</td>
                <td>${booth.operatingArea}</td>
                <td>${booth.comment}</td>
                <td>${booth.boothStatus}</td>
                <td><fmt:formatDate value="${booth.booth_createtime}" pattern="yyyy-MM-dd"/></td>
                <td><fmt:formatDate value="${booth.booth_updatetime}" pattern="yyyy-MM-dd"/></td>
                <td class="td-status"><span class="label label-success radius">${booth.boothBreakoutStatus}</span></td>
                <td class="td-manage">
                   <%-- <a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用">--%>
                    <%--<i class="Hui-iconfont">&#xe631;</i></a>--%> <a title="编辑" href="javascript:;" onclick="xiugaiBooth('${booth.boothNumber}')" class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6df;</i>
                </a>
                       <%-- <i class="Hui-iconfont">&#xe63f;</i>--%>
                    </a>
                    <a title="删除" href="" onclick="deleteBooth('${booth.boothNumber}')" class="ml-5" style="text-decoration:none">
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
            当前页：第<span class="curPage">${queryBoothList.data.curPage}</span>页
            /共<span class="totalPageCount">${queryBoothList.data.totalPageCount}</span>页
            /共有<span class="">${queryBoothList.data.totalCount}</span>条数据
     </span>
                </div>
            </td>
        </tr>
    </c:if>
</c:if>
<c:if test="${queryBoothList.result==false}" >
    <tr >
    <td colspan="15">
        <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
    </td>
    </tr>
</c:if>


