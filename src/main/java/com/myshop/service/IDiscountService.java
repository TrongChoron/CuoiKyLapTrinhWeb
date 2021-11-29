/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service;

import com.myshop.model.DiscountModel;
import java.util.List;

/**
 *
 * @author asus
 */
public interface IDiscountService {
    public void save(DiscountModel discountModel);
    public void update(DiscountModel discountModel);
    DiscountModel findByID(Integer discountId);
    public Integer delete(List<Integer> ids);
    public List<DiscountModel> findAll();
}
