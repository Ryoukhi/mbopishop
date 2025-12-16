package com.xp.mbopishop.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class RegisterRequestDTO {

    private String fullName;
    private String email;
    private String password;
}