<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${not empty queryYusuanList}">
    <c:if test="${queryYusuanList.result==true}">
        <tr class="text-c">
            <th width="100">摊位号</th>
            <th width="100">分场名称</th>
            <th width="100">楼栋名称</th>
            <th width="100">楼层名称</th>
            <th width="100">经营面积</th>
            <c:if test="${ queryYusuanList.flag==1}">
                <th width="100">1月租金</th>
            </c:if>
            <c:if test="${ queryYusuanList.flag==2}">
                <th width="100">1月租金</th>
                <th width="100">2月租金</th>
            </c:if>
            <c:if test="${ queryYusuanList.flag==3}">
                <th width="100">1月租金</th>
                <th width="100">2月租金</th>
                <th width="100">3月租金</th>
            </c:if>
            <c:if test="${ queryYusuanList.flag==4}">
                <th width="100">1月租金</th>
                <th width="100">2月租金</th>
                <th width="100">3月租金</th>
                <th width="100">4月租金</th>
            </c:if>
            <c:if test="${queryYusuanList.flag==5}">
                <th width="100">1月租金</th>
                <th width="100">2月租金</th>
                <th width="100">3月租金</th>
                <th width="100">4月租金</th>
                <th width="100">5月租金</th>
            </c:if>
            <c:if test="${queryYusuanList.flag==6}">
                <th width="100">1月租金</th>
                <th width="100">2月租金</th>
                <th width="100">3月租金</th>
                <th width="100">4月租金</th>
                <th width="100">5月租金</th>
                <th width="100">6月租金</th>
            </c:if>
        </tr>
        <c:forEach items="${queryYusuanList.data}" var ="yusuan">
            <tr class="text-c">
                <td>${yusuan.boothNumber}</td>
                <td>${yusuan.breakoutName}</td>
                <td>${yusuan.towerName}</td>
                <td>${yusuan.floorName}</td>
                <td>${yusuan.operatingArea}</td>
              <%--  <td><fmt:formatDate value="${yusuan.annual}" pattern="yyyy-MM-dd"/></td>--%>
                <c:if test="${not empty yusuan.rent}">
                    <td>${yusuan.rent}</td>
                </c:if>
                <c:if test="${not empty yusuan.rent2}">
                    <td>${yusuan.rent2}</td>
                </c:if>
                <c:if test="${not empty yusuan.rent3}">
                    <td>${yusuan.rent3}</td>
                </c:if>
                <c:if test="${not empty yusuan.rent4}">
                    <td>${yusuan.rent4}</td>
                </c:if>
                <c:if test="${not empty yusuan.rent5}">
                    <td>${yusuan.rent5}</td>
                </c:if>
                <c:if test="${not empty yusuan.rent6}">
                    <td>${yusuan.rent6}</td>
                </c:if>
            </tr>
        </c:forEach>
    </c:if>
    </c:if>
    <c:if test="${queryYusuanList.result==false}">
        <tr >
            <td colspan="0">
                <div style="font-size: 17px;line-height: 17px;padding-left: 500px;color:rgb(221,81,76);">未查询到符合条件的数据</div>
            </td>
        </tr>
    </c:if>




