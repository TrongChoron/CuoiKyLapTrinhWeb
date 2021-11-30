/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.api.admin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myshop.model.DiscountModel;
import com.myshop.service.IDiscountService;
import com.myshop.service.impl.DiscountService;
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
@WebServlet(name = "DiscountAPI", urlPatterns = {"/api-admin-discount"})
public class DiscountAPI extends HttpServlet {

    private static final long serialVersionUID = 2686801510274002166L;

    private IDiscountService discountService;

    public DiscountAPI() {
        this.discountService = new DiscountService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        DiscountModel discountModel = HttpUtil.of(req.getReader()).toModel(DiscountModel.class);
        DiscountModel findDiscount = discountService.findByID(discountModel.getDiscountId());
        mapper.writeValue(resp.getOutputStream(), findDiscount);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        DiscountModel discountModel = HttpUtil.of(req.getReader()).toModel(DiscountModel.class);
        discountService.save(discountModel);
        mapper.writeValue(resp.getOutputStream(), discountModel);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        DiscountModel discountModel = HttpUtil.of(req.getReader()).toModel(DiscountModel.class);
        discountService.update(discountModel);
        mapper.writeValue(resp.getOutputStream(), discountModel);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        DiscountModel discountModel = HttpUtil.of(req.getReader()).toModel(DiscountModel.class);
        discountService.delete(discountModel.getIds());
        mapper.writeValue(resp.getOutputStream(), "{ }");
    }

}
