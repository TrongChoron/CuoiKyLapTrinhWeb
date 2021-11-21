/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.utils.beanutils;

import com.myshop.dto.UserDTO;
import com.myshop.model.UsersModel;

/**
 *
 * @author asus
 */
public class UserBeanUtil {
    public static UserDTO entity2Dto(UsersModel entity){
        UserDTO dto = new UserDTO();
        dto.setUserId(entity.getUserId());
        dto.setUserName(entity.getUserName());
        dto.setPassword(entity.getPassword());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setAddress(entity.getAddress());
        dto.setPhone(entity.getPhone());
        dto.setCreateAt(entity.getCreateAt());
        dto.setModifiedAt(entity.getModifiedAt());
        dto.setRoleDTO(RoleBeanUtil.entity2Dto(entity.getRoleModel()));
        return dto;
    }
    
    public static UsersModel  dto2Entity(UserDTO dto){
        UsersModel entity = new UsersModel();
        entity.setUserId(dto.getUserId());
        entity.setUserName(dto.getUserName());
        entity.setPassword(dto.getPassword());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setAddress(dto.getAddress());
        entity.setPhone(dto.getPhone());
        entity.setCreateAt(dto.getCreateAt());
        entity.setModifiedAt(dto.getModifiedAt());
        entity.setRoleModel(RoleBeanUtil.Dto2entity(dto.getRoleDTO()));
        return entity;
    }
}
