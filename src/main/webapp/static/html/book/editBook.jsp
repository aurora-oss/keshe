<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/23
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>图书修改</title>
    <script src="static/javaScript/jQuery-3.5.1.js"></script>
</head>
<body>
<jsp:include page="../../common/head.jsp"/>
<form action="bookService" method="post" enctype="multipart/form-data">
    <table align="center" border="1">
        <input type="hidden" name="action" value="addBook"/>
        <tr>
            <th>名称</th>
            <th>作者</th>
            <th>价格</th>
            <th>销量</th>
            <th>库存</th>
            <th>操作</th>
        </tr>
        <tr>
            <td><input type="text" value="${requestScope.book.title}" name = "title"/></td>
            <td><input type="text" value="${requestScope.book.author}" name ="author"/></td>
            <td><input type="text" value="${requestScope.book.price}" name="price"/></td>
            <td><input type="text" value="${requestScope.book.sales}" name="sales"/></td>
            <td><input type="text" value="${requestScope.book.stock}" name="stock"/></td>
            <td><input type="submit"/></td>
        </tr>
    </table>
</form>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
