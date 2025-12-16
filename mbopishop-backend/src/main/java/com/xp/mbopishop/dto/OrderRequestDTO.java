package com.xp.mbopishop.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class OrderRequestDTO {

    private String deliveryAddress;
    private String paymentMethod;
}
