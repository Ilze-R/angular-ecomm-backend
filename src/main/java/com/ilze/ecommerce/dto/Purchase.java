package com.ilze.ecommerce.dto;

import com.ilze.ecommerce.entity.Address;
import com.ilze.ecommerce.entity.Customer;
import com.ilze.ecommerce.entity.Order;
import com.ilze.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
