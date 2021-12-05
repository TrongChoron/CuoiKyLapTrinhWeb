/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service;

import com.myshop.model.OrderDetailsModel;
import com.myshop.model.OrderItemsModel;
import java.util.List;

/**
 *
 * @author asus
 */
public interface IOrderItemsService {
     public void save(OrderItemsModel orderItemModel);
    public void update(OrderItemsModel orderItemModel);
    OrderItemsModel findByID(Integer orderItemId);
    public Integer delete(List<Integer> ids);
    public List<OrderItemsModel> findAll();
    public List<OrderItemsModel> findByOrderDetaiilId(Integer id);
}
