package com.example.productorderservice.payment;

public class ConsolePaymentGateway implements PaymentGateway {

    @Override
    public void excute(final int totalPrice, final String cardNumber) {
        System.out.println("결재 완료");
    }
}
