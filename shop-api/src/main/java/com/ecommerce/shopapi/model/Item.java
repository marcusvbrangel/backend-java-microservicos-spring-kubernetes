package com.ecommerce.shopapi.model;

import com.ecommerce.shopapi.dto.ItemDTO;
import jakarta.persistence.Embeddable;

@Embeddable
public class Item {

    private String productIdentifier;
    private float price;

    public static Item convert(ItemDTO itemDTO) {
        Item item = new Item();
        item.setProductIdentifier(itemDTO.getProductIdentifier());
        item.setPrice(itemDTO.getPrice());
        return item;
    }

    public String getProductIdentifier() {
        return productIdentifier;
    }

    public void setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productIdentifier='" + productIdentifier + '\'' +
                ", price=" + price +
                '}';
    }
}
