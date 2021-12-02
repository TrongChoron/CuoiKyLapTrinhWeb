/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.api.admin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myshop.model.UsersModel;
import com.myshop.service.IUserService;
import com.myshop.service.impl.UserService;
import com.myshop.utils.Bcrypt;
import com.myshop.utils.HttpUtil;
import com.myshop.utils.SessionUtil;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
@WebServlet(name = "UserAPI", urlPatterns = {"/api-admin-user"})
public class UserAPI extends HttpServlet {

    private static final long serialVersionUID = 2686801510274002166L;
    @Inject
    private IUserService userService;

    public UserAPI() {
        this.userService = new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        UsersModel userModel = HttpUtil.of(req.getReader()).toModel(UsersModel.class);
        UsersModel findUser = null;
        Bcrypt bcript = new Bcrypt(10);
        UsersModel model1 = userService.isUserExist(userModel);
        if (bcript.verifyAndUpdateHash(userModel.getPassword(), model1.getPassword())) {
          findUser = userService.findByUserNameAndPassword(model1.getUserName(), model1.getPassword());
        }
        mapper.writeValue(resp.getOutputStream(), findUser);
    }

    //Function add user
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

    //Function update user
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

    //Function delete user
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
