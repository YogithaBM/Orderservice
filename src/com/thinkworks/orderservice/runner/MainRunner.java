package com.thinkworks.orderservice.runner;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.thinkworks.orderservice.dto.Order;
import com.thinkworks.orderservice.dto.PaymentType;
import com.thinkworks.orderservice.service.Cash;
import com.thinkworks.orderservice.service.PaymentService;

import java.time.LocalDateTime;

public class MainRunner {
    public static void main(String[] args) {
        PaymentType paymentType=new Cash();
        PaymentService paymentService=new PaymentService(paymentType);
        Order order1=new Order(254,"Maki",10.89, LocalDateTime.now());
        paymentService.orderDetails(order1);
        Order order2=new Order(763,"Yuki",7356.48D,LocalDateTime.now());
        Order order3=new Order(635,"Maddy",234.764D,LocalDateTime.now());
        Order order4=new Order(3265,"Suzzi",735.873D,LocalDateTime.now());

        Order[] orders={order1,order2,order3,order4};
        paymentService.orderDetails(orders);
    }

}

