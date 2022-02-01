/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.web;

import com.myshop.constant.WebConstant;
import com.myshop.model.UsersModel;
import com.myshop.service.IUserService;
import com.myshop.service.impl.UserService;
import com.myshop.utils.SessionUtil;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "UpdateProfileController", urlPatterns = {"/update-profile"})
public class UpdateProfileController extends HttpServlet {

    private IUserService userService;

    public UpdateProfileController() {
        this.userService = new UserService();
    }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        UsersModel user = (UsersModel) SessionUtil.getInstance().getValue(request, "USERMODEL");
        UsersModel model = userService.findByID(user.getUserId());
        request.setAttribute(WebConstant.MODEL,model);
        RequestDispatcher rd = request.getRequestDispatcher("/views/web/updateProfile.jsp");
            rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }

    
}
