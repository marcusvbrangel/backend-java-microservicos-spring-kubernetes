package com.ecommerce.shopapi.converter;

import com.ecommerce.shopapi.model.Item;
import com.ecommerce.shopapi.model.Shop;
import com.ecommerce.shopclient.dto.ItemDTO;
import com.ecommerce.shopclient.dto.ShopDTO;

public class DTOConverter {

    public static ItemDTO convert(Item item) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setProductIdentifier(
                item.getProductIdentifier());
        itemDTO.setPrice(item.getPrice());
        return itemDTO;
    }

    public static ShopDTO convert(Shop shop) {
        ShopDTO shopDTO = new ShopDTO();
        shopDTO.setUserIdentifier(shop.getUserIdentifier());
        shopDTO.setTotal(shop.getTotal());
        shopDTO.setDate(shop.getDate());
        shopDTO.setItems(shop
                .getItems()
                .stream()
                .map(DTOConverter::convert)
                .toList());
        return shopDTO;
    }
}
