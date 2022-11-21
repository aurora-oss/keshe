<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>图书添加</title>
  <script src="static/javaScript/jQuery-3.5.1.js"></script>
</head>
  <body>
  <jsp:include page="../../common/head.jsp"/>
  <form action="/bookService" method="post">
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
        <td><input type="text" name = "title"/></td>
        <td><input type="text" name ="author"/></td>
        <td><input type="text" name="price"/></td>
        <td><input type="text" name="sales"/></td>
        <td><input type="text" name="stock"/></td>
        <td><input type="submit"/></td>
      </tr>
    </table>
  </form>
  <jsp:include page="../../common/footer.jsp"/>
  </body>
</html>
