/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.OrderItemsDao;
import com.myshop.dao.impl.OrderItemsDaoImpl;
import com.myshop.service.IOrderItemsService;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class OrderItemsService implements IOrderItemsService{
    
    @Inject
    OrderItemsDao orderItemsDAO;

    OrderItemsService() {
        orderItemsDAO = new OrderItemsDaoImpl();
    }
    
}
