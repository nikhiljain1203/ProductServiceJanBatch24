package com.example.productservicejanbatch24.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Product extends BaseModel {
    private Long id;
    private String title;
    private String desc;
    private Long price;
    private Category category;
    private List<String> allowedUser;

}
