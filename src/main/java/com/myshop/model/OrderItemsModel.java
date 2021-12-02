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
public class OrderItemsModel extends AbstractModel<OrderItemsModel>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderitem_id", nullable = false)
    private Integer orderitemId;

    @ManyToOne
    @JoinColumn(name = "order_id",nullable = false)
    private OrderDetailsModel orderDetails;

    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private ProductModel product;
    
    @Column(name = "quantity",nullable = false)
    private Integer quantity;

    public Integer getOrderitemId() {
        return orderitemId;
    }

    public void setOrderitemId(Integer orderitemId) {
        this.orderitemId = orderitemId;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    

}
