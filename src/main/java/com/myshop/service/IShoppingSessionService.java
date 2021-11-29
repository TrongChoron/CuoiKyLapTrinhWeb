/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service;

import com.myshop.model.ShoppingSessionModel;
import java.util.List;

/**
 *
 * @author asus
 */
public interface IShoppingSessionService {
     public void save(ShoppingSessionModel shoppingSessionModel);
    public void update(ShoppingSessionModel shoppingSessionModel);
    ShoppingSessionModel findByID(Integer shoppingSessionId);
    public Integer delete(List<Integer> ids);
    public List<ShoppingSessionModel> findAll();
}
