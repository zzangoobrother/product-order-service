package com.example.productorderservice.product;

import com.example.productorderservice.product.domain.DiscountPolicy;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DiscountPolicyTest {

    @Test
    void noneDiscountPolicy() {
        final int price = 1000;
        final int discountePrice = DiscountPolicy.NONE.applyDiscount(price);

        assertThat(discountePrice).isEqualTo(price);
    }

    @Test
    void fixDiscountPolicy() {
        final int price = 2000;
        final int discountePrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);

        assertThat(discountePrice).isEqualTo(1000);
    }

    @Test
    void overDiscountPolicy() {
        final int price = 500;
        final int discountePrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);

        assertThat(discountePrice).isEqualTo(0);
    }
}
