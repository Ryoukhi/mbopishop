package com.xp.mbopishop.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.xp.mbopishop.dto.OrderResponseDTO;
import com.xp.mbopishop.entity.Order;
import com.xp.mbopishop.entity.OrderItem;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(source = "id", target = "orderId")
    @Mapping(source = "status", target = "status")
    OrderResponseDTO toDto(Order order);

    List<OrderItemResponseDTO> toItemDtos(List<OrderItem> items);

    @Mapping(source = "product.name", target = "productName")
    OrderItemResponseDTO toItemDto(OrderItem item);
}
