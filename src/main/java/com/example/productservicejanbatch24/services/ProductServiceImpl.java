package com.example.productservicejanbatch24.services;

import com.example.productservicejanbatch24.dtos.FakeStoreProductDto;
import com.example.productservicejanbatch24.models.Category;
import com.example.productservicejanbatch24.models.Product;
import com.example.productservicejanbatch24.repos.CategoryRepo;
import com.example.productservicejanbatch24.repos.ProductRepo;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Primary
@Service("SelfProductService")
public class ProductServiceImpl implements ProductService{
    private ProductRepo productRepo;
    private CategoryRepo categoryRepo;

    private RestTemplate restTemplate;

    public ProductServiceImpl(ProductRepo productRepo, CategoryRepo categoryRepo,
                              RestTemplate restTemplate) {
        this.productRepo = productRepo;
        this.categoryRepo = categoryRepo;
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductById(Long id) {

        ResponseEntity<Object> response =
                restTemplate.getForEntity("http://userservice/users/1",
                        Object.class);

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
    public Page<Product> getAllProducts(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return productRepo.findAll(pageable);
    }

    @Override
    public Product deleteProductById(Long id) {

        return null;
    }

    @Override
    public Product addProduct(Product product) {

//        Optional<Category> categoryOptional =
//                this.categoryRepo.findByName(product.getCategory().getName());
//        if(categoryOptional.isPresent()){
//            product.setCategory(categoryOptional.get());
//        } else {
//            Category category = categoryRepo.save(product.getCategory());
//            product.setCategory(category);
//        }

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
