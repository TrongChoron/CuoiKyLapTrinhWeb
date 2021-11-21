/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetailsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    @Column(name = "total", nullable = false)
    private BigDecimal total;

    @Column(name = "create_at", nullable = false)
    private Timestamp createAt;

    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private UsersModel user;

    @ManyToOne
    @JoinColumn(name = "payment_id",nullable = false)
    private PaymentDetailsModel payment;

    @OneToMany(mappedBy = "orderDetails",fetch = FetchType.LAZY)
    private List<OrderItemsModel> orderItemsList;
    
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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

    public UsersModel getUser() {
        return user;
    }

    public void setUser(UsersModel user) {
        this.user = user;
    }

    public PaymentDetailsModel getPayment() {
        return payment;
    }

    public void setPayment(PaymentDetailsModel payment) {
        this.payment = payment;
    }

    public List<OrderItemsModel> getOrderItemsList() {
        return orderItemsList;
    }

    public void setOrderItemsList(List<OrderItemsModel> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }

    

}
