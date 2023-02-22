package com.example.productorderservice.payment;

public interface PaymentGateway {
    void excute(int totalPrice, String cardNumber);
}
