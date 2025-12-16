package com.xp.mbopishop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.xp.mbopishop.dto.RegisterRequestDTO;
import com.xp.mbopishop.dto.UserResponseDTO;
import com.xp.mbopishop.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDTO toDto(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "role", constant = "CLIENT")
    @Mapping(target = "orders", ignore = true)
    User toEntity(RegisterRequestDTO dto);
}
