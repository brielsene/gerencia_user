package br.com.gerenciausers.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RequestUserDto(
        @NotBlank
        String name,
        @NotBlank
        String password,

        @Email
        String email

) {
}
