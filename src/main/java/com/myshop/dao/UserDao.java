/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.dao;

import com.myshop.model.UsersModel;

/**
 *
 * @author asus
 */
public interface UserDao extends GenericDao<Integer, UsersModel>{
    UsersModel findUserByUsernameAndPassword(String userName, String password);
}
