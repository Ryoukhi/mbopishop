package com.xp.mbopishop.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class UserResponseDTO {

    private Long id;
    private String fullName;
    private String email;
    private String role;
}
