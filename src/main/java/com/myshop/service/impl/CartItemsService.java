/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.CartItemDao;
import com.myshop.dao.impl.CartItemDaoImpl;
import com.myshop.service.ICartItemsService;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class CartItemsService implements ICartItemsService{
    @Inject
    private CartItemDao cartItemsDao;

    public CartItemsService() {
        cartItemsDao = new CartItemDaoImpl();
    }
    
}
