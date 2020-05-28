<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${not empty queryTownerList}">
    <c:if test="${ queryTownerList.result==true}">
    <c:forEach items="${queryTownerList.data.towerList}" var ="towner">
        <tr class="text-c">
            <td><input type="checkbox" value="1" name=""></td>
            <td>${towner.breakoutName}</td>
            <td>${towner.towerCoding}</td>
            <td>${towner.towerName}</td>
            <td>${towner.towerStatus}</td>
            <td>${towner.coveredArea}</td>
            <td>${towner.operatingArea}</td>
            <td>${towner.upFloorNumber}</td>
            <td>${towner.downFloorNumber}</td>
            <td>${towner.comment}</td>
            <td>${towner.towerImage}</td>
            <td class="td-status"><span class="label label-success radius">${towner.tower_BreakoutStatus}</span></td>
            <td><fmt:formatDate value="${towner.tower_createtime}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${towner.tower_updatetime}" pattern="yyyy-MM-dd"/></td>
            <td class="td-manage">
                <a title="编辑"  onclick="xiugaiTowener('${towner.towerName}')" class="ml-5" style="text-decoration:none">
                <i class="Hui-iconfont">&#xe6df;</i>
            </a>
                <a title="删除"  onclick="deleteTowener('${towner.towerName}')" class="ml-5" style="text-decoration:none">
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
            当前页：第<span class="curPage">${queryTownerList.data.curPage}</span>页
            /共<span class="totalPageCount">${queryTownerList.data.totalPageCount}</span>页
            /共有<span class="">${queryTownerList.data.totalCount}</span>条数据
     </span>
            </div>
        </td>
    </tr>
</c:if>
</c:if>
<c:if test="${queryTownerList.result==false}" >
    <tr >
        <td colspan="15">
            <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
        </td>
    </tr>
</c:if>

