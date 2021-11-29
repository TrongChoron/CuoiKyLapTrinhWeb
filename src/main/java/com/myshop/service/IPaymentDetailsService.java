/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service;

import com.myshop.model.PaymentDetailsModel;
import java.util.List;

/**
 *
 * @author asus
 */
public interface IPaymentDetailsService {
     public void save(PaymentDetailsModel paymentDetailModel);
    public void update(PaymentDetailsModel paymentDetailModel);
    PaymentDetailsModel findByID(Integer paymentDetailId);
    public Integer delete(List<Integer> ids);
    public List<PaymentDetailsModel> findAll();
}
