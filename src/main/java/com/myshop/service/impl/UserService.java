/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.UserDao;
import com.myshop.dao.impl.UserDaoImpl;
import com.myshop.model.UsersModel;
import com.myshop.service.IUserService;

/**
 *
 * @author asus
 */
public class UserService implements IUserService {

    private UserDao userDAO;

    public UserService() {
        userDAO = new UserDaoImpl();
    }

    @Override
    public UsersModel findByUserNameAndPassword(String userName, String password) {
        return userDAO.findUserByUsernameAndPassword(userName, password);
    }

    @Override
    public void save(UsersModel userModel) {
        userDAO.save(userModel); 
    }

    @Override
    public void update(UsersModel userModel) {
        userDAO.update(userModel); 
    }

    @Override
    public UsersModel findByID(Integer userId) {
        UsersModel oldModel = userDAO.findById(userId);
        return oldModel;
    }

}
