/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.admin;

import com.myshop.constant.WebConstant;
import com.myshop.dao.UserDao;
import com.myshop.dao.impl.UserDaoImpl;
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
@WebServlet(name = "UserController", urlPatterns = {"/admin-user"})
public class UserController extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserDao dao = new UserDaoImpl();
            List<UsersModel> list = dao.findAll();
        request.setAttribute(WebConstant.LIST_ITEMS, list);
        RequestDispatcher rd = request.getRequestDispatcher("views/admin/List/ListUser.jsp");
        rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
