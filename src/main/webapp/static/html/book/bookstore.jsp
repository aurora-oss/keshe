<%@ page import="com.example.bookstore.pojo.Book" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.bookstore.service.Bookservice" %>
<%@ page import="com.example.bookstore.service.impl.BookServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>书的类型</title>
    <script src="static/javaScript/jQuery-3.5.1.js"></script>
</head>
    <body>
    <jsp:include page="../../common/head.jsp"/>
        <h2 align="center">Product List</h2>
        <div class = "book" >
<%--            先从数据库中获取相关书籍数据--%>
            <%!
                Bookservice bookservice = new BookServiceImpl();
                List<Book> books = bookservice.getBookList();
            %>
            <%for (Book book : books) {            %>
                <div class = "item">
                    <img class="img" src=" <%= book.getImag()%>"/>
                    <%= book.getTitle()%><br/>
                    ￥<%= book.getPrice()%><br/>
                    <%= book.getAuthor()%><br/>
                    <%= book.getSales()%><br/>
                    <a href="bookService?action=addBookToStore&Title=${book.name}" class ="a" name ="addBookTostore" >添加到购物车</a>
                </div>
            <%}%>
        </div>
    <div align="center">
        <a href="/bookService?action=page&pageNo=1">首页</a>
        <a href="#">上一页</a>
        <a href="pages">1</a>
        【2】
        <a href="#">5</a>
        <a href="">下一页</a>
        <a href="">尾页</a>
        共10页，30条记录，到第<input value="4" name="pn" id="pn_input"/>页
        <input type="button" value="确定">
    </div>
    <jsp:include page="../../common/footer.jsp"/>
    </body>
    <style type="text/css">
        .book{
            width: 100%;
            margin: 2% 2% 1% 2%;
            display: flex;
            flex-wrap:wrap;
        }
        .item{
            border: 2px solid #cccccc;
            border-radius: 20px;
            display:flex;
            width: 400px;
            display: flex;
            margin: 2% 0% 1% 2%;
            box-shadow: 10px 10px 5px #888888;
        }
        .img{
            width: 100px;
            height: 130px;
            margin: 0% 4% 1% 0%;
            box-shadow: 10px 10px 5px #888888;
        }
        .a{
            margin-left: auto;
            margin-right: 20px;
        }
    </style>
</html>