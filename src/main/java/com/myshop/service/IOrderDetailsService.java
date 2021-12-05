/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service;

import com.myshop.model.OrderDetailsModel;
import java.util.List;

/**
 *
 * @author asus
 */
public interface IOrderDetailsService {
    public Integer save(OrderDetailsModel orderDetailModel);
    public void update(OrderDetailsModel orderDetailModel);
    OrderDetailsModel findByID(Integer orderDetailId);
    public Integer delete(List<Integer> ids);
    public List<OrderDetailsModel> findAll();
}
