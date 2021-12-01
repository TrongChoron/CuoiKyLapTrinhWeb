/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.web;

import com.myshop.constant.WebConstant;
import com.myshop.model.ProductModel;
import com.myshop.service.IProductService;
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
@WebServlet(name = "ProductDetailController", urlPatterns = {"/product-detail"})
public class ProductDetailController extends HttpServlet {
    private IProductService productService;
    
    public ProductDetailController(){
        this.productService = new ProductService();
    }

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductModel productModel = FormUtil.toModel(ProductModel.class, request);
        String url = "";        
        productModel = productService.findByID(Integer.parseInt(request.getParameter("productId")));
        request.setAttribute(WebConstant.MODEL, productModel);
        productModel.setListResult(productService.findByManufacture(productModel.getManufact().getManufactId()));        
       RequestDispatcher rd = request.getRequestDispatcher("/views/product/productDetails.jsp");
            rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }


}
