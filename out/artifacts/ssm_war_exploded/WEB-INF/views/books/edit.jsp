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
    <title>编辑商品</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script>
        function submitFile() {
            alert("提交图片到后台");

            //封装请求数据
            var options = {
               type:'post',
                data:{
                   username : 'lv'
                },
                url:'${pageContext.request.contextPath}/upload/upload.do',
                success:function (Date) {
                    console.log(Date);
                }
            };

            //提交表单,依赖于jquery的表单扩展插件jquery.form.js
            $('#itemsForm').ajaxSubmit(options)
        }
    </script>
</head>
<body>
<form id="itemsForm" action="${pageContext.request.contextPath}/books/update.do" method="post">
<table border="1">
    <tr>
        <td>名称</td>
        <td>
            <input type="text" name="bookName" value="${book.bookName}"></td>
            <input type="hidden" name="id" value="${book.id}"></td>
    </tr>
    <tr>
        <td>ISBN</td>
        <td><input type="text" name="isbn" value="${book.isbn}"></td>
    </tr>
    <tr>
        <td>文件上传</td>
        <td>
            <input type="file" name="upload" onchange="submitFile()">
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="更新">
        </td>
    </tr>
</table>

</form>
</body>
</html>
