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
@Table(name = "shopping_session")
public class ShoppingSessionModel extends AbstractModel<ShoppingSessionModel>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id", nullable = false)
    private Integer sessionId;

    @Column(name = "total", nullable = false)
    private BigDecimal total;

    @Column(name = "create_at", nullable = false)
    private Timestamp createAt;

    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UsersModel userModel;

    @OneToMany(mappedBy = "shoppingSession", fetch = FetchType.LAZY)
    private List<CartItemsModel> CartItemsList;

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
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

    public UsersModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UsersModel userModel) {
        this.userModel = userModel;
    }

    public List<CartItemsModel> getCartItemsList() {
        return CartItemsList;
    }

    public void setCartItemsList(List<CartItemsModel> CartItemsList) {
        this.CartItemsList = CartItemsList;
    }

}
