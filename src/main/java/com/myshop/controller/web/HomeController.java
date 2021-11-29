/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.web;

import com.myshop.constant.WebConstant;
import com.myshop.dao.ProductDao;
import com.myshop.dao.impl.ProductDaoImpl;
import com.myshop.model.ProductModel;
import com.myshop.model.UsersModel;
import com.myshop.service.IUserService;
import com.myshop.service.impl.UserService;
import com.myshop.utils.FormUtil;
import com.myshop.utils.SessionUtil;
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
@WebServlet(name = "Trang-chu", urlPatterns = {"/trang-chu", "/login-dang-nhap", "/thoat"})
public class HomeController extends HttpServlet {

    private static final long serialVersionUID = 2686801510274002166L;
//    ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.equals("login")) {
            String alert = request.getParameter("alert");
            String message = request.getParameter("message");
            if (message != null && alert != null) {
                request.setAttribute("message", message);
                request.setAttribute("alert", alert);
            }
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/login.jsp");
            rd.forward(request, response);
        } else if (action != null && action.equals("logout")) {
            SessionUtil.getInstance().removeValue(request, "USERMODEL");
            response.sendRedirect(request.getContextPath() + "/trang-chu");
        } else {
            ProductDao dao1 = new ProductDaoImpl();
            List<ProductModel> list1 = dao1.findAll();
            request.setAttribute(WebConstant.LIST_ITEMS, list1);
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
            rd.forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IUserService userService = new UserService();
        String action = request.getParameter("action");
        if (action != null && action.equals("login")) {
            UsersModel model = FormUtil.toModel(UsersModel.class, request);
            model = userService.findByUserNameAndPassword(model.getUserName(), model.getPassword());
            if (model != null) {
                SessionUtil.getInstance().putValue(request, "USERMODEL", model);
                if (model.getRoleModel().getRoleName().equals("user")) {
                    response.sendRedirect(request.getContextPath() + "/trang-chu");
                } else if (model.getRoleModel().getRoleName().equals("admin")) {
                    response.sendRedirect(request.getContextPath() + "/admin-home");
                }
            } else {
                request.setAttribute(WebConstant.ALERT, WebConstant.TYPE_ERROR);
                request.setAttribute(WebConstant.MESSAGE_RESPONSE, "User Name or Password was wrong!");
//                response.sendRedirect(request.getContextPath() + "/dang-nhap?action=login&message=username_password_invalid&alert=danger");
                RequestDispatcher rd = request.getRequestDispatcher("views/web/login.jsp");
                rd.forward(request, response);
            }
        }
    }

    
}
