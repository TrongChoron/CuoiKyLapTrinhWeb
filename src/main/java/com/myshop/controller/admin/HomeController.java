/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.admin;

import com.myshop.model.*;
import com.myshop.service.IOrderDetailsService;
import com.myshop.service.IOrderItemsService;
import com.myshop.service.IProductService;
import com.myshop.service.IUserService;
import com.myshop.service.impl.OrderDetailsService;
import com.myshop.service.impl.OrderItemsService;
import com.myshop.service.impl.ProductService;
import com.myshop.service.impl.UserService;
import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(name = "Admin-home", urlPatterns = {"/admin-home"})
public class HomeController extends HttpServlet {

    private IOrderItemsService orderItemService;
    private IOrderDetailsService orderDetailsService;
    private IProductService productService;
    private IUserService userService;

    public HomeController() {
        this.orderItemService = new OrderItemsService();
        this.orderDetailsService = new OrderDetailsService();
        this.productService = new ProductService();
        this.userService = new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<UsersModel> listUsers = new ArrayList<UsersModel>();
        listUsers = userService.findByRole(2);
        List<ProductModel> listProduct = new ArrayList<ProductModel>();
        listProduct = productService.findAll();
        List<OrderDetailsModel> listOrderDetails = new ArrayList<OrderDetailsModel>();
        listOrderDetails = orderDetailsService.findAll();
        request.setAttribute("users", listUsers);
        request.setAttribute("products", listProduct);
        request.setAttribute("orders", listOrderDetails);
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
