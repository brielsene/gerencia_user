package br.com.gerenciausers.dtos;

public record EditaUserDto(
        String name,
        String password,
        String email
) {
}
