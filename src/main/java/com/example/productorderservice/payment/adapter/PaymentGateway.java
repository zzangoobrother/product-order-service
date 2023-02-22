package com.example.productorderservice.payment.adapter;

public interface PaymentGateway {
    void excute(int totalPrice, String cardNumber);
}
