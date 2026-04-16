package com.thinkworks.orderservice.service;

import com.thinkworks.orderservice.dto.PaymentType;

public class UPI implements PaymentType {
    @Override
    public void pay() {
        System.out.println("Payment through UPI");
    }
}
