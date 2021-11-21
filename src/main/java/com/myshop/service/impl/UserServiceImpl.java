/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.UserDao;
import com.myshop.dao.impl.UserDaoImpl;
import com.myshop.dto.UserDTO;
import com.myshop.model.UsersModel;
import com.myshop.service.UserService;
import com.myshop.utils.beanutils.UserBeanUtil;

/**
 *
 * @author asus
 */
public class UserServiceImpl implements UserService{
    @Override
    public UserDTO isUserExist(UserDTO dto) {
        UserDao userDao = new UserDaoImpl();
        UsersModel entity = userDao.findUserByUsernameAndPassword(dto.getUserName(), dto.getPassword());
        return UserBeanUtil.entity2Dto(entity);
    }

    @Override
    public UserDTO findRoleByUser(UserDTO dto) {
        UserDao userDao = new UserDaoImpl();
        UsersModel entity = userDao.findUserByUsernameAndPassword(dto.getUserName(), dto.getPassword());
        return UserBeanUtil.entity2Dto(entity);
    }
}
