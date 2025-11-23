package com.shopping.productapi.controller;

import com.shopping.productapi.service.ProductService;
import com.shopping.client.dto.ProductDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<ProductDTO> getProducts() {
        return productService.getAll();
    }

    @GetMapping("/products/category/{categoryId}")
    public List<ProductDTO> getProductByCategory(@PathVariable Long categoryId) {
        return productService.getProductByCategoryId(categoryId);
    }

    @GetMapping("/products/{productIdentifier}")
    public ProductDTO findByIdentifier(@PathVariable String productIdentifier) {
        return productService.findByProductIdentifier(productIdentifier);
    }

    @PostMapping("/products")
    ProductDTO newProduct(@Valid @RequestBody ProductDTO productDTO) {
        return productService.save(productDTO);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }

}
