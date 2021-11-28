/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.admin;

import com.myshop.constant.WebConstant;
import com.myshop.model.UsersModel;
import com.myshop.service.IUserService;
import com.myshop.service.impl.UserService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author asus
 */
@WebServlet(name = "UserController", urlPatterns = {"/admin-user"})
public class UserController extends HttpServlet {

    @Inject
    private IUserService userService;
    
    public UserController(){
        this.userService = new  UserService();
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsersModel model = new UsersModel();
        model.setListResult(userService.findAll());
        request.setAttribute(WebConstant.MODEL, model);
        RequestDispatcher rd = request.getRequestDispatcher("views/admin/List/ListUser.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    
}
