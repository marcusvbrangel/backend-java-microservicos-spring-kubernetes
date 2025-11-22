package com.ecommerce.shopapi.service;

import com.ecommerce.shopapi.converter.DTOConverter;
import com.ecommerce.shopapi.model.Shop;
import com.ecommerce.shopapi.repository.ReportRepositoryImpl;
import com.ecommerce.shopapi.repository.ShopRepository;
import com.ecommerce.shopclient.dto.ItemDTO;
import com.ecommerce.shopclient.dto.ProductDTO;
import com.ecommerce.shopclient.dto.ShopDTO;
import com.ecommerce.shopclient.dto.ShopReportDTO;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ShopService {

    private final ShopRepository shopRepository;
    private final ReportRepositoryImpl reportRepository;
    private final UserService userService;
    private final ProductService productService;

    public ShopService(ShopRepository shopRepository, ReportRepositoryImpl reportRepository, UserService userService, ProductService productService) {
        this.shopRepository = shopRepository;
        this.reportRepository = reportRepository;
        this.userService = userService;
        this.productService = productService;
    }

    public List<ShopDTO> getAll() {

        List<Shop> shops = shopRepository.findAll();

        return shops
                .stream()
                .map(DTOConverter::convert)
                .toList();
    }

    public List<ShopDTO> getByUser(String userIdentifier) {

        List<Shop> shops = shopRepository.findAllByUserIdentifier(userIdentifier);

        return shops
                .stream()
                .map(DTOConverter::convert)
                .toList();
    }

    public List<ShopDTO> getByDate(ShopDTO shopDTO) {

        List<Shop> shops = shopRepository.findAllByDateGreaterThanEqual(shopDTO.getDate());

        return shops
                .stream()
                .map(DTOConverter::convert)
                .toList();
    }

    public ShopDTO findById(long productId) {

        Optional<Shop> shop = shopRepository.findById(productId);

        if (shop.isPresent()) {
            return DTOConverter.convert(shop.get());
        }

        return null;

    }

    public ShopDTO save(ShopDTO shopDTO, String key) {

        if (userService.getUserByCpf(shopDTO.getUserIdentifier(), key) == null) {
            return null;
        }

        if (!validarProducts(shopDTO.getItems())) {
            return null;
        }

        shopDTO.setTotal(shopDTO.getItems()
                .stream()
                .map(item -> item.getPrice())
                .reduce((float) 0, Float::sum));

        Shop shop = Shop.convert(shopDTO);
        shop.setDate(new Date());

        shop = shopRepository.save(shop);

        return DTOConverter.convert(shop);

    }

    public List<ShopDTO> getShopByFilter(Date dataInicio, Date dataFim, Float valorMinimo) {

        List<Shop> shops = reportRepository.getShopByFilters(dataInicio, dataFim, valorMinimo);

        return shops
                .stream()
                .map(DTOConverter::convert)
                .toList();

    }

    public ShopReportDTO getReportByDate(Date dataInicio, Date dataFim) {
        return reportRepository.getReportByDate(dataInicio, dataFim);
    }

    private boolean validarProducts(List<ItemDTO> items) {

        for (ItemDTO item : items) {

            ProductDTO productDTO = productService.getProductByIdentifier(item.getProductIdentifier());

            if (productDTO == null) {

                return false;

            }

            item.setPrice(productDTO.getPreco());

        }

        return true;

    }

}
