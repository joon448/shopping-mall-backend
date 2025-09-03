package com.example.standard.product.dto;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
public class ProductDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private BigDecimal originalPrice;
    private BigDecimal discountPrice;
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
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
