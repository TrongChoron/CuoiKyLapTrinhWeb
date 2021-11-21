/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.model;

import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItemsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderitem_id", nullable = false)
    private Integer orderitemId;

    @Column(name = "create_at", nullable = false)
    private Timestamp createAt;

    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @ManyToOne
    @JoinColumn(name = "order_id",nullable = false)
    private OrderDetailsModel orderDetails;

    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private ProductModel product;

    public Integer getOrderitemId() {
        return orderitemId;
    }

    public void setOrderitemId(Integer orderitemId) {
        this.orderitemId = orderitemId;
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

    public OrderDetailsModel getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetailsModel orderDetails) {
        this.orderDetails = orderDetails;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    

}
