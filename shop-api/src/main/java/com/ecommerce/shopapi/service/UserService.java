package com.ecommerce.shopapi.service;

import com.ecommerce.shopclient.dto.UserDTO;
import com.ecommerce.shopclient.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UserService {

    @Value("${service.user-api.url}")
    private String serviceUseApiUrl;

    public UserDTO getUserByCpf(String cpf, String key) {

        try {

            RestTemplate restTemplate = new RestTemplate();

            UriComponentsBuilder uriBuilder = UriComponentsBuilder
                    .fromHttpUrl(serviceUseApiUrl + "/users/cpf/" + cpf);

            uriBuilder.queryParam("key", key);

            ResponseEntity<UserDTO> responseEntity = restTemplate.getForEntity(uriBuilder.toUriString(), UserDTO.class);

            return responseEntity.getBody();

        } catch (HttpClientErrorException.NotFound notFound) {

            throw new UserNotFoundException();

        }

    }

}
