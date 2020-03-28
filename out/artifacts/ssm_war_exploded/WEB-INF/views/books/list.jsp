<%--
  Created by IntelliJ IDEA.
  User: gyf
  Date: 2018/5/25
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图书列表</title>
</head>
<body>
图书：<br>
<table border="1">
    <tr>
        <td>名称</td>
        <td>ISBN</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${books}" var="books">
        <tr>
            <td>${books.bookName}</td>
            <td>${books.isbn}</td>
            <td>
                <a href="${pageContext.request.contextPath}/books/delete.do?id=${books.id}">删除</a>
                &nbsp;<a href="${pageContext.request.contextPath}/books/edit.do?id=${books.id}">编辑</a>

            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
