/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service;

import com.myshop.model.CartItemsModel;
import java.util.List;

/**
 *
 * @author asus
 */
public interface ICartItemsService {
    public void save(CartItemsModel cartitemModel);
    public void update(CartItemsModel cartitemModel);
    CartItemsModel findByID(Integer cartitemId);
    public Integer delete(List<Integer> ids);
    public List<CartItemsModel> findAll();
}
