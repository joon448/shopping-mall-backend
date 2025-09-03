package com.example.standard.product.dto;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class FilterDto {
    public List<CategoryCountDto> categories = new ArrayList<>();
    public PriceRangeDto priceRangeDto = new PriceRangeDto();
}
