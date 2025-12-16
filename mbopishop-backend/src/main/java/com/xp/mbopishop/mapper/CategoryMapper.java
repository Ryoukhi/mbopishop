package com.xp.mbopishop.mapper;

import java.util.Locale.Category;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.xp.mbopishop.dto.CategoryRequestDTO;
import com.xp.mbopishop.dto.CategoryResponseDTO;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryResponseDTO toDto(Category category);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "products", ignore = true)
    Category toEntity(CategoryRequestDTO dto);
}
