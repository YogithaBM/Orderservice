package com.thinkworks.orderservice.service;

import com.thinkworks.orderservice.dto.PaymentType;

public class Cash implements PaymentType {
    @Override
    public void pay() {
        System.out.println("Payment through Cash");
    }
}
