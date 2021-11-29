/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.OrderItemsDao;
import com.myshop.dao.impl.OrderItemsDaoImpl;
import com.myshop.model.OrderItemsModel;
import com.myshop.service.IOrderItemsService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class OrderItemsService implements IOrderItemsService{
    
    @Inject
    private OrderItemsDao orderItemsDAO;

    public OrderItemsService() {
        orderItemsDAO = new OrderItemsDaoImpl();
    }

    @Override
    public void save(OrderItemsModel orderItemModel) {
        orderItemsDAO.save(orderItemModel);
    }

    @Override
    public void update(OrderItemsModel orderItemModel) {
        orderItemsDAO.update(orderItemModel);
    }

    @Override
    public OrderItemsModel findByID(Integer orderItemId) {
        return orderItemsDAO.findById(orderItemId);
    }

    @Override
    public Integer delete(List<Integer> ids) {
        return orderItemsDAO.delete(ids);
    }

    @Override
    public List<OrderItemsModel> findAll() {
        return orderItemsDAO.findAll();
    }
    
}
