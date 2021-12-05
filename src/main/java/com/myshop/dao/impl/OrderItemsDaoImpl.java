/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.dao.impl;

import com.myshop.dao.OrderItemsDao;
import com.myshop.model.OrderDetailsModel;
import com.myshop.model.OrderItemsModel;
import com.myshop.utils.HibernateUtil;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author asus
 */
public class OrderItemsDaoImpl extends AbstractDao<Integer, OrderItemsModel> implements OrderItemsDao{

    private Class<OrderItemsModel> persistenceClass;
    
     public OrderItemsDaoImpl() {
        this.persistenceClass = (Class<OrderItemsModel>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    public String getPersistenceClassName() {
        return persistenceClass.getSimpleName();
    }
    @Override
    public List<OrderItemsModel> findByOrderDetaiilId(Integer id) {
        List<OrderItemsModel> result = null;
       try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            //        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                //HQL
                StringBuilder sql = new StringBuilder("from ");
                sql.append(this.getPersistenceClassName());
                sql.append(" WHERE orderDetails.orderId= "+id.toString());
                //use HQL call Query
                Query query = session.createQuery(sql.toString());
                //use SQL Native call Query
                //Query query = this.getSession().createSQLQuery(sql.toString());
                result = query.list();
                transaction.commit();
            } catch (HibernateException e) {
                transaction.rollback();
                throw e;
            } finally {
                session.close();
            }
        } catch (HibernateException e) {
            throw e;
        }
        return result;
    }
}
