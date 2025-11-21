package com.ecommerce.productapi.model;

import com.ecommerce.shopclient.dto.CategoryDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;

    public static Category convert(CategoryDTO categoryDTO) {
        Category category = new Category();
        category.setNome(categoryDTO.getNome());
        return category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
