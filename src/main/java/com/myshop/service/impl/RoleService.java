/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.RoleDao;
import com.myshop.dao.impl.RoleDaoImpl;
import com.myshop.service.IRoleService;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class RoleService implements IRoleService{
    
    @Inject
    RoleDao roleDAO;

    RoleService() {
        roleDAO = new RoleDaoImpl();
    }
    
}
