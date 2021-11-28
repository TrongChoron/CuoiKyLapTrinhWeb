/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.DiscountDao;
import com.myshop.dao.impl.DiscountDaoImpl;
import com.myshop.service.IDiscountService;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class DiscountService implements IDiscountService{
    
    @Inject
    DiscountDao discountDAO;

    DiscountService() {
        discountDAO = new DiscountDaoImpl();
    }
}
