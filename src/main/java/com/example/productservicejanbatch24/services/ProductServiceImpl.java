package com.example.productservicejanbatch24.services;

import com.example.productservicejanbatch24.dtos.FakeStoreProductDto;
import com.example.productservicejanbatch24.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductService")
public class ProductServiceImpl implements ProductService{

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product deleteProductById(Long id) {

        return null;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public void updateProductById() {

    }
}
