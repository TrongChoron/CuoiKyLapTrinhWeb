/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.admin;

import com.myshop.constant.WebConstant;
import com.myshop.model.DiscountModel;
import com.myshop.service.IDiscountService;
import com.myshop.service.impl.DiscountService;
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
@WebServlet(name = "DiscountController", urlPatterns = {"/admin-discount"})
public class DiscountController extends HttpServlet {

    private IDiscountService discountService;
    
    public DiscountController(){
        this.discountService = new  DiscountService();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DiscountModel discountModel = FormUtil.toModel(DiscountModel.class, request);
        String url = "";
        String action = request.getParameter("action");
        String key = request.getParameter("key");
        if(action == null){
            DiscountModel model = new DiscountModel();
            model.setListResult(discountService.findAll());
            request.setAttribute(WebConstant.MODEL, model);
            url = "/views/admin/List/ListDiscount.jsp";
        }else if (action.equals("insert")){
             url = "/views/admin/Insert/InsertDiscount.jsp";
        }else if (action.equals("edit")) {
            url = "/views/admin/Insert/InsertDiscount.jsp";
            Integer id = Integer.parseInt(request.getParameter("discountId"));
            discountModel = discountService.findByID(id);
            request.setAttribute("discountModel", discountModel);            
        }
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }


}
