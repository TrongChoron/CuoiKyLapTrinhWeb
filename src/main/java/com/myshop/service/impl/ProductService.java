/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;

import com.myshop.dao.ProductDao;
import com.myshop.dao.impl.ProductDaoImpl;
import com.myshop.model.ProductModel;
import com.myshop.paging.Pageble;
import com.myshop.service.IProductService;
import java.util.List;
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

    @Override
    public void save(ProductModel productModel) {
        productDAO.save(productModel);
    }

    @Override
    public void update(ProductModel productModel) {
        productDAO.update(productModel);
    }

    @Override
    public ProductModel findByID(Integer productId) {
        ProductModel productModel = productDAO.findById(productId);
        return productModel;
    }

    @Override
    public Integer delete(List<Integer> ids) {
        return productDAO.delete(ids);
    }

    @Override
    public List<ProductModel> findAll() {
        return productDAO.findAll();
    }

    @Override
    public List<ProductModel> findAllPaging(Pageble pageble) {
        return productDAO.findAllPaging(pageble);
    }

    @Override
    public Integer getTotalItem() {
        return productDAO.findAll().size();
    }
}
