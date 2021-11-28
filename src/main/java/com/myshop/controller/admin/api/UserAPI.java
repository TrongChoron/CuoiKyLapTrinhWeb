/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.controller.admin.api;

import com.myshop.dao.UserDao;
import com.myshop.dao.impl.UserDaoImpl;
import com.myshop.model.UsersModel;
import com.myshop.service.IUserService;
import com.myshop.service.impl.UserService;
import com.myshop.utils.HttpUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.time.Instant;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author asus
 */
@WebServlet(name = "UserAdminAPI", urlPatterns = {"/api-admin-user"})
public class UserAPI extends HttpServlet {

    private static final long serialVersionUID = 2686801510274002166L;
    @Inject
    private IUserService userService;

//    public UserAPI() {
//        this.userService = new UserService();
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        UsersModel userModel = HttpUtil.of(req.getReader()).toModel(UsersModel.class);
        UsersModel findUser = userService.findByUserNameAndPassword(userModel.getUserName(),userModel.getPassword());
        mapper.writeValue(resp.getOutputStream(), findUser);
    }

    //Function add product
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        UsersModel userModel = HttpUtil.of(request.getReader()).toModel(UsersModel.class);
        userService.save(userModel);
        mapper.writeValue(response.getOutputStream(), userModel);
    }

    //Function update product
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        UsersModel userModel = HttpUtil.of(request.getReader()).toModel(UsersModel.class);
        userService.delete(userModel.getIds());
        mapper.writeValue(response.getOutputStream(), "{}");
    }

    //Function delete product
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        UsersModel userModel = HttpUtil.of(request.getReader()).toModel(UsersModel.class);        
        userService.update(userModel);
        mapper.writeValue(response.getOutputStream(), userModel);
    }
    
}
