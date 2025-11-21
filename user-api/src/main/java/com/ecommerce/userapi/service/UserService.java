package com.ecommerce.userapi.service;

import com.ecommerce.shopclient.dto.UserDTO;
import com.ecommerce.shopclient.exception.UserNotFoundException;
import com.ecommerce.userapi.converter.DTOConverter;
import com.ecommerce.userapi.model.User;
import com.ecommerce.userapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> getAll() {

        return userRepository.findAll()
                .stream()
                .map(DTOConverter::convert)
                .toList();

    }

    public UserDTO findById(Long id) {
        return DTOConverter.convert(userRepository.findById(id).orElse(null));
    }

    public UserDTO save(UserDTO userDTO) {

        User user = userRepository.save(User.convert(userDTO));
        return DTOConverter.convert(user);

    }

    public UserDTO delete(Long id) {

        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()) {
            userRepository.deleteById(id);
            return DTOConverter.convert(user.get());
        }

        return null;

    }

    public UserDTO findByCpf(String cpf) {

        Optional<User> user = userRepository.findByCpf(cpf);

        if (user.isPresent()) {
            return DTOConverter.convert(user.get());
        }

        throw new UserNotFoundException();

    }

    public List<UserDTO> queryByNameLike(String name) {

        return userRepository.queryByNomeLike(name)
                .stream()
                .map(DTOConverter::convert)
                .toList();

    }

}
