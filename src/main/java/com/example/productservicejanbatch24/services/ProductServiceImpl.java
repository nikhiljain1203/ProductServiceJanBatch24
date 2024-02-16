package com.example.productservicejanbatch24.services;

import com.example.productservicejanbatch24.dtos.FakeStoreProductDto;
import com.example.productservicejanbatch24.models.Category;
import com.example.productservicejanbatch24.models.Product;
import com.example.productservicejanbatch24.repos.CategoryRepo;
import com.example.productservicejanbatch24.repos.ProductRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("SelfProductService")
public class ProductServiceImpl implements ProductService{
    private ProductRepo productRepo;
    private CategoryRepo categoryRepo;

    public ProductServiceImpl(ProductRepo productRepo, CategoryRepo categoryRepo) {
        this.productRepo = productRepo;
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Product getProductById(Long id) {
        /*
        Product product = this.productrepo.findById(id);
        Category category = product.getCategory();
         */
        Optional<Product> product = this.productRepo.findById(id);
//        if(product.isPresent()) {
//            Category category = product.get().getCategory();
//        }
        return product.get();
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

        Optional<Category> categoryOptional =
                this.categoryRepo.findByName(product.getCategory().getName());
        if(categoryOptional.isPresent()){
            product.setCategory(categoryOptional.get());
        } else {
            Category category = categoryRepo.save(product.getCategory());
            product.setCategory(category);
        }

        return this.productRepo.save(product);
    }

    /*
    C - save
    U - save
    R - find by , get by
    D - delete by
     */

    @Override
    public void updateProductById() {
//        Optional<Category> categoryOptional =
//                this.categoryRepo.findByName(product.getCategory().getName());
//        if(categoryOptional.isPresent()){
//            product.setCategory(categoryOptional.get());
//        } else {
//            Category category = categoryRepo.save(product.getCategory());
//            product.setCategory(category);
//        }
//
//        return this.productRepo.save(product);

    }
}
