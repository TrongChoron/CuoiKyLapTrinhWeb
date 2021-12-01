/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.dao;

import com.myshop.model.ProductModel;
import java.util.List;

/**
 *
 * @author asus
 */
public interface ProductDao extends GenericDao<Integer, ProductModel>{
    public List<ProductModel> findByManufacture(Integer manufactId);
}
