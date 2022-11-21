<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/5
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--动态获取base的值--%>
<%
    String basePath = request.getScheme()
        + "://"
            + request.getServerName() + ":"
            + request.getServerPort()
            + request.getContextPath() + "/";
%>
<base href=<%=basePath%>>
<script src="./static/javaScript/jQuery-3.5.1.js"></script>
    <style type="text/css">
        .header{
            display: flex;
        }
        .icon-magnet{
            width: 50px;
            height: auto;
            margin-left: 1%;
        }
        .header_title .header_a .weather{
            margin: 30px 0% 0% 30%;
            font-size: 20px;
            font-family: STHeiti,Arial, Helvetica, sans-serif;
        }
        .header_title{
            margin: 30px 0% 0% 30%;
        }

        .header_a{
            margin: 30px 0% 0% 2%;
        }
        .weather{
            margin: 30px 0% 0% 40%;
        }
    </style>
<div class = "header">
<%--    传递gif照片--%>
    <img class = "icon-magnet" src="./static/imag/icon.png"/>
<%--    菜单显示--%>
    <p class="weather"> 今天是2022-09-18，星期日</p>
    <p class = "header_title">欢迎monster大驾光临!</p>
    <a class="header_a" href="/bookstore/bookService?action=page">主页</a>
</div>
<hr/>