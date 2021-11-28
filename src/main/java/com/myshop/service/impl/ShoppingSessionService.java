/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.ShoppingSessionDao;
import com.myshop.dao.impl.ShoppingSessionDaoImpl;
import com.myshop.service.IShoppingSessionService;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class ShoppingSessionService implements IShoppingSessionService{
    
    @Inject
    ShoppingSessionDao shoppingSessionDAO;

    ShoppingSessionService() {
        shoppingSessionDAO = new ShoppingSessionDaoImpl();
    }
    
}
