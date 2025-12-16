package com.xp.mbopishop.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.xp.mbopishop.dto.CartItemResponseDTO;
import com.xp.mbopishop.dto.CartResponseDTO;
import com.xp.mbopishop.entity.Cart;
import com.xp.mbopishop.entity.CartItem;

@Mapper(componentModel = "spring")
public interface CartMapper {

    @Mapping(target = "totalAmount", expression = "java(calculateTotal(cart))")
    CartResponseDTO toDto(Cart cart);

    List<CartItemResponseDTO> toItemDtos(List<CartItem> items);

    @Mapping(source = "product.id", target = "productId")
    @Mapping(source = "product.name", target = "productName")
    @Mapping(source = "product.price", target = "price")
    CartItemResponseDTO toItemDto(CartItem item);

    default double calculateTotal(Cart cart) {
        return cart.getItems()
                .stream()
                .mapToDouble(i -> i.getProduct().getPrice() * i.getQuantity())
                .sum();
    }
}
