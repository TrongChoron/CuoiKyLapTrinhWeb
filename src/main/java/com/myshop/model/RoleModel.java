/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "roles")
public class RoleModel extends AbstractModel<RoleModel>{
    @Id
    @Column(name = "role_id",nullable=false)
    private Integer roleId;
    
    @Column(name = "role_name")
    private String roleName;

    @OneToMany(mappedBy = "roleModel",fetch = FetchType.LAZY)
    private List<UsersModel> userModelList;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public List<UsersModel> getUserModelList() {
        return userModelList;
    }

    public void setUserModelList(List<UsersModel> userModelList) {
        this.userModelList = userModelList;
    }

    
    
}
