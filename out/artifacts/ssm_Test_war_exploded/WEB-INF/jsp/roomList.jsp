<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/6
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/room/toAdd">
<button type="button" >添加房间信息</button>
</a>
<table>
    <tr>
        <th>房间名称</th>
        <th>房间类型</th>
        <th>房间价格</th>
        <th>房间描述</th>
        <th>入住时间</th>
        <th>入住天数</th>
        <th>订购状态</th>
        <th>应付金额</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${roomInfoList}" var="room">
        <tr>
            <td>${room.roomName}</td>
            <td>${room.typeName}</td>
            <td>${room.roomPrice}</td>
            <td>${room.roomDes}</td>
            <td>${room.addTime}</td>
            <td>${room.joinDay}</td>
            <td>${room.buyState == 1?"未预定":"已预定"}</td>
            <td>${room.totalPrice}</td>
            <td>
                <c:if test="${room.buyState == 1}">
                    <a href="${pageContext.request.contextPath}/room/toUpdate?id=${room.roomId}">开始预订</a>
                </c:if>
                <a href="#" onclick="del(${room.roomId})">删除</a></td>
        </tr>
    </c:forEach>
    <script src="../jquery.js"></script>
    <script type="text/javascript">
        function del(id) {

            var result = confirm("是否删除?");
            if(result){
                window.location.href='${pageContext.request.contextPath}/room/del?id='+id;
                return true;
            }else {
                return false;
            }
        }

    </script>
</table>
</body>
</html>
