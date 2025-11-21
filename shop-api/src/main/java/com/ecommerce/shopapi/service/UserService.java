package com.ecommerce.shopapi.service;

import com.ecommerce.shopclient.dto.UserDTO;
import com.ecommerce.shopclient.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Value("${service.user-api.url}")
    private String serviceUseApiUrl;

    public UserDTO getUserByCpf(String cpf) {

        try {

            RestTemplate restTemplate = new RestTemplate();

            String url = serviceUseApiUrl + "/users/cpf/" + cpf;

            ResponseEntity<UserDTO> responseEntity = restTemplate.getForEntity(url, UserDTO.class);

            return responseEntity.getBody();

        } catch (HttpClientErrorException.NotFound notFound) {

            throw new UserNotFoundException();

        }

    }

}
