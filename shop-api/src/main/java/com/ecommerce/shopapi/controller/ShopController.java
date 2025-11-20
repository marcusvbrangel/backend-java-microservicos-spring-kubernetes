package com.ecommerce.shopapi.controller;

import com.ecommerce.shopapi.dto.ShopDTO;
import com.ecommerce.shopapi.service.ShopService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/shops")
    public List<ShopDTO> getShops() {
        return shopService.getAll();
    }

    @GetMapping("/shops/user/{userIdentifier}")
    public List<ShopDTO> getShops(@PathVariable  String userIdentifier) {
        return shopService.getByUser(userIdentifier);
    }

    @GetMapping("/shops/date")
    public List<ShopDTO> getShops(@RequestBody ShopDTO shopDTO) {
        return shopService.getByDate(shopDTO);
    }

    @GetMapping("/shops/{id}")
    public ShopDTO findById(@PathVariable Long id) {
        return shopService.findById(id);
    }

    @GetMapping("/shops")
    public ShopDTO newShop(@Valid  @RequestBody ShopDTO shopDTO) {
        return shopService.save(shopDTO);
    }

}
