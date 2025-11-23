package com.shopping.shopapi.service;

import com.shopping.client.dto.ProductDTO;
import com.shopping.client.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    @Value("${service.product-api.url}")
    private String serviceProductApiUrl;

    public ProductDTO getProductByIdentifier(String productIdentifier) {

        try {

            RestTemplate restTemplate = new RestTemplate();

            String url = serviceProductApiUrl + "/products/" + productIdentifier;

            ResponseEntity<ProductDTO> responseEntity = restTemplate.getForEntity(url, ProductDTO.class);

            return responseEntity.getBody();

        } catch (HttpClientErrorException.NotFound notFound) {

            throw new ProductNotFoundException();

        }

    }

}
