/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service;

import com.myshop.model.UsersModel;
import com.myshop.paging.Pageble;
import java.util.List;

/**
 *
 * @author asus
 */
public interface IUserService {
    UsersModel findByUserNameAndPassword(String userName, String password);
    public void save(UsersModel userModel);
    public void update(UsersModel userModel);
    UsersModel findByID(Integer userId);
    public Integer delete(List<Integer> ids);
    public List<UsersModel> findAllPaging(Pageble pageble);
    public List<UsersModel> findAll();
    public Integer getTotalItem();
}
