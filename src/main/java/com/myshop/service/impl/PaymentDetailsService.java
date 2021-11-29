/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.PaymentDetailsDao;
import com.myshop.dao.impl.PaymentDetailsDaoImpl;
import com.myshop.model.PaymentDetailsModel;
import com.myshop.service.IPaymentDetailsService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class PaymentDetailsService implements IPaymentDetailsService{
    
    @Inject
    private PaymentDetailsDao paymentDetailsDAO;

    public PaymentDetailsService() {
        paymentDetailsDAO = new PaymentDetailsDaoImpl();
    }

    @Override
    public void save(PaymentDetailsModel paymentDetailModel) {
        paymentDetailsDAO.save(paymentDetailModel);
    }

    @Override
    public void update(PaymentDetailsModel paymentDetailModel) {
        paymentDetailsDAO.update(paymentDetailModel);
    }

    @Override
    public PaymentDetailsModel findByID(Integer paymentDetailId) {
        return paymentDetailsDAO.findById(paymentDetailId);
    }

    @Override
    public Integer delete(List<Integer> ids) {
        return paymentDetailsDAO.delete(ids);
    }

    @Override
    public List<PaymentDetailsModel> findAll() {
        return paymentDetailsDAO.findAll();
    }
    
}
