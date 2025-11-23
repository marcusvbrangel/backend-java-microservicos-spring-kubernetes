package com.shopping.productapi.converter;

import com.shopping.productapi.model.Category;
import com.shopping.productapi.model.Product;
import com.shopping.client.dto.CategoryDTO;
import com.shopping.client.dto.ProductDTO;

public class DTOConverter {

    public static CategoryDTO convert(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setNome(category.getNome());
        return categoryDTO;
    }

    public static ProductDTO convert(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductIdentifier(product.getProductIdentifier());
        productDTO.setNome(product.getNome());
        productDTO.setDescricao(product.getDescricao());
        productDTO.setPreco(product.getPreco());
        if (product.getCategory() != null) {
            productDTO.setCategoryDTO(DTOConverter.convert(product.getCategory()));
        }
        return productDTO;
    }

}
