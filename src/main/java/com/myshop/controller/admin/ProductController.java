/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.admin;

import com.myshop.constant.WebConstant;
import com.myshop.model.DiscountModel;
import com.myshop.model.ManufacterModel;
import com.myshop.model.ProductModel;
import com.myshop.service.IDiscountService;
import com.myshop.service.IManufacterService;
import com.myshop.service.IProductService;
import com.myshop.service.impl.DiscountService;
import com.myshop.service.impl.ManufacterService;
import com.myshop.service.impl.ProductService;
import com.myshop.utils.FormUtil;
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
    
    private IManufacterService manufacterService;
    
    private IDiscountService discountService;

    public ProductController() {
        this.productService = new ProductService();
        this.manufacterService = new ManufacterService();
        this.discountService = new DiscountService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductModel productModel = FormUtil.toModel(ProductModel.class, request);
        String url = "";
        String action = request.getParameter("action");
        String key = request.getParameter("key");
        if (action == null) {
            ProductModel model = new ProductModel();
            model.setListResult(productService.findAll());
            request.setAttribute(WebConstant.MODEL, model);
//        RequestDispatcher rd = request.getRequestDispatcher("views/admin/List/ListProduct.jsp");
//        rd.forward(request, response);
            url = "/views/admin/List/ListProduct.jsp";
        } else if (action.equals("insert")) {
            url = "/views/admin/Insert/InsertProduct.jsp";
        } else if (action.equals("edit")) {
            url = "/views/admin/Insert/InsertProduct.jsp";
            Integer id = Integer.parseInt(request.getParameter("productId"));
            productModel = productService.findByID(id);
            request.setAttribute("productModel", productModel);
            request.setAttribute("manufacterModel", manufacterService.findAll());
            request.setAttribute("discountModel", discountService.findAll());
        }
        ManufacterModel categoryModel=new ManufacterModel();
        categoryModel.setListResult(manufacterService.findAll());
        request.setAttribute("manufacterModel",categoryModel);
        DiscountModel discountModel=new DiscountModel();
        discountModel.setListResult(discountService.findAll());
        request.setAttribute("discountModel",discountModel);
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
