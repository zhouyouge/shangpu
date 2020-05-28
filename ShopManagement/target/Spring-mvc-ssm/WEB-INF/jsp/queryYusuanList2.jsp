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
            <c:if test="${ queryYusuanList.flag==7}">
                <th width="100">7月租金</th>
            </c:if>
            <c:if test="${ queryYusuanList.flag==8}">
                <th width="100">7月租金</th>
                <th width="100">8月租金</th>
            </c:if>
            <c:if test="${ queryYusuanList.flag==9}">
                <th width="100">7月租金</th>
                <th width="100">8月租金</th>
                <th width="100">9月租金</th>
            </c:if>
            <c:if test="${ queryYusuanList.flag==10}">
                <th width="100">7月租金</th>
                <th width="100">8月租金</th>
                <th width="100">9月租金</th>
                <th width="100">10月租金</th>
            </c:if>
            <c:if test="${queryYusuanList.flag==11}">
                <th width="100">7月租金</th>
                <th width="100">8月租金</th>
                <th width="100">9月租金</th>
                <th width="100">10月租金</th>
                <th width="100">11月租金</th>
            </c:if>
            <c:if test="${queryYusuanList.flag==12}">
                <th width="100">7月租金</th>
                <th width="100">8月租金</th>
                <th width="100">9月租金</th>
                <th width="100">10月租金</th>
                <th width="100">11月租金</th>
                <th width="100">12月租金</th>
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
                <c:if test="${not empty yusuan.rent7}">
                    <td>${yusuan.rent7}</td>
                </c:if>
                <c:if test="${not empty yusuan.rent8}">
                    <td>${yusuan.rent8}</td>
                </c:if>
                <c:if test="${not empty yusuan.rent9}">
                    <td>${yusuan.rent9}</td>
                </c:if>
                <c:if test="${not empty yusuan.rent10}">
                    <td>${yusuan.rent10}</td>
                </c:if>
                <c:if test="${not empty yusuan.rent11}">
                    <td>${yusuan.rent11}</td>
                </c:if>
                <c:if test="${not empty yusuan.rent12}">
                    <td>${yusuan.rent12}</td>
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




