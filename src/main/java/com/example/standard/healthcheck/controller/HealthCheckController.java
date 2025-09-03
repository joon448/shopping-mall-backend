package com.example.standard.healthcheck.controller;

import com.example.standard.common.ApiResponse;
import com.example.standard.product.dto.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Validated
public class HealthCheckController {

    @GetMapping("/health")
    @ResponseStatus(HttpStatus.OK)
    public String health() {
        return "1";
    }
}
