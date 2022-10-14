package com.ilze.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    //Lombok @Data will generate constructor for final fields
    //another option is using @NonNull annotation on the field instead of final
    private final String oderTrackingNumber;
}
