package com.example.productservicejanbatch24.controllers;


import com.example.productservicejanbatch24.dtos.ExcpetionDto;
import com.example.productservicejanbatch24.exceptions.ProductNotFoundException;
import com.example.productservicejanbatch24.models.Product;
import com.example.productservicejanbatch24.services.ProductService;
import com.example.productservicejanbatch24.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

//    @Autowired
    private ProductService productService;

    @Autowired
    public ProductController(@Qualifier("SelfProductService") ProductService productService) {
        this.productService = productService;
    }

//    @Autowired
//    public void setProductService(ProductService productService) {
//        this.productService = productService;
//    }

    @GetMapping("/{id}")
    public Product getProductbyId(@PathVariable("id") Long id) throws ProductNotFoundException {
        Product p = productService.getProductById(id);
        //p.setId(2L);
        return p;
    }

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public Product deleteProductbyId(@PathVariable("id") Long id) throws ProductNotFoundException {
        return productService.deleteProductById(id);
    }

//    public String getProductByCategory(String category) {
//
//    }

//    @ExceptionHandler(ProductNotFoundException.class)
//    //@ResponseStatus(HttpStatus.NOT_FOUND)
//    private ResponseEntity<ExcpetionDto> handleProductNotFoundException(ProductNotFoundException e) {
//        ExcpetionDto excpetionDto = new ExcpetionDto();
//        excpetionDto.setMessage(e.getMessage());
//        excpetionDto.setStatus("Failure");
//        ResponseEntity<ExcpetionDto> responseEntity = new ResponseEntity<>(excpetionDto, HttpStatus.NOT_FOUND);
//        return responseEntity;
//    }

    //    @ExceptionHandler(ProductNotFoundException.class)
//    //@ResponseStatus(HttpStatus.NOT_FOUND)
//    private ExcpetionDto handleProductNotFoundException(ProductNotFoundException e) {
//        ExcpetionDto excpetionDto = new ExcpetionDto();
//        excpetionDto.setMessage(e.getMessage());
//        excpetionDto.setStatus("Failure");
//        return excpetionDto;
//    }

}

/**
 * www.xyz.com/api/......
 * Endpoint is nothing but a combination of Domain Name + Path of Entity API
 */

/**
 * 1. GetProductById(Id)
 * 2. GetAllProducts
 * 3. UpdateProductById()
 * 4. DeleteProduct(id)
 * 5. AddProduct()
 */

/**
 * 1 Constructor Injection
 * 2. Feild Injection
 * 3. Setter Injection
 */