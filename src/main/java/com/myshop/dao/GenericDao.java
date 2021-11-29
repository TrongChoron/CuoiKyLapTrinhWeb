/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.dao;

import com.myshop.paging.Pageble;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author asus
 */
public interface GenericDao<ID extends Serializable, T> {
    List<T> findAll();
    T update(T entity);
    void save(T entity);
    T findById(ID id);
    Object[] findByProperty(String property, Object value,String sortExpression, String sortDirection);
    Integer delete(List<ID> ids);
    public List<T> findAllPaging(Pageble pageble);
}
