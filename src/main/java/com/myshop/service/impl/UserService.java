/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.UserDao;
import com.myshop.dao.impl.UserDaoImpl;
import com.myshop.model.UsersModel;
import com.myshop.paging.Pageble;
import com.myshop.service.IUserService;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class UserService implements IUserService {

    @Inject
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
        Timestamp ts = Timestamp.from(Instant.now());
        userModel.setCreateAt(ts);
        userDAO.save(userModel); 
    }

    @Override
    public void update(UsersModel userModel) {
        UsersModel oldModel = userDAO.findById(userModel.getUserId());
        userModel.setCreateAt(oldModel.getCreateAt());
        Timestamp ts = Timestamp.from(Instant.now());
        userModel.setModifiedAt(ts);
        userDAO.update(userModel); 
    }

    @Override
    public UsersModel findByID(Integer userId) {
        UsersModel userModel = userDAO.findById(userId);
        return userModel;
    }

    @Override
    public Integer delete(List<Integer> ids) {
        return userDAO.delete(ids);
    }

    @Override
    public List<UsersModel> findAllPaging(Pageble pageble) {
        return userDAO.findAllPaging(pageble);
    }

    @Override
    public List<UsersModel> findAll() {
        return userDAO.findAll();
    }

    @Override
    public Integer getTotalItem() {
        return userDAO.findAll().size();
    }

    @Override
    public UsersModel isUserExist(UsersModel model) {
         return userDAO.findUserByUsername(model.getUserName());
    }

    @Override
    public List<UsersModel> findByRole(Integer roleID) {
        return userDAO.findByRole(roleID);
    }

}
