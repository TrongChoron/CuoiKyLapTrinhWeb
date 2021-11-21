/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.model;

import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "cart_item")
public class CartItemsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id", nullable = false)
    private Integer cartId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "create_at", nullable = false)
    private Timestamp createAt;

    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private ProductModel product;

    @ManyToOne
    @JoinColumn(name = "sesscion_id",nullable = false)
    private ShoppingSessionModel shoppingSession;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public ShoppingSessionModel getShoppingSession() {
        return shoppingSession;
    }

    public void setShoppingSession(ShoppingSessionModel shoppingSession) {
        this.shoppingSession = shoppingSession;
    }

    

}
