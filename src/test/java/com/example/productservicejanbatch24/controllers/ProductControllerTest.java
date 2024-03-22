package com.example.productservicejanbatch24.controllers;

import com.example.productservicejanbatch24.exceptions.ProductNotFoundException;
import com.example.productservicejanbatch24.models.Product;
import com.example.productservicejanbatch24.services.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProductControllerTest {

    @Autowired
    //@InjectMocks
    private ProductController productController;

    @MockBean
    //@Mock
    private ProductService productService;

//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }

//    @Test
//    void getProductbyId() throws ProductNotFoundException {
//        //Arrange
//        Product dummy = new Product();
//        dummy.setId(1L);
//        dummy.setTitle("dummy");
//        when(productService.getProductById(1L)).thenReturn(dummy);
//
//        //Act
//        Product p = productController.getProductbyId(1L);
//
//        //Assert
//        assertEquals(1L,p.getId());
//    }
//
//    @Test
//    void getProductByIdThrowsException() throws ProductNotFoundException {
//        //Arrange
////        Product dummy = new Product();
////        dummy.setId(1L);
////        dummy.setTitle("dummy");
//        when(productService.getProductById(1L)).thenThrow(new ProductNotFoundException("Product Not Found"));
//
//        //Act
//        assertThrows(ProductNotFoundException.class, ()-> productController.getProductbyId(1L));
//
//    }
}