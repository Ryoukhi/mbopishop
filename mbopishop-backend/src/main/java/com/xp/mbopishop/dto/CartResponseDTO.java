package com.xp.mbopishop.dto;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CartResponseDTO {

    private Long cartId;
    private List<CartItemResponseDTO> items;
    private double totalAmount;
}
