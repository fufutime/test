<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/6
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  method="post" action="${pageContext.request.contextPath}/room/add" >
    <table border="1px">
        <tr>
            <th>房间名称</th>
            <td width="100px"><input name="roomName" type="text"  /></td>
        </tr>
        <tr>
            <th>房间类型</th>
            <td width="100px">
                <select  name="roomTypeId">
                    <c:forEach items="${roomTypeList}" var="roomtype">
                        <option value="${roomtype.typeId}">${roomtype.typeName}</option>
                    </c:forEach>

                </select>
            </td>
        </tr>
        <tr>
            <th>房间金额</th>
            <td width="100px"><input name="roomPrice" type="text"  /></td>
        </tr>
        <tr>
            <th>房间简介</th>
            <td width="100px">
                <textarea  name="roomDes" role="10" cols="20" ></textarea></td>
        </tr>
        <tr>
            <th></th>
            <td><button type="submit">提交</button>
                <a  href="${pageContext.request.contextPath}/room/selectAll">
                <button type="button">返回主页面</button>
                </a>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
