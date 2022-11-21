package com.example.bookstore.web;

import com.example.bookstore.pojo.Book;
import com.example.bookstore.pojo.User;
import com.example.bookstore.service.Bookservice;
import com.example.bookstore.service.Userservice;
import com.example.bookstore.service.impl.BookServiceImpl;
import com.example.bookstore.service.impl.UserServiceiml;
import com.example.bookstore.test.WebUtils;
import com.example.bookstore.utils.EncodingUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author  <a href="mailto:david@example.com">monster</a>
 * @version $Revision: 1.400
 * 2022-09--26
 */
@WebServlet(name = "UserServlet", value = "/userServlet")
public class UserServlet extends BaseServlet {
    private final Userservice userservice = new UserServiceiml();

    protected void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        User loginUser = WebUtils.CopyParamsToBean(request.getParameterMap(),new User());
        System.out.println(loginUser);
        if (userservice.existUsername(loginUser.getName()) != null) {
            //登录成功 跳转到成功页面
            request.getRequestDispatcher("static/html/book/bookstore.jsp").forward(request,response);
        }else{
            // 登录失败 重新回到登录页面
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }

    protected void regist(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String checkcode = request.getParameter("checkcode");
        //2. 调用业务层处理业务
        User loginUser = WebUtils.CopyParamsToBean(request.getParameterMap(),new User());
        // 检查验证码是否正确 目前写死，要求验证码为：7364
        if("7364".equalsIgnoreCase(checkcode)) {
            // 检查用户名是否可用
            if(!userservice.existUsername(loginUser.getName()))
            {
                request.getRequestDispatcher("./regist.jsp").forward(request, response);
            }else{
                userservice.registUser(loginUser);
                request.getRequestDispatcher("static/html/book/bookstore.jsp").forward(request, response);
            }
        }else{
            // 跳回注册页面
            System.out.println("验证码错误");
            request.setAttribute("msg","请输入密码ddd");
            request.setAttribute("username",loginUser.getName());
            request.getRequestDispatcher("regist.jsp").forward(request, response);
        }
    }

}
