package com.example.productservicejanbatch24.services;

import com.example.productservicejanbatch24.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);

    List<Product> getAllProducts();

    void deleteProductById();

    void addProduct();

    void updateProductById();
}
