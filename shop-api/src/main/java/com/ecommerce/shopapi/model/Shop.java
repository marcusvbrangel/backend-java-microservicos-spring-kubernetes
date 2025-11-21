package com.ecommerce.shopapi.model;

import com.ecommerce.shopclient.dto.ShopDTO;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "shop", schema = "shops")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userIdentifier;
    private float total;
    private Date date;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "item", schema = "shops", joinColumns = @JoinColumn(name = "shop_id"))
    private List<Item> items;

    public static Shop convert(ShopDTO shopDTO) {
        Shop shop = new Shop();
        shop.setUserIdentifier(shopDTO.getUserIdentifier());
        shop.setTotal(shopDTO.getTotal());
        shop.setDate(shopDTO.getDate());
        shop.setItems(shopDTO.getItems()
                .stream()
                .map(Item::convert)
                .toList());
        return shop;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserIdentifier() {
        return userIdentifier;
    }

    public void setUserIdentifier(String userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(id, shop.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", userIdentifier='" + userIdentifier + '\'' +
                '}';
    }
}

