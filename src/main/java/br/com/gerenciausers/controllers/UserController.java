package br.com.gerenciausers.controllers;

import br.com.gerenciausers.dtos.EditaUserDto;
import br.com.gerenciausers.dtos.RequestUserDto;
import br.com.gerenciausers.dtos.ResponseUserDto;
import br.com.gerenciausers.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity cadastrarUsuario(@RequestBody @Valid RequestUserDto requestUserDto){
        userService.cadastrarUsuario(requestUserDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<ResponseUserDto>>listaUsuarios(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.listaUsuarios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseUserDto>listaUserPorId(@PathVariable("id")Long id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.listaUsuarioPeloId(id));
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity editaUsuarioPeloId(@PathVariable("id") Long id, @RequestBody EditaUserDto editaUserDto){
        userService.editaUsuarioPeloId(id, editaUserDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteUserPorId(@PathVariable("id")Long id){
        userService.deletaUserPorId(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
