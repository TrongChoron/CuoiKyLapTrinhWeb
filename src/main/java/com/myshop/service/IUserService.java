/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service;

import com.myshop.model.UsersModel;

/**
 *
 * @author asus
 */
public interface IUserService {
    UsersModel findByUserNameAndPassword(String userName, String password);
}
