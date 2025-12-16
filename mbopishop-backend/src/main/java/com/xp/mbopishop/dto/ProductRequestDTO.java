package com.xp.mbopishop.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor

public class ProductRequestDTO {

    private String name;
    private String description;
    private double price;
    private String size;
    private String color;
    private int stock;
    private Long categoryId;
}
