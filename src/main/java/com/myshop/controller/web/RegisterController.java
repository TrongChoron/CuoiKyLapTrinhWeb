/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.web;

import com.myshop.constant.WebConstant;
import com.myshop.model.RoleModel;
import com.myshop.model.UsersModel;
import com.myshop.service.IUserService;
import com.myshop.service.impl.UserService;
import com.myshop.utils.FormUtil;
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
@WebServlet(name = "RegisterController", urlPatterns = {"/register-user"})
public class RegisterController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IUserService userService = new UserService();
        UsersModel model = FormUtil.toModel(UsersModel.class, request);
        UsersModel checkUser = userService.isUserExist(model);
        if (checkUser != null) {            
            response.sendRedirect(request.getContextPath() + "/login-dang-nhap?action=login&&messageResponse=User_has_exist&&alert=danger");
        } else {
            RoleModel roleModel = new RoleModel();
            model.setRoleModel(roleModel);
            model.getRoleModel().setRoleId(2);
            userService.save(model);
            request.setAttribute("messageResponse", "SignUp success");
            request.setAttribute("alert", WebConstant.TYPE_SUCCESS);
            response.sendRedirect(request.getContextPath() + "/login-dang-nhap?action=login&&messageResponse=Signup_success&&alert=success");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}