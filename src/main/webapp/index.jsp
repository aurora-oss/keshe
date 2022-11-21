<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>登录注册界面</title>
    <base href="http://localhost:8080/bookstore/">
    <script src="static/javaScript/regist.js"></script>
    <link rel="stylesheet" href="static/css/regist.css">
</head>

<body>
    <!-- 整体布局 -->
    <div class="container right-panel-active">
        <!-- 登录框 -->
        <div class="container_from container_signin">
            <form action="userServlet" method="post" class="from" id="from2">
                <h2 class="form_title">欢迎登录</h2>
                <input type="hidden" name="action" value="login"/>
                <input type="text" name="name"  class="input">
                <input type="password" name="password"  class="input">
                <div class="overlay_panel overlay_right">
                    <a href="./regist.jsp" class="btn1" id="signup">没有账号 ？点击注册</a>
                </div>
<!--                <input type="button" name="regist" value="没有账号 ？点击注册"/>-->
                <div>
                    <span>记住密码</span><input type="checkbox" name="rup" id="rup" />
                    <span>自动登录</span><input type="checkbox" name="autoLogin" />
                </div>
                <a href="./static/html/user/RegainPassword.jsp" class="link">忘记密码?</a>
                <button class="btn">登录</button>
            </form>
        </div>

    </div>
    <jsp:include page="./static/common/footer.jsp"/>
    </body>

</html>