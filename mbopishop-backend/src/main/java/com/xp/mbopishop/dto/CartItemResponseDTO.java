package com.xp.mbopishop.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CartItemResponseDTO {

    private Long productId;
    private String productName;
    private double price;
    private int quantity;
}
