/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.api.admin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myshop.model.ProductModel;
import com.myshop.service.IProductService;
import com.myshop.service.impl.ProductService;
import com.myshop.utils.HttpUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
@WebServlet(name = "ProductAPI", urlPatterns = {"/api-admin-product"})
public class ProductAPI extends HttpServlet {

    private static final long serialVersionUID = 2686801510274002161L;
    
    private IProductService productService;

    public ProductAPI() {
        this.productService = new ProductService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        ProductModel productModel = HttpUtil.of(req.getReader()).toModel(ProductModel.class);
        ProductModel findProduct = productService.findByID(productModel.getProductId());
        mapper.writeValue(resp.getOutputStream(), findProduct);
    }
    
    //Function add user
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        ProductModel productModel = HttpUtil.of(request.getReader()).toModel(ProductModel.class);
        productService.save(productModel);
        mapper.writeValue(response.getOutputStream(), productModel);
    }

    //Function update user
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        ProductModel productModel = HttpUtil.of(request.getReader()).toModel(ProductModel.class);
        productService.delete(productModel.getIds());
        mapper.writeValue(response.getOutputStream(), "{}");
    }

    //Function delete user
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        ProductModel productModel = HttpUtil.of(request.getReader()).toModel(ProductModel.class);        
        productService.update(productModel);
        mapper.writeValue(response.getOutputStream(), productModel);
    }

}
