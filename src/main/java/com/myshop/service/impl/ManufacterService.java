/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service.impl;


import com.myshop.dao.ManufacterDao;
import com.myshop.dao.impl.ManufacterDaoImpl;
import com.myshop.service.IManufacterService;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
public class ManufacterService implements IManufacterService{
    
     @Inject
    ManufacterDao manufacterDAO;

    ManufacterService() {
        manufacterDAO = new ManufacterDaoImpl();
    }
    
}
