package com.ecommerce.userapi.converter;

import com.ecommerce.shopclient.dto.UserDTO;
import com.ecommerce.userapi.model.User;

public class DTOConverter {

    public static UserDTO convert(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setNome(user.getNome());
        userDTO.setEndereco(user.getEndereco());
        userDTO.setCpf(user.getCpf());
        return userDTO;
    }

}
