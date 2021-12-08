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
import com.myshop.utils.Bcrypt;
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IUserService userService = new UserService();
        UsersModel model = FormUtil.toModel(UsersModel.class, request);
        UsersModel checkUser = userService.isUserExist(model);
        if (checkUser != null) {
            response.sendRedirect(request.getContextPath() + "/login-dang-nhap?action=login&&messageResponse=User_has_exist&&alert=danger");
        } else {
            RoleModel role = new RoleModel();
            model.setRoleModel(role);
            model.getRoleModel().setRoleId(2);
            //format Password
            Bcrypt bcript = new Bcrypt(10);
            String password = bcript.hash(model.getPassword());
            model.setPassword(password);
            userService.save(model);
            request.setAttribute("messageResponse", "SignUp success");
            request.setAttribute("alert", WebConstant.TYPE_SUCCESS);
//            response.sendRedirect(request.getContextPath() + "/login-dang-nhap?action=login&&messageResponse=Signup_success&&alert=success");
            response.sendRedirect(request.getContextPath() + "/login-dang-nhap?action=login");
        }
    }


}
