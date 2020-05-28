<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${queryBillinformationExpressionList.result==true}">
<c:if test="${not empty queryBillinformationExpressionList}">
    <c:forEach items="${queryBillinformationExpressionList.data.billList}" var ="queryHouseSourceList">
        <tr class="text-c">
            <td><input type="checkbox" value="1" name=""></td>
            <td>${queryHouseSourceList.billingName}</td>
            <td>${queryHouseSourceList.ratepayerNumber}</td>
            <td>${queryHouseSourceList.billAddress}</td>
            <td>${queryHouseSourceList.billPhone}</td>
            <td>${queryHouseSourceList.bankName}</td>
            <td>${queryHouseSourceList.billAccount}</td>
            <td>${queryHouseSourceList.rent_taxRate}</td>
            <td>${queryHouseSourceList.breakoutName}</td>
            <td><fmt:formatDate value="${queryHouseSourceList.bill_createtime}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${queryHouseSourceList.bill_updatetime}" pattern="yyyy-MM-dd"/></td>
            <td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a> <a title="编辑" href="javascript:;" onclick="xiugiaBillinformation(${queryHouseSourceList.billId})" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="change_password('修改密码','change-password.html','10001','600','270')" href="javascript:;" title="修改密码"><i class="Hui-iconfont">&#xe63f;</i></a> <a title="删除" href="javascript:;" onclick="deleteBillinformation(${queryHouseSourceList.billId})" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
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
            当前页：第<span class="curPage">${queryBillinformationExpressionList.data.curPage}</span>页
            /共<span class="totalPageCount">${queryBillinformationExpressionList.data.totalPageCount}</span>页
            /共有<span class="">${queryBillinformationExpressionList.data.totalCount}</span>条数据
     </span>
            </div>
        </td>
    </tr>
</c:if>
</c:if>
<c:if test="${queryBillinformationExpressionList.result==false}" >
    <tr >
        <td colspan="15">
            <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
        </td>
    </tr>
</c:if>
