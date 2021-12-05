/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.dao.impl;

import com.myshop.dao.OrderDetailsDao;
import com.myshop.model.OrderDetailsModel;
import com.myshop.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author asus
 */
public class OrderDetailsDaoImpl extends AbstractDao<Integer, OrderDetailsModel> implements OrderDetailsDao{

    @Override
    public Integer saveReturnId(OrderDetailsModel orderDetailModel) {
        Integer id = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(orderDetailModel);
            transaction.commit();
            id = orderDetailModel.getOrderId();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return id;
    }
    
}
