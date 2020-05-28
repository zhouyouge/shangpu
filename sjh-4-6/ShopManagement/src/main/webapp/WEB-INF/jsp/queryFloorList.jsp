<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${not empty queryFloorList}">
    <c:if test="${queryFloorList.result==true}">
    <c:forEach items="${queryFloorList.data.floorInformationList}" var ="floor">
        <tr class="text-c">
            <td><input type="checkbox" value="1" name=""></td>
            <td>${floor.breakoutName}</td>
            <td>${floor.towerName}</td>
            <td>${floor.floorName}</td>
            <td>${floor.floorCoding}</td>
            <td>${floor.coveredArea}</td>
            <td>${floor.operatingArea}</td>
            <td>${floor.floorStatus}</td>
            <td>${floor.propertyType}</td>
            <td>${floor.commnet}</td>
            <td>${floor.floorImage}</td>
            <td class="td-status"><span class="label label-success radius">${floor.floor_BreakoutStatus}</span></td>
            <td><fmt:formatDate value="${floor.floor_createtime}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${floor.floor_updatetime}" pattern="yyyy-MM-dd"/></td>
            <td class="td-manage">
                    <%-- <a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用">--%>
                    <%--<i class="Hui-iconfont">&#xe631;</i></a>--%> <a title="编辑"  onclick="xiugaiFloor('${floor.floorName}')" class="ml-5" style="text-decoration:none">
                <i class="Hui-iconfont">&#xe6df;</i>
            </a>
                    <%-- <i class="Hui-iconfont">&#xe63f;</i>--%>
                </a>
                <a title="删除"  onclick="deleteFloor('${floor.floorName}')" class="ml-5" style="text-decoration:none">
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
            当前页：第<span class="curPage">${queryFloorList.data.curPage}</span>页
            /共<span class="totalPageCount">${queryFloorList.data.totalPageCount}</span>页
            /共有<span class="">${queryFloorList.data.totalCount}</span>条数据
     </span>
            </div>
        </td>
    </tr>
</c:if>
</c:if>
<c:if test="${queryFloorList.result==false}" >
    <tr >
        <td colspan="15">
            <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
        </td>
    </tr>
</c:if>

