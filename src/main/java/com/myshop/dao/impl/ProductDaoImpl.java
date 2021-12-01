/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.dao.impl;

import com.myshop.dao.ProductDao;
import com.myshop.model.ProductModel;
import com.myshop.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author asus
 */
public class ProductDaoImpl extends AbstractDao<Integer, ProductModel> implements ProductDao {

    @Override
    public List<ProductModel> findByManufacture(Integer manufactId) {
        List<ProductModel> result = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            //        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                //HQL
                StringBuilder sql = new StringBuilder("from ");
                sql.append(this.getPersistenceClassName());
                sql.append(" WHERE manufact.manufactId= "+manufactId.toString());
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
