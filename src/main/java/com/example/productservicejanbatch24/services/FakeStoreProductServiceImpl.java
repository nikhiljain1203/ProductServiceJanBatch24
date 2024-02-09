package com.example.productservicejanbatch24.services;

import com.example.productservicejanbatch24.dtos.FakeStoreProductDto;
import com.example.productservicejanbatch24.exceptions.ProductNotFoundException;
import com.example.productservicejanbatch24.models.Category;
import com.example.productservicejanbatch24.models.Product;
import com.example.productservicejanbatch24.thridpartyclients.FakeStoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

@Service("FakeProductService")
public class FakeStoreProductServiceImpl implements ProductService{

    private FakeStoreClient fakeStoreClient;

    @Autowired
    public FakeStoreProductServiceImpl(FakeStoreClient fakeStoreClient) {
        this.fakeStoreClient = fakeStoreClient;
    }
    @Override
    public Product getProductById(Long id) throws ProductNotFoundException {

        return getProductFromFakeStoreProductDto(fakeStoreClient.getProductById(id));
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> productList = new LinkedList<>();
        for(FakeStoreProductDto fakeStoreProductDto: fakeStoreClient.getAllProducts()) {
            productList.add(getProductFromFakeStoreProductDto(fakeStoreProductDto));
        }
        return productList;
    }

    @Override
    public Product deleteProductById(Long id) {
       return getProductFromFakeStoreProductDto(fakeStoreClient.deleteProductById(id));
    }

    @Override
    public Product addProduct(Product product) {
        return getProductFromFakeStoreProductDto(fakeStoreClient.addProduct(getFakeStoreProductDtoFromProduct(product)));
    }

    @Override
    public void updateProductById() {

    }

    private Product getProductFromFakeStoreProductDto(FakeStoreProductDto fakeStoreProductDto){
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDesc(fakeStoreProductDto.getDescription());
        Category category = new Category();
        category.setName(fakeStoreProductDto.getCategory());
        product.setCategory(category);
        product.setPrice(fakeStoreProductDto.getPrice());

        return product;
    }

    private FakeStoreProductDto getFakeStoreProductDtoFromProduct(Product product){
        FakeStoreProductDto fakeStoreProductDto = new FakeStoreProductDto();
        fakeStoreProductDto.setTitle(product.getTitle());
        fakeStoreProductDto.setDescription(product.getDesc());
        fakeStoreProductDto.setCategory(product.getCategory().getName());
        fakeStoreProductDto.setPrice(product.getPrice());
        return fakeStoreProductDto;
    }


    /*
    Map<String, Object>
    Product p = new Product();
    Map<id,1>
    Map<title, "bag">
    Map<title, 1>

    Product
        title - string

    ObjectMapper - Map the Json Map to an object

     */

    /*
    1. Handle the 3rd party calls
    2. Mapping
     */
}
