/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service;

import com.myshop.model.RoleModel;
import java.util.List;

/**
 *
 * @author asus
 */
public interface IRoleService {
     public void save(RoleModel roleModel);
    public void update(RoleModel roleModel);
    RoleModel findByID(Integer roleId);
    public Integer delete(List<Integer> ids);
    public List<RoleModel> findAll();
}
