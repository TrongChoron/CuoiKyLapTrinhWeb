/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.OrderDetailsDao;
import com.myshop.dao.impl.OrderDetailsDaoImpl;
import com.myshop.model.OrderDetailsModel;
import com.myshop.service.IOrderDetailsService;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class OrderDetailsService implements IOrderDetailsService{
    
    @Inject
    private OrderDetailsDao orderDetailsDAO;

    public OrderDetailsService() {
        orderDetailsDAO = new OrderDetailsDaoImpl();
    }

    @Override
    public Integer save(OrderDetailsModel orderDetailModel) {
        Timestamp ts = Timestamp.from(Instant.now());
        orderDetailModel.setCreateAt(ts);
        return orderDetailsDAO.saveReturnId(orderDetailModel);
    }

    @Override
    public void update(OrderDetailsModel orderDetailModel) {
        orderDetailsDAO.update(orderDetailModel);
    }

    @Override
    public OrderDetailsModel findByID(Integer orderDetailId) {
        return orderDetailsDAO.findById(orderDetailId);
    }

    @Override
    public Integer delete(List<Integer> ids) {
        return orderDetailsDAO.delete(ids);
    }

    @Override
    public List<OrderDetailsModel> findAll() {
        return orderDetailsDAO.findAll();
    }
    
}
