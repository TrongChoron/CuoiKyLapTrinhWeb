/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.dao;

import com.myshop.model.OrderDetailsModel;
import com.myshop.model.OrderItemsModel;
import java.util.List;

/**
 *
 * @author asus
 */
public interface OrderItemsDao extends GenericDao<Integer, OrderItemsModel>{
    List<OrderItemsModel> findByOrderDetaiilId(Integer id);
}
