package io.github.vuongtw.ssb.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.vuongtw.ssb.models.Product;
import io.github.vuongtw.ssb.repositories.ProductRepository;

@RestController
public class ProductController {
    
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public List<Product> products() {
        return productRepository.findAll();
    }
}
