/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.admin;

import com.myshop.constant.WebConstant;
import com.myshop.dao.ProductDao;
import com.myshop.dao.UserDao;
import com.myshop.dao.impl.ProductDaoImpl;
import com.myshop.dao.impl.UserDaoImpl;
import com.myshop.model.ProductModel;
import com.myshop.model.UsersModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
@WebServlet( name = "Admin-home", urlPatterns = {"/admin-home"})
public class HomeController extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserDao dao = new UserDaoImpl();
        List<UsersModel> list = dao.findAll();
        ProductDao dao1 = new ProductDaoImpl();
        List<ProductModel> list1 = dao1.findAll();
        request.setAttribute(WebConstant.LIST_ITEMS, list1);
        RequestDispatcher rd = request.getRequestDispatcher("views/admin/home.jsp");
        rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//         RequestDispatcher rd = request.getRequestDispatcher("views/admin/home.jsp");
//        rd.forward(request, response);
        doGet(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
