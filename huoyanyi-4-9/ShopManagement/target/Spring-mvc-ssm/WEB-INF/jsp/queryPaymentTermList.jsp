<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${queryPaymentTermList.result==true}">
<c:if test="${not empty queryPaymentTermList}">
    <c:forEach items="${queryPaymentTermList.data.paymenttermList}" var ="queryHouseSourceList">
        <tr class="text-c">
            <td><input type="checkbox" value="1" name=""></td>
            <td>${queryHouseSourceList.gatheringName}</td>
            <td>${queryHouseSourceList.bankNo}</td>
            <td>${queryHouseSourceList.accountName}</td>
            <td>${queryHouseSourceList.accountNumber}</td>
            <td><fmt:formatDate value="${queryHouseSourceList.startTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <td><fmt:formatDate value="${queryHouseSourceList.outTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a> <a title="编辑" href="javascript:;" onclick="xiugaipaymentterm(${queryHouseSourceList.getheringId})" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="change_password('修改密码','change-password.html','10001','600','270')" href="javascript:;" title="修改密码"><i class="Hui-iconfont">&#xe63f;</i></a> <a title="删除" href="javascript:;" onclick="deletepaymentterm(${queryHouseSourceList.getheringId})" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
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
            当前页：第<span class="curPage">${queryPaymentTermList.data.curPage}</span>页
            /共<span class="totalPageCount">${queryPaymentTermList.data.totalPageCount}</span>页
            /共有<span class="">${queryPaymentTermList.data.totalCount}</span>条数据
     </span>
            </div>
        </td>
    </tr>
</c:if>
</c:if>
<c:if test="${queryPaymentTermList.result==false}" >
    <tr >
        <td colspan="15">
            <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
        </td>
    </tr>
</c:if>
