/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.admin;

import com.myshop.command.UserCommand;
import com.myshop.constant.WebConstant;
import com.myshop.dto.UserDTO;
import com.myshop.service.UserService;
import com.myshop.service.impl.UserServiceImpl;
import com.myshop.utils.FormUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 *
 * @author asus
 */
@WebServlet(name = "dang-nhap", urlPatterns = {"/login-home"})
public class LoginController extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       RequestDispatcher rd = request.getRequestDispatcher("views/web/login.jsp");
        rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserCommand command = FormUtil.populate(UserCommand.class, request);
        UserDTO pojo = command.getPojo();
         UserService userService = new UserServiceImpl();
        try {
            if (userService.isUserExist(pojo) != null) {
                if (userService.findRoleByUser(pojo) != null && userService.findRoleByUser(pojo).getRoleDTO() != null) {
                    if (userService.findRoleByUser(pojo).getRoleDTO().getRoleName().equals(WebConstant.ROLE_ADMIN)) {
//                        request.setAttribute(WebConstant.ALERT, WebConstant.TYPE_SUCCESS);
//                        request.setAttribute(WebConstant.MESSAGE_RESPONSE, "You are admin");
                          response.sendRedirect( request.getContextPath()+"/admin-home");
                    } else if (userService.findRoleByUser(pojo).getRoleDTO().getRoleName().equals(WebConstant.ROLE_USER)) {
//                        request.setAttribute(WebConstant.ALERT, WebConstant.TYPE_SUCCESS);
//                        request.setAttribute(WebConstant.MESSAGE_RESPONSE, "you are user");
                          response.sendRedirect(request.getContextPath()+"/trang-chu");
                    }
                }

            }
        } catch (NullPointerException e) {
            log.error(e.getMessage(), e);
            request.setAttribute(WebConstant.ALERT, WebConstant.TYPE_ERROR);
            request.setAttribute(WebConstant.MESSAGE_RESPONSE, "User Name or Password was wrong!");
            RequestDispatcher rd = request.getRequestDispatcher("views/web/login.jsp");
            rd.forward(request, response);
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
