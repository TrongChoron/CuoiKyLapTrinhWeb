/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.CartItemDao;
import com.myshop.dao.impl.CartItemDaoImpl;
import com.myshop.model.CartItemsModel;
import com.myshop.service.ICartItemsService;
import java.util.List;
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

    @Override
    public void save(CartItemsModel cartitemModel) {
        cartItemsDao.save(cartitemModel);
    }

    @Override
    public void update(CartItemsModel cartitemModel) {
        cartItemsDao.update(cartitemModel);
    }

    @Override
    public CartItemsModel findByID(Integer cartitemId) {
        return cartItemsDao.findById(cartitemId);
    }

    @Override
    public Integer delete(List<Integer> ids) {
        return cartItemsDao.delete(ids);
    }

    @Override
    public List<CartItemsModel> findAll() {
        return cartItemsDao.findAll();
    }
    
}
