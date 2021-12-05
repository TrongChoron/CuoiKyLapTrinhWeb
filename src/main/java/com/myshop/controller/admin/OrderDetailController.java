/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.admin;

import com.myshop.constant.WebConstant;
import com.myshop.model.OrderDetailsModel;
import com.myshop.model.OrderItemsModel;
import com.myshop.model.ProductModel;
import com.myshop.service.IOrderDetailsService;
import com.myshop.service.IOrderItemsService;
import com.myshop.service.IProductService;
import com.myshop.service.impl.OrderDetailsService;
import com.myshop.service.impl.OrderItemsService;
import com.myshop.service.impl.ProductService;
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
@WebServlet(name = "OrderDetailController", urlPatterns = {"/admin-order-detail"})
public class OrderDetailController extends HttpServlet {

    private IOrderItemsService orderItemService;
    private IOrderDetailsService orderDetailsService;

    public OrderDetailController() {
        this.orderItemService = new OrderItemsService();
        this.orderDetailsService= new OrderDetailsService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        OrderItemsModel orderItemModel = FormUtil.toModel(OrderItemsModel.class, request);
        String url = "";
        Integer id = Integer.parseInt(request.getParameter("orderId"));
        OrderItemsModel model = new OrderItemsModel();
        model.setListResult(orderItemService.findByOrderDetaiilId(id));
        request.setAttribute(WebConstant.MODEL, model);
        url = "/views/admin/List/ListOrderDetails.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
    }

}
