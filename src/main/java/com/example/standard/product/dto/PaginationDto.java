package com.example.standard.product.dto;

import lombok.Getter;

@Getter
public class PaginationDto {
    private Integer currentPage;
    private Integer totalPages;
    private Long totalItems;
    private Integer itemsPerPage;
    private Boolean hasNext;
    private Boolean hasPrev;
}
