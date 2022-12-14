<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>找回密码</title>
    <%--    <link rel="stylesheet" href="static/css/regist.css">--%>
    </head>
    <body>
        <jsp:include page="../../common/head.jsp"/>
        <div class="content">
            <div class="web-width">
                <div class="for-liucheng">
                    <div class="liulist for-cur"></div>
                    <div class="liulist"></div>
                    <div class="liulist"></div>
                    <div class="liulist"></div>
                    <div class="liutextbox">
                        <div class="liutext for-cur"><em>1</em><br/>
                            <strong>填写账户名</strong></div>
                        <div class="liutext"><em>2</em><br/>
                            <strong>验证身份</strong></div>
                        <div class="liutext"><em>3</em><br/>
                            <strong>设置新密码</strong></div>
                        <div class="liutext"><em>4</em><br/>
                            <strong>完成</strong></div>
                    </div>
                </div>

                <form action="forget" method="post" class="forget-pwd">
                    <dl>
                        <dt>电话号码：</dt>
                            <input type="text" class = "dd" name="tel" id="tel" placeholder="请输入手机号">
                        <div class="clears"></div>
                    </dl>
                    <dl>
                        <dt>验证码：</dt>
                        <dd>
                            <input type="text" class = "dd" name="checkCode" id="checkCode" placeholder="请输入验证码">
                            <div class="yanzma"><img src="static/imag/checkcode.jpg"/> <a href="#">换一换</a></div>
                        </dd>
                        <div class="clears"></div>
                    </dl>
                    <div class="subtijiao">
                        <input type="submit" value="提交"/>
                    </div>
                </form>
            </div>
        </div>
        <jsp:include page="../../common/footer.jsp"/>
        <style type="text/css">
            .clears {
                clear: both
            }

            .for-liucheng {
                width: 640px;
                margin: 30px auto;
                height: 50px;
                padding: 20px 0 0 0;
                position: relative
            }

            .liulist {
                float: left;
                width: 25%;
                height: 7px;
                background: #ccc
            }

            .liutextbox {
                position: absolute;
                width: 100%;
                left: 0;
                top: 10px
            }

            .liutextbox .liutext {
                float: left;
                width: 25%;
                text-align: center
            }

            .liutextbox .liutext em {
                display: inline-block;
                width: 24px;
                height: 24px;
                -moz-border-radius: 24px;
                -webkit-border-radius: 24px;
                border-radius: 24px;
                background: #ccc;
                text-align: center;
                font-size: 14px;
                line-height: 24px;
                font-style: normal;
                font-weight: bold;
                color: #fff
            }

            .liutextbox .liutext strong {
                display: inline-block;
                height: 26px;
                line-height: 26px;
                font-weight: 400
            }

            .liulist.for-cur {
                background: #77b852
            }

            .liutextbox .for-cur em {
                background: #77b852
            }

            .liutextbox .for-cur strong {
                color: #77b852
            }

            .forget-pwd {
                width: 500px;
                margin: 20px auto;
                min-height: 400px
            }

            .forget-pwd input, .forget-pwd select, .forget-pwd button {
                border: 0;
                margin: 0;
                padding: 0;
                background: 0
            }

            .forget-pwd dl {
                margin-bottom: 20px
            }

            .forget-pwd dt {
                float: left;
                padding-right: 10px;
                width: 100px;
                height: 30px;
                line-height: 30px;
                text-align: right;
                font-size: 14px
            }

            .forget-pwd dd {
                float: left;
                width: 380px;
                height: 30px;
                position: relative
            }

            .forget-pwd dd input {
                width: 190px;
                height: 28px;
                border: #ccc 1px solid
            }

            .forget-pwd dd select {
                width: 190px;
                height: 30px;
                border: #ccc 1px solid
            }

            .forget-pwd dd button {
                width: 120px;
                height: 30px;
                line-height: 30px;
                border: #ddd 1px solid;
                background: #f1f1f1;
                text-align: center;
                cursor: pointer;
                font-size: 14px;
                color: #666
            }

            .forget-pwd .yanzma {
                position: absolute;
                left: 200px;
                top: 2px;
                height: 30px;
                line-height: 30px;
                width: 180px
            }

            .subtijiao {
                padding: 0 0 0 110px
            }

            .subtijiao input {
                width: 85px;
                height: 32px;
                background: #f60;
                color: #fff;
                font-size: 14px;
                cursor: pointer
            }

            .successs {
                text-align: center;
                padding: 20px 0 60px 0
            }

            .successs h3 {
                padding: 20px;
                font-size: 25px;
                color: #a0cd4e
            }
        </style>
        <style>
            html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video, select {
                margin: 0;
                padding: 0;
                border: 0;
            }

            table {
                border-collapse: collapse;
            }

            body {
                font-size: 12px;
                color: #333;
                font-family: "Microsoft Yahei";
                overflow-x: hidden;
                background: #f7f7f7;
            }

            /*.bodybg {*/
            /*    background: url(../images/bodybg.jpg) right 160px no-repeat;*/
            /*}*/

            img, a {
                border: 0;
                text-decoration: none;
            }

            ol, ul {
                list-style: none;
            }

            a {
                color: #333;
                -webkit-transition: all .3s ease-out;
                -moz-transition: all .3s ease-out;
                transition: all .3s ease-out;
            }

            a:hover {
                color: #005b9e;
                -webkit-transition: all .3s ease-out;
                -moz-transition: all .3s ease-out;
                transition: all .3s ease-out;
            }

            img {
                /*max-width: 100%;*/
                /*height: auto;*/
                width: 80px;
                height: 40px;
            }

            .web-width {
                width: 1200px;
                margin: 0 auto;
            }

            .fl {
                float: left;
            }

            .fr {
                float: right;
            }
        </style>
    </body>
</html>