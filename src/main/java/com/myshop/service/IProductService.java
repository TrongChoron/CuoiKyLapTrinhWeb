/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service;

import com.myshop.model.ProductModel;
import com.myshop.paging.Pageble;
import java.util.List;

/**
 *
 * @author asus
 */
public interface IProductService {
    public void save(ProductModel productModel);
    public void update(ProductModel productModel);
    ProductModel findByID(Integer productId);
    public Integer delete(List<Integer> ids);
    public List<ProductModel> findAllPaging(Pageble pageble);
    public List<ProductModel> findAll();
    public Integer getTotalItem();
}
