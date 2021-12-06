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
import com.myshop.paging.PageRequest;
import com.myshop.paging.Pageble;
import com.myshop.service.IProductService;
import com.myshop.service.impl.ProductService;
import com.myshop.sort.Sorter;
import com.myshop.utils.FormUtil;
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
@WebServlet(name = "ProductController", urlPatterns = {"/product"})
public class ProductController extends HttpServlet {

    private IProductService productService;

    public ProductController() {
        this.productService = new ProductService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("manufactId") == null) {
            ProductModel productModel = FormUtil.toModel(ProductModel.class, request);
            Pageble papgeble = new PageRequest(productModel.getPage(), productModel.getMaxPageItem(), new Sorter(productModel.getSortName(), productModel.getSortBy()));
            productModel.setListResult(productService.findAllPaging(papgeble));
            productModel.setTotalItem(productService.getTotalItem());
            productModel.setTotalPage((int) Math.ceil((double) productModel.getTotalItem() / productModel.getMaxPageItem()));
            request.setAttribute(WebConstant.MODEL, productModel);
            RequestDispatcher rd = request.getRequestDispatcher("views/product/home.jsp");
            rd.forward(request, response);
        } else {
            ProductModel productModel = FormUtil.toModel(ProductModel.class, request);
            Pageble papgeble = new PageRequest(productModel.getPage(), productModel.getMaxPageItem(), new Sorter(productModel.getSortName(), productModel.getSortBy()));
            productModel.setListResult(productService.findByManufacture(Integer.parseInt(request.getParameter("manufactId"))));
            productModel.setTotalItem(productModel.getListResult().size());
            productModel.setMaxPageItem(9);
            productModel.setTotalPage((int) Math.ceil((double) productModel.getTotalItem() / productModel.getMaxPageItem()));
            request.setAttribute(WebConstant.MODEL, productModel);
            RequestDispatcher rd = request.getRequestDispatcher("views/product/home.jsp");
            rd.forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("views/product/home.jsp");
        rd.forward(request, response);
    }

}
