/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.admin;

import com.myshop.constant.WebConstant;
import com.myshop.model.OrderDetailsModel;
import com.myshop.service.IOrderDetailsService;
import com.myshop.service.impl.OrderDetailsService;
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
@WebServlet(name = "OrderController", urlPatterns = {"/admin-order"})
public class OrderController extends HttpServlet {

    private IOrderDetailsService orderDetailService;
    
    public OrderController(){
        this.orderDetailService = new OrderDetailsService();
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        OrderDetailsModel orderDetailModel = FormUtil.toModel(OrderDetailsModel.class, request);
        String url="";
        OrderDetailsModel model = new OrderDetailsModel();
        model.setListResult(orderDetailService.findAll());
        request.setAttribute(WebConstant.MODEL, model);
        url = "/views/admin/List/ListOrder.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
    }


   

}
