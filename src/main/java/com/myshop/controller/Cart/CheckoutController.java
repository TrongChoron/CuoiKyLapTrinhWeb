/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.Cart;

import com.myshop.constant.WebConstant;
import com.myshop.model.OrderDetailsModel;
import com.myshop.model.OrderItemsModel;
import com.myshop.model.UsersModel;
import com.myshop.service.IOrderDetailsService;
import com.myshop.service.IOrderItemsService;
import com.myshop.service.impl.OrderDetailsService;
import com.myshop.service.impl.OrderItemsService;
import com.myshop.utils.FormUtil;
import com.myshop.utils.JavaMailUtil;
import com.myshop.utils.MailTemplateUtil;
import com.myshop.utils.SessionUtil;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
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
@WebServlet(name = "CheckoutController", urlPatterns = {"/check-out"})
public class CheckoutController extends HttpServlet {
    
    private IOrderDetailsService orderDetailsService;
    private IOrderItemsService orderItemsService;
    
    public CheckoutController(){
        this.orderDetailsService = new OrderDetailsService();
        this.orderItemsService = new OrderItemsService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsersModel user = (UsersModel) SessionUtil.getInstance().getValue(request, "USERMODEL");
        if (user == null) {

            response.sendRedirect(
                    request.getContextPath() + "/login-dang-nhap?action=login&messageResponse=not_login&alert=danger");
        } else {
            if (SessionUtil.getInstance().getValue(request, "order") == null) {
                request.setAttribute(WebConstant.ALERT, WebConstant.TYPE_ERROR);
                request.setAttribute(WebConstant.MESSAGE_RESPONSE, "You don't have any thing to check out!");
                 RequestDispatcher rd = request.getRequestDispatcher("views/web/cart.jsp");
                rd.forward(request, response);
//                response.sendRedirect(
//                        request.getContextPath() + "/cart");
            } else {
                OrderDetailsModel order = (OrderDetailsModel) SessionUtil.getInstance().getValue(request, "order");
                order.setUser(user);
                Integer orderDetailId = orderDetailsService.save(order);
                order.setOrderId(orderDetailId);
                List<OrderItemsModel> listItems = order.getOrderItemsList();
                for (OrderItemsModel item : listItems) {
                    item.setOrderDetails(order);
                    orderItemsService.save(item);
                }
                try {
                    JavaMailUtil.sendMail(user.getEmail(), MailTemplateUtil.templateMailCongratulation(), "Conratulation!");
                } catch (MessagingException ex) {
                    Logger.getLogger(CheckoutController.class.getName()).log(Level.SEVERE, null, ex);
                }
                SessionUtil.getInstance().removeValue(request, "order");
                request.setAttribute(WebConstant.ALERT, WebConstant.TYPE_SUCCESS);
                request.setAttribute(WebConstant.MESSAGE_RESPONSE, "Check Out successfully an email will send to your mail!");
                 RequestDispatcher rd = request.getRequestDispatcher("views/web/cart.jsp");
                rd.forward(request, response);
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
