/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.api.admin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myshop.model.ManufacterModel;
import com.myshop.service.IManufacterService;
import com.myshop.service.impl.ManufacterService;
import com.myshop.utils.HttpUtil;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
@WebServlet(name = "ManufacterAPI", urlPatterns = {"/api-admin-manufacter"})
public class ManufacterAPI extends HttpServlet {

    private static final long serialVersionUID = 2686801510274002166L;
    
    private IManufacterService manufacterService;
    
    public ManufacterAPI(){
        this.manufacterService = new ManufacterService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        ManufacterModel manufacterModel = HttpUtil.of(req.getReader()).toModel(ManufacterModel.class);
        ManufacterModel findManufacter = manufacterService.findByID(manufacterModel.getManufactId());
        mapper.writeValue(resp.getOutputStream(), findManufacter);
    }

    //Function add user
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        ManufacterModel manufacterModel = HttpUtil.of(request.getReader()).toModel(ManufacterModel.class);
        manufacterService.save(manufacterModel);
        mapper.writeValue(response.getOutputStream(), manufacterModel);
    }

    //Function update user
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        ManufacterModel manufacterModel = HttpUtil.of(request.getReader()).toModel(ManufacterModel.class);
        manufacterService.delete(manufacterModel.getIds());
        mapper.writeValue(response.getOutputStream(), "{}");
    }

    //Function delete user
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        ManufacterModel manufacterModel = HttpUtil.of(request.getReader()).toModel(ManufacterModel.class);        
        manufacterService.update(manufacterModel);
        mapper.writeValue(response.getOutputStream(), manufacterModel);
    }

}
