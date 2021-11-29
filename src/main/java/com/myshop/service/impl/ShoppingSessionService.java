/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.ShoppingSessionDao;
import com.myshop.dao.impl.ShoppingSessionDaoImpl;
import com.myshop.model.ShoppingSessionModel;
import com.myshop.service.IShoppingSessionService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class ShoppingSessionService implements IShoppingSessionService{
    
    @Inject
    private ShoppingSessionDao shoppingSessionDAO;

    public ShoppingSessionService() {
        shoppingSessionDAO = new ShoppingSessionDaoImpl();
    }

    @Override
    public void save(ShoppingSessionModel shoppingSessionModel) {
        shoppingSessionDAO.save(shoppingSessionModel);
    }

    @Override
    public void update(ShoppingSessionModel shoppingSessionModel) {
        shoppingSessionDAO.update(shoppingSessionModel);
    }

    @Override
    public ShoppingSessionModel findByID(Integer shoppingSessionId) {
        return shoppingSessionDAO.findById(shoppingSessionId);
    }

    @Override
    public Integer delete(List<Integer> ids) {
        return shoppingSessionDAO.delete(ids);
    }

    @Override
    public List<ShoppingSessionModel> findAll() {
        return shoppingSessionDAO.findAll();
    }
    
}
