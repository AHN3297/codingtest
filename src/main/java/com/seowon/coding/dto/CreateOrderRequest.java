package com.seowon.coding.dto;

import lombok Getter;
import lombok NoArgsConstructor;
import lombok AllArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductRequest {
    private String customerName;
    private String customerEmail;
    private list<OrderProductDto> products;
}

@Getter
@NoArgsConstructor
@AllArgsConstructor
public static class OrderProductDto {
    private Long productId;
    private Integer quantity;
}