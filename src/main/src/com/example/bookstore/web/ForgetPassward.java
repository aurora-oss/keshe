package com.example.bookstore.web;

import com.example.bookstore.service.Userservice;
import com.example.bookstore.service.impl.UserServiceiml;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ForgetPassward", value = "/forget")
public class ForgetPassward extends HttpServlet {
    private Userservice userservice = new UserServiceiml();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 找回密码界面，检测验证码、手机号是否正确，使用service层调用dao层查询数据库，成功则转发重新登录界面，失败则重定向
        String tel = request.getParameter("tel");
        String checkCode = request.getParameter("checkCode");
        if (tel.isEmpty()){
            request.getRequestDispatcher("static/html/user/RegainPassword.jsp").forward(request,response);
        }
        if ("7364".equalsIgnoreCase(checkCode))
        {
            // 检测手机号，存在则返回登录正确页面
            if(userservice.existUserTel(tel)) {
                System.out.println(userservice.existUserTel(tel));
                request.getRequestDispatcher("static/html/book/bookstore.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("static/html/user/RegainPassword.jsp").forward(request,response);
            }
        }
        else{
            // 重新定向到该页面
            request.getRequestDispatcher("static/html/user/RegainPassword.jsp").forward(request,response);
        }

    }
}
