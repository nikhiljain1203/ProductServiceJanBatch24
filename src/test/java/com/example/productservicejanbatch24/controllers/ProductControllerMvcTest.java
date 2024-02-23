package com.example.productservicejanbatch24.controllers;

import com.example.productservicejanbatch24.exceptions.ProductNotFoundException;
import com.example.productservicejanbatch24.models.Product;
import com.example.productservicejanbatch24.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ProductController.class)
public class ProductControllerMvcTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean(name = "SelfProductService")
    private ProductService productService;

    @Test
    public void testGetProductById() throws Exception {
        //Arrange
        Product dummy = new Product();
        dummy.setId(1L);
        dummy.setTitle("dummy");
        when(productService.getProductById(1L)).thenReturn(dummy);

        //Act
        mockMvc.perform(get("/products/{id}", 1L))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(1L));
    }
}
