package com.example.productorderservice.order;

import com.example.productorderservice.product.Product;

public interface OrderPort {
    Product getProductById(Long productId);
    void save(Order order);
}
