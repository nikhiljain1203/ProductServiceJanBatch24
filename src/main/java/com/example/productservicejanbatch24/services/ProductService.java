package com.example.productservicejanbatch24.services;

import com.example.productservicejanbatch24.exceptions.ProductNotFoundException;
import com.example.productservicejanbatch24.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id) throws ProductNotFoundException;

    List<Product> getAllProducts();

    void deleteProductById();

    Product addProduct(Product product);

    void updateProductById();
}
