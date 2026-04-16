package com.thinkworks.orderservice.service;

import com.thinkworks.orderservice.dto.Order;
import com.thinkworks.orderservice.dto.PaymentType;

public class PaymentService {
    private final PaymentType paymentType;

    public PaymentService(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void orderDetails(Order order){
        System.out.println("ID : "+order.getOrderId());
        System.out.println("Name : "+order.getName());
        System.out.println("Price : "+order.getPrice());
        System.out.println("Time : "+order.getTime());
        paymentType.pay();

    }



}
