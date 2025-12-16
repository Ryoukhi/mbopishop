package com.xp.mbopishop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.xp.mbopishop.dto.ProductRequestDTO;
import com.xp.mbopishop.dto.ProductResponseDTO;
import com.xp.mbopishop.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "category.name", target = "categoryName")
    ProductResponseDTO toDto(Product product);

    @Mapping(source = "categoryId", target = "category.id")
    Product toEntity(ProductRequestDTO dto);
}
