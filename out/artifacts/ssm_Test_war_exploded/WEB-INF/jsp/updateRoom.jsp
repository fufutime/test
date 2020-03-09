<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/6
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新页面</title>
</head>
<body>
<form  method="post" action="${pageContext.request.contextPath}/room/update" >
    <input type="hidden" name="roomId" value="${room.roomId}" />
    <input type="hidden" name="roomTypeId" value="${room.roomTypeId}" />
<table border="1px">
    <tr>
        <th>房间名称</th>
        <td width="100px"><input name="roomName" type="text" value="${room.roomName}" readonly/></td>
    </tr>
    <tr>
        <th>房间类型</th>
        <td width="100px">
            <select readonly name="typeName">
                <option value="${room.typeName}">${room.typeName}</option>
            </select>
        </td>
    </tr>
    <tr>
        <th>房间金额</th>
        <td width="100px"><input name="roomPrice" type="text" value="${room.roomPrice}" readonly/></td>
    </tr>
    <tr>
        <th>房间简介</th>
        <td width="100px">
            <textarea  name="roomDes"  readonly>${room.roomDes}</textarea></td>
    </tr>
    <tr>
        <th>入住天数</th>
        <td width="100px"><input type="number" min="1" max="365" name="joinDay"/></td>
    </tr>
    <tr>
        <th>入住时间</th>
        <td width="100px"><input type="date" name="addTime" /></td>
    </tr>
    <tr>
        <th></th>
        <td><button type="submit">提交</button></td>
    </tr>
</table>
</form>
</body>
</html>
