package com.example.bookstore.web;

import javax.servlet.ServletInputStream;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

@WebServlet(name = "BaseServlet", value = "/BaseServlet")
public abstract class BaseServlet extends HttpServlet {

//    protected String getAction(HttpServletRequest request){
//        /*浏览器采用了一种编码方式，即 "multipart/form-data" 的编码方式，采用这种方式，浏览器可以很容易将表单内的数据和文件放在一起发送。这种编码方式先定义好一个不可能在数据中出现的字符串作为分界符，然后用它将各个数据段分开，而对于每个数据段都对应着 HTML 页面表单中的一个 Input 区，
//        包括一个 content-disposition 属性，说明了这个数据段的一些信息，如果这个数据段的内容是一个文件，还会有 Content-Type 属性，然后就是数据本身。*/
//        if(request.getParameter("action") == null) {
//            try {
//                request.setCharacterEncoding("UTF-8");
//                StringBuilder buffer = new StringBuilder();
//                BufferedReader reader=null;
//                try{
//                    reader = new BufferedReader(new InputStreamReader(request.getInputStream(),"UTF-8"));
//                    String line=null;
//                    while((line = reader.readLine())!=null){
//                        buffer.append(line);
//                    }
//                }catch(Exception e){
//                    e.printStackTrace();
//                }finally{
//                    if(null!=reader){
//                        try {
//                            reader.close();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//                buffer.toString();
//                return "addBook";
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }else{
//            return request.getParameter("action");
//        }
//        return "addBook";
//    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String action = request.getParameter("action");
        try {
            // 通过反射调用用户模块中的内容
            Method testMethod = this.getClass().getDeclaredMethod(action,HttpServletRequest.class,HttpServletResponse.class);
            System.out.println(testMethod.getName());
            testMethod.invoke(this, request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        this.doPost(req, resp);
    }
}
