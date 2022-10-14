package com.ilze.ecommerce.service;

import com.ilze.ecommerce.dto.Purchase;
import com.ilze.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
