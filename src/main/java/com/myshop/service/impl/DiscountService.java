/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.DiscountDao;
import com.myshop.dao.impl.DiscountDaoImpl;
import com.myshop.model.DiscountModel;
import com.myshop.service.IDiscountService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class DiscountService implements IDiscountService{
    
    @Inject
    private DiscountDao discountDAO;

    public DiscountService() {
        discountDAO = new DiscountDaoImpl();
    }

    @Override
    public void save(DiscountModel discountModel) {
        discountDAO.save(discountModel);
    }

    @Override
    public void update(DiscountModel discountModel) {
        discountDAO.update(discountModel);
    }

    @Override
    public DiscountModel findByID(Integer discountId) {
        return discountDAO.findById(discountId);
    }

    @Override
    public Integer delete(List<Integer> ids) {
        return discountDAO.delete(ids);
    }

    @Override
    public List<DiscountModel> findAll() {
        return discountDAO.findAll();
    }
}
