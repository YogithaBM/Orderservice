package com.thinkworks.orderservice.dto;

import java.time.LocalDateTime;

public class Order extends Base{
    private int orderId;
    private String name;
    private double price;
    private LocalDateTime time;

    public Order(int orderId, String name, double price, LocalDateTime time) {
        this.orderId = orderId;
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public void orderedAt() {
        System.out.println("Ordered at time : "+time.toString());
    }

    @Override
    public void orderedBy() {
        System.out.println("Ordered By : "+name);

    }
}
