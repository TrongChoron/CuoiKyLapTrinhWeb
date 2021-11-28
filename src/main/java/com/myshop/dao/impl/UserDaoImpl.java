/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.dao.impl;

import com.myshop.dao.UserDao;
import com.myshop.model.UsersModel;
import com.myshop.utils.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author asus
 */
public class UserDaoImpl  extends AbstractDao<Integer, UsersModel> implements UserDao{
     @Override
    public UsersModel findUserByUsernameAndPassword(String userName, String password) {
        UsersModel entity = new UsersModel();
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            try {
                StringBuilder sql = new StringBuilder("FROM UsersModel WHERE userName= :userName AND password= :password ");
                Query query = session.createQuery(sql.toString());
                query.setParameter("userName", userName);
                query.setParameter("password", password);
                entity = (UsersModel) query.uniqueResult();
                transaction.commit();
            } catch (HibernateException e) {
                transaction.rollback();
                throw e;
            } finally {
                session.close();
            }
        } catch (HibernateException ex) {
            System.out.println(ex.getMessage());
        }
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        return entity;
    }

    @Override
    public List<UsersModel> findAllPaging(Integer offset, Integer limit) {
        List<UsersModel> list = new ArrayList<UsersModel>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            //HQL
            StringBuilder sql = new StringBuilder("from ");
            sql.append(this.getPersistenceClassName());
            //use HQL call Query
            Query query = session.createQuery(sql.toString());
            query.setFirstResult(offset);
            query.setMaxResults(limit);
            //use SQL Native call Query
            //Query query = this.getSession().createSQLQuery(sql.toString());
            list = query.list();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return list;
    }
}
