/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.admin;

import com.myshop.constant.WebConstant;
import com.myshop.model.ProductModel;
import com.myshop.service.IProductService;
import com.myshop.service.impl.ProductService;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author asus
 */
@WebServlet(name = "Product-admin", urlPatterns = {"/admin-product"})
public class ProductController extends HttpServlet {
   
    private IProductService productService;
    
    public ProductController(){
        this.productService = new  ProductService();
    }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ProductModel model = new ProductModel();
        model.setListResult(productService.findAll());
        request.setAttribute(WebConstant.MODEL, model);
        RequestDispatcher rd = request.getRequestDispatcher("views/admin/List/ListProduct.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

   

}
