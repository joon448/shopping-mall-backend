package com.example.standard.product.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class PriceRangeDto {
    public List<CategoryCountDto> categories;
    public PriceRangeDto priceRange;
}
