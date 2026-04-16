package com.thinkworks.orderservice.runner;

import com.thinkworks.orderservice.dto.Order;
import com.thinkworks.orderservice.dto.PaymentType;
import com.thinkworks.orderservice.service.Cash;
import com.thinkworks.orderservice.service.PaymentService;

import java.time.LocalDateTime;

public class MainRunner {
    public static void main(String[] args) {
        PaymentType paymentType=new Cash();
        PaymentService paymentService=new PaymentService(paymentType);
        Order order=new Order(254,"Maki",10.89, LocalDateTime.now());
        paymentService.orderDetails(order);

    }
}
