/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;


import com.myshop.dao.ManufacterDao;
import com.myshop.dao.impl.ManufacterDaoImpl;
import com.myshop.model.ManufacterModel;
import com.myshop.service.IManufacterService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class ManufacterService implements IManufacterService{
    
     @Inject
    ManufacterDao manufacterDAO;

    public ManufacterService() {
        manufacterDAO = new ManufacterDaoImpl();
    }

    @Override
    public void save(ManufacterModel manufacterModel) {
        manufacterDAO.save(manufacterModel);
    }

    @Override
    public void update(ManufacterModel manufacterModel) {
       manufacterDAO.update(manufacterModel);
    }

    @Override
    public ManufacterModel findByID(Integer manufacterId) {
        ManufacterModel model = manufacterDAO.findById(manufacterId);
        return model;
    }

    @Override
    public Integer delete(List<Integer> ids) {
        return manufacterDAO.delete(ids);
    }

    @Override
    public List<ManufacterModel> findAll() {
        return manufacterDAO.findAll();
    }
    
}
