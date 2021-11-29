/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.RoleDao;
import com.myshop.dao.impl.RoleDaoImpl;
import com.myshop.model.RoleModel;
import com.myshop.service.IRoleService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class RoleService implements IRoleService{
    
    @Inject
    private RoleDao roleDAO;

    public RoleService() {
        roleDAO = new RoleDaoImpl();
    }

    @Override
    public void save(RoleModel roleModel) {
        roleDAO.save(roleModel);
    }

    @Override
    public void update(RoleModel roleModel) {
        roleDAO.update(roleModel);
    }

    @Override
    public RoleModel findByID(Integer roleId) {
        return roleDAO.findById(roleId);
    }

    @Override
    public Integer delete(List<Integer> ids) {
        return roleDAO.delete(ids);
    }

    @Override
    public List<RoleModel> findAll() {
        return roleDAO.findAll();
    }
    
}
