package com.ecommerce.shopapi.controller;

import com.ecommerce.shopclient.dto.ShopDTO;
import com.ecommerce.shopclient.dto.ShopReportDTO;
import com.ecommerce.shopapi.service.ShopService;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @PostMapping("/shops")
    public ShopDTO newShop(@Valid  @RequestBody ShopDTO shopDTO) {
        return shopService.save(shopDTO);
    }

    @GetMapping("/shops/search")
    public List<ShopDTO> getShopsByFilter(
        @RequestParam(name = "dataInicio", required = true)
        @DateTimeFormat(pattern = "dd/MM/yyyy") Date dataInicio,
        @RequestParam(name = "dataFim", required = false)
        @DateTimeFormat(pattern = "dd/MM/yyyy") Date dataFim,
        @RequestParam(name = "valorMinimo", required = false) Float valorMinimo) {

        return shopService.getShopByFilter(dataInicio, dataFim, valorMinimo);

    }

    @GetMapping("/shops/report")
    public ShopReportDTO getReportByDate(
            @RequestParam(name = "dataInicio", required = true)
            @DateTimeFormat(pattern = "dd/MM/yyyy") Date dataInicio,
            @RequestParam(name = "dataFim", required = true)
            @DateTimeFormat(pattern = "dd/MM/yyyy") Date dataFim) {

        return shopService.getReportByDate(dataInicio, dataFim);

    }

}
