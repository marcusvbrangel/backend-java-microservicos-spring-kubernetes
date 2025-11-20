package com.ecommerce.shopapi.service;

import com.ecommerce.shopapi.dto.ShopDTO;
import com.ecommerce.shopapi.model.Shop;
import com.ecommerce.shopapi.repository.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ShopService {

    private final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public List<ShopDTO> getAll() {

        List<Shop> shops = shopRepository.findAll();

        return shops
                .stream()
                .map(ShopDTO::convert)
                .toList();
    }

    public List<ShopDTO> getByUser(String userIdentifier) {

        List<Shop> shops = shopRepository.findAllByUserIdentifier(userIdentifier);

        return shops
                .stream()
                .map(ShopDTO::convert)
                .toList();
    }

    public List<ShopDTO> getByDate(ShopDTO shopDTO) {

        List<Shop> shops = shopRepository.findAllByDateGreaterThanEquals(shopDTO.getDate());

        return shops
                .stream()
                .map(ShopDTO::convert)
                .toList();
    }

    public ShopDTO findById(long productId) {

        Optional<Shop> shop = shopRepository.findById(productId);

        if (shop.isPresent()) {
            return ShopDTO.convert(shop.get());
        }

        return null;

    }

    public ShopDTO save(ShopDTO shopDTO) {

        shopDTO.setTotal(shopDTO.getItems()
                .stream()
                .map(item -> item.getPrice())
                .reduce((float) 0, Float::sum));

        Shop shop = Shop.convert(shopDTO);
        shop.setDate(new Date());

        shop = shopRepository.save(shop);
        return ShopDTO.convert(shop);

    }

}
