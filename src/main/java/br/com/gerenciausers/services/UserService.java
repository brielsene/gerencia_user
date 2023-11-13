package br.com.gerenciausers.services;

import br.com.gerenciausers.dtos.EditaUserDto;
import br.com.gerenciausers.dtos.RequestUserDto;
import br.com.gerenciausers.dtos.ResponseUserDto;
import br.com.gerenciausers.models.User;
import br.com.gerenciausers.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void cadastrarUsuario(RequestUserDto requestUserDto){
        User user = new User();
        user.setName(requestUserDto.name());
        user.setPassword(requestUserDto.password());
        user.setEmail(requestUserDto.email());
        user.setDataDeCriacao(LocalDate.now());
        userRepository.save(user);

    }

    public List<ResponseUserDto> listaUsuarios(){
        return userRepository.findAll().stream().map(ResponseUserDto::new).toList();

    }

    public ResponseUserDto listaUsuarioPeloId(Long id){
        User user = userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Usuário com este ID não existe"));
        ResponseUserDto responseUserDto = new ResponseUserDto(user);
        return responseUserDto;
    }

    public void editaUsuarioPeloId(Long id, EditaUserDto editaUserDto){
        User user = userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Usuário com este ID não existe"));
        if(!(editaUserDto.name().isBlank())){
            user.setName(editaUserDto.name());
        }
        if(!(editaUserDto.password().isBlank())){
            user.setPassword(editaUserDto.password());
        }

        if(!(editaUserDto.email().isBlank())){
            user.setEmail(editaUserDto.email());
        }
        userRepository.save(user);
    }

    public void deletaUserPorId(Long id){
        userRepository.deleteById(id);
    }
}
