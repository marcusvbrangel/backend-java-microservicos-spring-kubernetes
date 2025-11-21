package com.ecommerce.shopapi.service;

import com.ecommerce.shopclient.dto.UserDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Value("${service.user-api.url}")
    private String serviceUseApiUrl;

    public UserDTO getUserByCpf(String cpf) {

        RestTemplate restTemplate = new RestTemplate();

        String url = serviceUseApiUrl + "/users/cpf/" + cpf;

        ResponseEntity<UserDTO> responseEntity = restTemplate.getForEntity(url, UserDTO.class);

        return responseEntity.getBody();

    }

}
