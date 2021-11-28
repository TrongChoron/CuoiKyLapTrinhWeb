/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.PaymentDetailsDao;
import com.myshop.dao.impl.PaymentDetailsDaoImpl;
import com.myshop.service.IPaymentDetailsService;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class PaymentDetailsService implements IPaymentDetailsService{
    
    @Inject
    PaymentDetailsDao paymentDetailsDAO;

    PaymentDetailsService() {
        paymentDetailsDAO = new PaymentDetailsDaoImpl();
    }
    
}
