package com.example.standard.product.dto;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ProductResponseDto {
    public List<ProductDto> products = new ArrayList<>();
    public PaginationDto pagination = new PaginationDto();
    public FilterDto filters = new FilterDto();
}
