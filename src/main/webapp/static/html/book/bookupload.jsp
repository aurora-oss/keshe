<%@ page import="com.example.bookstore.service.Bookservice" %>
<%@ page import="com.example.bookstore.service.impl.BookServiceImpl" %>
<%@ page import="com.example.bookstore.pojo.Book" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/18
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍文件上传</title>
    <style type="text/css">
        .bookUpload{
        }
        .Top{
            font-size: 40px;
            margin: 0px 0px 60px 0px;
        }
        .input{
            border: 2px solid #F0F8FF;
            width: 200px;
            height: 30px;
            border-radius: 12px 12px 12px 12px;
        }
    </style>
    <script type="text/javascript">
        $(function(){
            $("a.dedeleteItem").click(function () {
                return confirm("你确定要删除"+$(this).parent().parent().find("td:first").text()+"这本书吗？");
            })
        })
    </script>
</head>
<body>
    <%!
        Bookservice bookservice = new BookServiceImpl();
        List<Book> bookList = bookservice.getBookList();
    %>
    <jsp:include page="../../common/head.jsp"/>
    <h2 class = "Top" align="center">网站头展示区域</h2>
    <form action="upload" method="post">
        <input type="hidden" name="action" value="deleteItem">
        <div class ="bookUpload" align="center">
            <table border="1px solid black">
                <tr>
                    <th>名称</th>
                    <th>价格</th>
                    <th>作者</th>
                    <th>销量</th>
                    <th>库存</th>
                    <th>操作1</th>
                    <th>操作2</th>
                </tr>
                <%for (Book book : bookList) {            %>
                <tr>
                    <td>${requestScope.Page}</td>
                    <td><%= book.getPrice()%></td>
                    <td><%= book.getAuthor()%></td>
                    <td><%= book.getSales()%></td>
                    <td><%= book.getStock()%></td>
                    <td>
<%--                        <form action="/bookService" method="post">--%>
<%--                            <input type="hidden" name="action" value="deleteItem"/>--%>
<%--                            <input type="submit" value="delete" />--%>
<%--                    <a href="/bookService?action=deleteItem&Title=<%=book.getTitle()%>">删除</a>--%>
                    <a href="/bookService?action=deleteItem">删除</a>
<%--                        </form>--%>
                    </td>
                    <td><a href="/bookstore/bookService?action=getBook&Title=<%=book.getTitle()%>">修改</a> </td>
                </tr>
                <%}%>
            </table>
            <tr>
                <td> </td>
                <td> </td>
                <td> </td>
                <td> </td>
                <td> </td>
                <td> </td>
                <td><a href="static/html/book/addBook.jsp">添加图书</a></td>
            </tr>
        </div>
    </form>
    <div align="center">
        <a href="#">首页</a>
        <a href="#">上一页</a>
        <a href="pages">1</a>
        【】
        <a href="#">5</a>
        <a href="">下一页</a>
        <a href="">尾页</a>
        共页，条记录，到第<input value="4" name="pn" id="pn_input"/>页
        <input type="button" value="确定">
    </div>
    <jsp:include page="../../common/footer.jsp"/>
</body>
</html>
