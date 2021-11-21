/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.utils.beanutils;

import com.myshop.dto.RoleDTO;
import com.myshop.model.RoleModel;

/**
 *
 * @author asus
 */
public class RoleBeanUtil {
    public static RoleDTO entity2Dto(RoleModel entity){
        RoleDTO dto  = new RoleDTO();
        dto.setRoleId(entity.getRoleId());
        dto.setRoleName(entity.getRoleName());
        return dto;
    }
    
    public static RoleModel Dto2entity(RoleDTO dto){
        RoleModel entity  = new RoleModel();
        entity.setRoleId(dto.getRoleId());
        entity.setRoleName(dto.getRoleName());
        return entity;
    }
}
