package com.example.demo.model;

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
    private String OrderStatus;
    private String DeliveryDate;
    private String CustomerName;
    private String CustomerAddress;
    private String CustomerPhone;
    private String CustomerEmail;
    private String ItemId;
    private String ItemName;
    private Float ItemQuantity;
    private Float ItemUnitCost;
    private Float Tax;
    private Float TotalPrice;
    private String PaymentMethod;

    public Order() {
    }

    public Order(int id, String orderNumber, String orderDate, String orderStatus, String deliveryDate, String customerName, String customerAddress, String customerPhone, String customerEmail, String itemId, String itemName, Float itemQuantity, Float itemUnitCost, Float tax, Float totalPrice, String paymentMethod) {
        this.id = id;
        OrderNumber = orderNumber;
        OrderDate = orderDate;
        OrderStatus = orderStatus;
        DeliveryDate = deliveryDate;
        CustomerName = customerName;
        CustomerAddress = customerAddress;
        CustomerPhone = customerPhone;
        CustomerEmail = customerEmail;
        ItemId = itemId;
        ItemName = itemName;
        ItemQuantity = itemQuantity;
        ItemUnitCost = itemUnitCost;
        Tax = tax;
        TotalPrice = totalPrice;
        PaymentMethod = paymentMethod;
    }

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

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }

    public String getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        DeliveryDate = deliveryDate;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        CustomerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getItemId() {
        return ItemId;
    }

    public void setItemId(String itemId) {
        ItemId = itemId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public Float getItemQuantity() {
        return ItemQuantity;
    }

    public void setItemQuantity(Float itemQuantity) {
        ItemQuantity = itemQuantity;
    }

    public Float getItemUnitCost() {
        return ItemUnitCost;
    }

    public void setItemUnitCost(Float itemUnitCost) {
        ItemUnitCost = itemUnitCost;
    }

    public Float getTax() {
        return Tax;
    }

    public void setTax(Float tax) {
        Tax = tax;
    }

    public Float getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        TotalPrice = totalPrice;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }
}
