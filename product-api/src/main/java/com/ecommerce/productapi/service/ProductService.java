package com.ecommerce.productapi.service;

import com.ecommerce.productapi.dto.ProductDTO;
import com.ecommerce.productapi.model.Product;
import com.ecommerce.productapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getAll() {

        List<Product> products = productRepository.findAll();

        return products
                .stream()
                .map(ProductDTO::convert)
                .toList();
    }

    public List<ProductDTO> getProductByCategoryId(Long categoryId) {

        List<Product> products = productRepository.getProductByCategory(categoryId);

        return products
                .stream()
                .map(ProductDTO::convert)
                .toList();
    }

    public ProductDTO findByProductIdentifier(String productIdentifier) {

        Product product = productRepository.findByProductIdentifier(productIdentifier);

        if (product != null) {
            return ProductDTO.convert(product);
        }

        return null;
    }

    public ProductDTO save(ProductDTO productDTO) {

        Product product = productRepository.save(Product.convert(productDTO));

        return ProductDTO.convert(product);

    }

    public void delete(Long productId) {

        Optional<Product> product = productRepository.findById(productId);

        if (product.isPresent()) {
            productRepository.deleteById(productId);
        }

    }



















}
