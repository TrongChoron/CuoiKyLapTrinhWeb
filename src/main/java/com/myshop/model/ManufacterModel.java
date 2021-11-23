/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "manufacter")
public class ManufacterModel extends AbstractModel<ManufacterModel>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manufact_id",nullable = false)
    private Integer manufactId;
    
    @Column(name = "manufacter_name",nullable = false)
    private String manufactName;
    
    @OneToMany(mappedBy = "manufact",fetch = FetchType.LAZY)
    private List<ProductModel> productList;

    public Integer getManufactId() {
        return manufactId;
    }

    public void setManufactId(Integer manufactId) {
        this.manufactId = manufactId;
    }

    public String getManufactName() {
        return manufactName;
    }

    public void setManufactName(String manufactName) {
        this.manufactName = manufactName;
    }

    public List<ProductModel> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductModel> productList) {
        this.productList = productList;
    }

    
    
}
