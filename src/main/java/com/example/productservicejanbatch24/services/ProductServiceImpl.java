package com.example.productservicejanbatch24.services;

import com.example.productservicejanbatch24.models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
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
    public void deleteProductById() {

    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public void updateProductById() {

    }
}
