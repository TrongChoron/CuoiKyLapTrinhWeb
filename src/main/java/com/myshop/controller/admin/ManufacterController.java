/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.admin;

import com.myshop.constant.WebConstant;
import com.myshop.model.ManufacterModel;
import com.myshop.service.IManufacterService;
import com.myshop.service.impl.ManufacterService;
import com.myshop.utils.FormUtil;
import java.io.IOException;
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
@WebServlet(name = "ManufacterController", urlPatterns = {"/admin-manufacter"})
public class ManufacterController extends HttpServlet {

    private IManufacterService manufactService;
    
    public ManufacterController(){
        this.manufactService = new  ManufacterService();
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ManufacterModel manufacterModel = FormUtil.toModel(ManufacterModel.class, request);
        String url = "";
        String action = request.getParameter("action");
        String key = request.getParameter("key");
        if(action == null){
            ManufacterModel model = new ManufacterModel();
            model.setListResult(manufactService.findAll());
            request.setAttribute(WebConstant.MODEL, model);
            url = "/views/admin/List/ListManufacter.jsp";
        }else if (action.equals("insert")) {
            url = "/views/admin/Insert/InsertManufacter.jsp";
        }else if (action.equals("edit")) {
            url = "/views/admin/Insert/InsertManufacter.jsp";
            Integer id = Integer.parseInt(request.getParameter("manufactId"));
            manufacterModel = manufactService.findByID(id);
            request.setAttribute("manufacterModel", manufacterModel);            
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
