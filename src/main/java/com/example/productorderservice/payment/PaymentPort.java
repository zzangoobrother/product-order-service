package com.example.productorderservice.payment;

import com.example.productorderservice.order.Order;

public interface PaymentPort {

    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}
