package com.example.productservicejanbatch24.services;

import com.example.productservicejanbatch24.dtos.FakeStoreProductDto;
import com.example.productservicejanbatch24.exceptions.ProductNotFoundException;
import com.example.productservicejanbatch24.models.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id) throws ProductNotFoundException;

    List<Product> getAllProducts();

    Product deleteProductById(Long id);

    Product addProduct(Product product);

    void updateProductById();
}
