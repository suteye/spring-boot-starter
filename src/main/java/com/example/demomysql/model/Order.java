package com.example.demomysql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "`order`")
public class Order {
    private int id;
    private String OrderNumber;
    private String OrderDate;
    private String DeliveryDate;
    private String OrderStatus;
    private String CustomerID;
    private String ItemID;
    private Float Tax;
    private Float TotalPrice;
    private String PaymentMethod;

    public Order() {
    }

    public Order(int id, String OrderNumber, String OrderDate, String DeliveryDate, String OrderStatus, String CustomerID, String ItemID, float Tax, float TotalPrice, String PaymentMethod) {
        this.id = id;
        this.OrderNumber = OrderNumber;
        this.OrderDate = OrderDate;
        this.DeliveryDate = DeliveryDate;
        this.OrderStatus = OrderStatus;
        this.CustomerID = CustomerID;
        this.ItemID = ItemID;
        this.Tax = Tax;
        this.TotalPrice = TotalPrice;
        this.PaymentMethod = PaymentMethod;
    }

    // public Order(int id, String OrderNumber) {
    //     this.id = id;
    //     this.OrderNumber = OrderNumber;
    // }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(String DeliveryDate) {
        this.DeliveryDate = DeliveryDate;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }

    public Float getTax() {
        return Tax;
    }

    public void setTax(Float Tax) {
        this.Tax = Tax;
    }

    public Float getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Float TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }


}
