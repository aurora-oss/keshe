package com.example.bookstore.web;

import com.example.bookstore.pojo.Book;
import com.example.bookstore.pojo.Page;
import com.example.bookstore.service.Bookservice;
import com.example.bookstore.service.impl.BookServiceImpl;
import com.example.bookstore.test.WebUtils;
import com.example.bookstore.utils.EncodingUtils;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "BookService", value = "/bookService")
public class BookUpload extends BaseServlet {

    private static final Bookservice bookService = new BookServiceImpl();
    private static final EncodingUtils encodingUtils = new EncodingUtils();

    protected void addBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        Book book = WebUtils.CopyParamsToBean(request.getParameterMap(),new Book());
        bookService.saveBook(book);
        System.out.println(book);
        request.getRequestDispatcher("static/html/book/bookstore.jsp").forward(request,response);
    }
    protected void deleteItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String Title = request.getParameter("Title");
        bookService.deleteBook(Title);
        System.out.println(Title);
        request.getRequestDispatcher("static/html/book/bookupload.jsp").forward(request,response);
    }
    protected void updateItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Book book = WebUtils.CopyParamsToBean(request.getParameterMap(),new Book());
        bookService.updateBook(book);
        request.getRequestDispatcher("static/html/book/bookstore.jsp").forward(request, response);
    }

    protected void getBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求的图书参数，将其保存到request域中分发给jsp页面；
        String Title = request.getParameter("Title");
        Book book = bookService.getBook(Title);
        request.setAttribute("book",book);
        request.getRequestDispatcher("static/html/book/editBook.jsp").forward(request, response);
    }
    /*处理分页功能
    * */
    protected void page(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int pageNo,pageSize;
        if((request.getParameter("pageNo")) == null){
            pageNo =1;
        }else{
            pageNo=Integer.parseInt(request.getParameter("pageNo"));
        }
        if((request.getParameter("pageSize")) == null){
            pageSize =17;
        }else{
            pageSize=Integer.parseInt(request.getParameter("pageSize"));
        }
        Page<Book> page = bookService.page(pageNo, pageSize);
        System.out.println(page.getItems());
        request.setAttribute("Page", page);
        request.getRequestDispatcher("static/html/book/bookupload.jsp").forward(request, response);
    }
}
// 废弃的可以用于上传图片的添加图书函数
//    protected void addBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//        // 前端页面传回参数 提示：前端采用multipart/form-data方式，因此采用request.getParameter得不到相关参数，这里采用getInputStream方法
//        String url,title ;
//        // 文件上传
//        //        1. 判断上传数据是否是多段数据，否则不是上传
//        if (!ServletFileUpload.isMultipartContent(request)) {
//            return;
//        }
//        // 创建FileItemFactory工厂实现嘞
//        FileItemFactory fileItemFactory = new DiskFileItemFactory();
//        // 创建用于解析上传数据的工具类 ServletFileUpload
//        ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
//        // 解析上传的数据，得到每一个表单项
//        List bookAttribute = new ArrayList<>();
//        try {
//            List<FileItem> files = servletFileUpload.parseRequest(request);
//            for (FileItem fileItem : files) {
//                if (fileItem.isFormField()) {
//                    bookAttribute.add(fileItem.getString("UTF-8"));
//                } else {
//                    String fileItem_Encoding = encodingUtils.getEncoding(fileItem.getName());
//                    url = "static/imag/" + new String(fileItem.getName().getBytes(fileItem_Encoding),"UTF-8");
//                    fileItem.write(new File("C:\\Users\\Administrator\\Desktop\\学习笔记\\Java\\bookstore\\src\\main\\webapp\\static\\imag\\"
//                            + fileItem.getName()));
//                    bookAttribute.add(url);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(bookAttribute.toString());
//        title = String.valueOf(bookAttribute.get(0));
//        if(bookService.getBook(title) == null)
//        {
//            bookService.saveBook(new Book(String.valueOf(bookAttribute.get(0)),String.valueOf(bookAttribute.get(1)),Double.parseDouble(String.valueOf(bookAttribute.get(2))),Integer.parseInt(String.valueOf(bookAttribute.get(3)))
//                    ,String.valueOf(bookAttribute.get(4)), Double.parseDouble(String.valueOf(bookAttribute.get(5)))));
//        }
//        request.getRequestDispatcher("static/html/book/bookstore.jsp").forward(request, response);
//    }
