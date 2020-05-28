<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${queryHouseSourceList.result==true}">
<c:if test="${not empty queryHouseSourceList}">
    <c:forEach items="${queryHouseSourceList.data.houseSourceList}" var ="queryHouseSourceLis">
        <tr class="text-c">
            <td><input type="checkbox" value="1" name=""></td>
            <td>${queryHouseSourceLis.hoseSource}</td>
            <td>${queryHouseSourceLis.produceLabel}</td>
            <td>${queryHouseSourceLis.propertyOwner}</td>
            <td>${queryHouseSourceLis.hourseGoDown}</td>
            <td>${queryHouseSourceLis.purchaserName}</td>
            <td><fmt:formatDate value="${queryHouseSourceLis.startTime}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${queryHouseSourceLis.outTime}" pattern="yyyy-MM-dd"/></td>
            <td>${queryHouseSourceLis.gatheringId}</td>
            <td class="td-manage">
                <a title="编辑"  onclick="xiugaiHouseSourceLis('${queryHouseSourceLis.houseId}')" class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6df;</i>
                </a>
                <a title="删除"  onclick="deleteHouseSource('${queryHouseSourceLis.houseId}')" class="ml-5" style="text-decoration:none">
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
            当前页：第<span class="curPage">${queryHouseSourceList.data.curPage}</span>页
            /共<span class="totalPageCount">${queryHouseSourceList.data.totalPageCount}</span>页
            /共有<span class="">${queryHouseSourceList.data.totalCount}</span>条数据
     </span>
            </div>
        </td>
    </tr>
</c:if>
</c:if>
<c:if test="${queryHouseSourceList.result==false}" >
    <tr >
        <td colspan="15">
            <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
        </td>
    </tr>
</c:if>