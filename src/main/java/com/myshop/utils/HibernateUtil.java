/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.utils;

import com.myshop.model.*;
import java.util.Properties;
import org.hibernate.*;
import org.hibernate.boot.registry.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author asus
 */
public class HibernateUtil {
    //    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory sessionFactory;

//    private static SessionFactory buildSessionFactory() {
//        try {
//            //Create sessionfactory from hibernate.cfg.xml
//            return new Configuration().configure().buildSessionFactory();
//        } catch (HibernateException ex) {
//            // Make sure you log the exception, as it might be swallowed
//            System.err.println("Initial SessionFactory creation failed." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
    private static StandardServiceRegistry registry;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
//                Configuration configuration = new Configuration().configure();
//                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
//                        applySettings(configuration.getProperties());
//                sessionFactory = configuration.buildSessionFactory(builder.build());
                //sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
                Configuration configuration = new Configuration();

//                Properties settings = new Properties();
//                settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
//                settings.put(Environment.URL, "jdbc:mysql://us-cdbr-east-04.cleardb.com:3306/heroku_86b1bc4f73c649e?reconnect=true");
//                settings.put(Environment.USER, "b254f1006b2cfa");
//                settings.put(Environment.PASS, "bc3576c8");
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/sneaker_test?reconnect=true");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "0352484764zz@@");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                // settings.put(Environment.HBM2DDL_AUTO, "create-drop");
                configuration.setProperties(settings);
                configuration.addAnnotatedClass(UsersModel.class);
                configuration.addAnnotatedClass(RoleModel.class);
                configuration.addAnnotatedClass(CartItemsModel.class);
                configuration.addAnnotatedClass(DiscountModel.class);
                configuration.addAnnotatedClass(ManufacterModel.class);
                configuration.addAnnotatedClass(OrderDetailsModel.class);
                configuration.addAnnotatedClass(OrderItemsModel.class);
                configuration.addAnnotatedClass(PaymentDetailsModel.class);
                configuration.addAnnotatedClass(ProductModel.class);
                configuration.addAnnotatedClass(ShoppingSessionModel.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                System.out.println("Hibernate Java Config serviceRegistry created");
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
                return sessionFactory;
            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }
    //To shut down

    public static void shutdown() {
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
