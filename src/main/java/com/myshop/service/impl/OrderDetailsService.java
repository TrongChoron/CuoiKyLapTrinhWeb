/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.OrderDetailsDao;
import com.myshop.dao.impl.OrderDetailsDaoImpl;
import com.myshop.service.IOrderDetailsService;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class OrderDetailsService implements IOrderDetailsService{
    
    @Inject
    OrderDetailsDao orderDetailsDAO;

    OrderDetailsService() {
        orderDetailsDAO = new OrderDetailsDaoImpl();
    }
    
}
