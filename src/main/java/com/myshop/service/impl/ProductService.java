/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.ProductDao;
import com.myshop.dao.impl.ProductDaoImpl;
import com.myshop.service.IProductService;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class ProductService implements IProductService{
    
    @Inject
    private ProductDao productDAO;

    public ProductService() {
        productDAO = new ProductDaoImpl();
    }
}
