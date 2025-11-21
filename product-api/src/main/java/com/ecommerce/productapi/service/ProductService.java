package com.ecommerce.productapi.service;

import com.ecommerce.productapi.converter.DTOConverter;
import com.ecommerce.productapi.model.Category;
import com.ecommerce.productapi.model.Product;
import com.ecommerce.productapi.repository.CategoryRepository;
import com.ecommerce.productapi.repository.ProductRepository;
import com.ecommerce.shopclient.dto.ProductDTO;
import com.ecommerce.shopclient.exception.CategoryNotFoundException;
import com.ecommerce.shopclient.exception.ProductNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<ProductDTO> getAll() {

        List<Product> products = productRepository.findAll();

        return products
                .stream()
                .map(DTOConverter::convert)
                .toList();
    }

    public List<ProductDTO> getProductByCategoryId(Long categoryId) {

        List<Product> products = productRepository.getProductByCategory(categoryId);

        return products
                .stream()
                .map(DTOConverter::convert)
                .toList();
    }

    public ProductDTO findByProductIdentifier(String productIdentifier) {

        Product product = productRepository.findByProductIdentifier(productIdentifier);

        if (product != null) {
            return DTOConverter.convert(product);
        }

        throw new ProductNotFoundException();
    }

    public ProductDTO save(ProductDTO productDTO) {

        Optional<Category> categoryProduct = categoryRepository.findById(productDTO.getCategoryDTO().getId());

        if (!categoryProduct.isPresent()) {
            throw new CategoryNotFoundException();
        }

        Product product = Product.convert(productDTO);

        product.setCategory(categoryProduct.get());

        Product savedProduct = productRepository.save(product);

        return DTOConverter.convert(savedProduct);
    }

    public void delete(Long productId) {

        Optional<Product> product = productRepository.findById(productId);

        if (product.isPresent()) {
            productRepository.deleteById(productId);
        }

        throw new ProductNotFoundException();

    }



















}
