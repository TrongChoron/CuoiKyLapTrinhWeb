/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.model;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "product")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "name", nullable = false)
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "release_year")
    private String releaseYear;


    @Column(name = "image", nullable = false)
    private String image;

    @ManyToOne
    @JoinColumn(name = "discount_id",nullable = false)
    private DiscountModel discount;

    @ManyToOne
    @JoinColumn(name = "manufact_id",nullable = false)
    private ManufacterModel manufact;
    
    @OneToMany(mappedBy = "product",fetch = FetchType.LAZY)
    private List<CartItemsModel> cartItemsList;
    
    @OneToMany(mappedBy = "product",fetch = FetchType.LAZY)
    private List<OrderItemsModel> orderItemsList;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public DiscountModel getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountModel discount) {
        this.discount = discount;
    }

    public ManufacterModel getManufact() {
        return manufact;
    }

    public void setManufact(ManufacterModel manufact) {
        this.manufact = manufact;
    }

    public List<CartItemsModel> getCartItemsList() {
        return cartItemsList;
    }

    public void setCartItemsList(List<CartItemsModel> cartItemsList) {
        this.cartItemsList = cartItemsList;
    }

    public List<OrderItemsModel> getOrderItemsList() {
        return orderItemsList;
    }

    public void setOrderItemsList(List<OrderItemsModel> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }

    

    
}
