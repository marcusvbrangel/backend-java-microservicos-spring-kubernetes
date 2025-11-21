package com.ecommerce.shopapi.repository;

import com.ecommerce.shopapi.dto.ShopReportDTO;
import com.ecommerce.shopapi.model.Shop;

import java.util.Date;
import java.util.List;

public interface ReportRepository {

    public List<Shop> getShopByFilters(Date dataInicio, Date dataFim, Float valorMinimo);

    public ShopReportDTO getReportByDate(Date dataInicio, Date dataFim);

}
