package com.shopping.userapi.service;

import com.shopping.client.dto.UserDTO;
import com.shopping.client.exception.UserNotFoundException;
import com.shopping.userapi.converter.DTOConverter;
import com.shopping.userapi.model.User;
import com.shopping.userapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

        userDTO.setKey(UUID.randomUUID().toString());

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

    public UserDTO findByCpfAndKey(String cpf, String key) {

        Optional<User> user = userRepository.findByCpfAndKey(cpf, key);

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
