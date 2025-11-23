package com.shopping.shopapi.repository;

import com.shopping.client.dto.ShopReportDTO;
import com.shopping.shopapi.model.Shop;

import java.util.Date;
import java.util.List;

public interface ReportRepository {

    public List<Shop> getShopByFilters(Date dataInicio, Date dataFim, Float valorMinimo);

    public ShopReportDTO getReportByDate(Date dataInicio, Date dataFim);

}
