package com.example.standard.product.dto;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
public class ProductDetailResponseDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private BigDecimal originalPrice;
    private Double discountRate;
    private String category;
    private String description;
    private String image;
    private List<String> images;
    private BigDecimal rating;
    private Integer reviewCount;
    private Boolean inStock;
    private Integer stockCount;
    private List<String> tags;
    private SpecDto specs;
    private List<OptionDto> options;
    private ShippingDto shipping;
    private List<Integer> relatedProducts;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
