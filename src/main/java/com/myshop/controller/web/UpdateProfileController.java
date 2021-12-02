/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.web;

import com.myshop.constant.WebConstant;
import com.myshop.model.UsersModel;
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

   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsersModel user = (UsersModel) SessionUtil.getInstance().getValue(request, "USERMODEL");
        request.setAttribute(WebConstant.MODEL,user);
        RequestDispatcher rd = request.getRequestDispatcher("/views/web/updateProfile.jsp");
            rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    
}
