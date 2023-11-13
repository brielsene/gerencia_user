package br.com.gerenciausers.dtos;

import br.com.gerenciausers.models.User;

import java.time.LocalDate;

public record ResponseUserDto(
        Long id,

        String name,

        String email,

        LocalDate dataCriacao
) {
    public ResponseUserDto(User user){
        this(user.getId(), user.getName(), user.getEmail(), user.getDataDeCriacao());
    }
}
