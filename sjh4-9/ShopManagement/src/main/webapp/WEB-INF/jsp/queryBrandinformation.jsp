<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${queryBrandinformation.result==true}">
<c:if test="${not empty queryBrandinformation}">
    <c:forEach items="${queryBrandinformation.data.brandinformationList}" var ="queryHouseSourceLis">
        <tr class="text-c">
            <td><input type="checkbox" value="1" name=""></td>
            <td>${queryHouseSourceLis.brandId}</td>
            <td>${queryHouseSourceLis.brandCoding}</td>
            <td>${queryHouseSourceLis.brandNameCh}</td>
            <td>${queryHouseSourceLis.brandNameEh}</td>
            <td>${queryHouseSourceLis.commercialActivities}</td>
            <td>${queryHouseSourceLis.birthplaceOfBrand}</td>
            <td>${queryHouseSourceLis.storeProperties}</td>
            <td>${queryHouseSourceLis.businessNature}</td>
            <td>${queryHouseSourceLis.officialWebsite}</td>
            <td>${queryHouseSourceLis.headquarterAddress}</td>
            <td>${queryHouseSourceLis.brandDescription}</td>
            <td>${queryHouseSourceLis.accessory}</td>
            <td>${queryHouseSourceLis.tenementId}</td>
            <td class="td-manage">
                <a title="编辑"  onclick="xiugaiBrandinformation('${queryHouseSourceLis.brandId}')" class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6df;</i>
                </a>
                <a title="删除"  onclick="deleteBrandinformation('${queryHouseSourceLis.brandId}')" class="ml-5" style="text-decoration:none">
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
            当前页：第<span class="curPage">${queryBrandinformation.data.curPage}</span>页
            /共<span class="totalPageCount">${queryBrandinformation.data.totalPageCount}</span>页
            /共有<span class="">${queryBrandinformation.data.totalCount}</span>条数据
     </span>
            </div>
        </td>
    </tr>
</c:if>
</c:if>
<c:if test="${queryBrandinformation.result==false}" >
    <tr >
        <td colspan="15">
            <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
        </td>
    </tr>
</c:if>