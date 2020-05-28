<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${not empty queryAshopriceList}">
    <c:if test="${queryAshopriceList.result==true}">
        <c:forEach items="${queryAshopriceList.data.ashoppriceList}" var ="ashoprice">
            <tr class="text-c">
                <td><input type="checkbox" value="1" name=""></td>
                <td>${ashoprice.ashopId}</td>
                <td><fmt:formatDate value="${ashoprice.annual}" pattern="yyyy-MM-dd"/></td>
                <td>${ashoprice.rentHoliday}</td>
                <td>${ashoprice.sasacGuidedPrices}</td>
                <td>${ashoprice.marketPrice}</td>
                <td>${ashoprice.marketCompanyPricing}</td>
                <td>${ashoprice.marketHistoryPrice}</td>
                <td>${ashoprice.outletCompanyPricing}</td>
                <td>${ashoprice.networkHistoryPrice}</td>
                <td>${ashoprice.boothNumber}</td>
                <td>${ashoprice.rent}</td>
                <td><fmt:formatDate value="${ashoprice.ashop_createtime}" pattern="yyyy-MM-dd"/></td>
                <td><fmt:formatDate value="${ashoprice.ashop_updatetime}" pattern="yyyy-MM-dd"/></td>
                <td class="td-manage">
                    <a title="编辑" href="javascript:;" onclick="Ashopricexiugai(${ashoprice.ashopId})" class="ml-5" style="text-decoration:none">
                        <i class="Hui-iconfont">&#xe6df;</i>
                    </a>
                    <a title="删除" href="javascript:;" onclick="deleteAshoprice(${ashoprice.ashopId})" class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6e2;</i>
                </a>
                </td>
            </tr>
        </c:forEach>
    </c:if>
    </c:if>
    <c:if test="${queryAshopriceList.result==true}">
        <tr>
            <td colspan="16">
                <div class="page">
                    <a class="fenye" href="javascript:firstPage()">首页</a>
                    <a class="fenye" href="javascript:prePage()">上一页</a>
                    <a  class="fenye" href="javascript:nextPage()">下一页</a>
                    <a  class="fenye" href="javascript:endPage()">末页</a>
                    <span>
            当前页：第<span class="curPage">${queryAshopriceList.data.curPage}</span>页
            /共<span class="totalPageCount">${queryAshopriceList.data.totalPageCount}</span>页
            /共有<span class="">${queryAshopriceList.data.totalCount}</span>条数据
     </span>
                </div>
            </td>
        </tr>
    </c:if>
    <c:if test="${queryAshopriceList.result==false}">
        <tr >
            <td colspan="16">
                <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
            </td>
        </tr>
    </c:if>




