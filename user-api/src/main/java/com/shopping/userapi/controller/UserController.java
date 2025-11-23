package com.shopping.userapi.controller;

import com.shopping.client.dto.UserDTO;
import com.shopping.userapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers() {
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/users")
    public UserDTO newUser(@RequestBody UserDTO userDTO) {
        userDTO.setDataCadastro(new Date());
        return userService.save(userDTO);
    }

    @GetMapping("/users/cpf/{cpf}")
    public UserDTO findByCpf(@PathVariable String cpf,
                             @RequestParam(name = "key", required = true) String key) {

        return userService.findByCpfAndKey(cpf, key);
    }

    @DeleteMapping("/users/{id}")
    public UserDTO delete(@PathVariable Long id) {
        return userService.delete(id);
    }

    @GetMapping("/users/search")
    public List<UserDTO> queryByName(@RequestParam(name = "nome", required = true) String nome) {
        return userService.queryByNameLike(nome);
    }

}
