/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.service;

import com.myshop.model.ManufacterModel;
import java.util.List;

/**
 *
 * @author asus
 */
public interface IManufacterService {
    public void save(ManufacterModel manufacterModel);
    public void update(ManufacterModel manufacterModel);
    ManufacterModel findByID(Integer manufacterId);
    public Integer delete(List<Integer> ids);
    public List<ManufacterModel> findAll();
}
