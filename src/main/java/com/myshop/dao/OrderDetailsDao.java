/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.dao;

import com.myshop.model.OrderDetailsModel;

/**
 *
 * @author asus
 */
public interface OrderDetailsDao extends GenericDao<Integer, OrderDetailsModel>{
    Integer saveReturnId(OrderDetailsModel orderDetailModel);
}
