package com.restaurant.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private Double gst;
    private Double deliveryCharge;
    private Double totalAmount;

    private String customerEmail;

    public Order() {
    }

    public Order(Double amount, Double gst, Double deliveryCharge, Double totalAmount, String customerEmail) {
        this.amount = amount;
        this.gst = gst;
        this.deliveryCharge = deliveryCharge;
        this.totalAmount = totalAmount;
        this.customerEmail = customerEmail;
    }

    public Long getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getGst() {
        return gst;
    }

    public Double getDeliveryCharge() {
        return deliveryCharge;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setGst(Double gst) {
        this.gst = gst;
    }

    public void setDeliveryCharge(Double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
