package com.example.productservicejanbatch24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(generator = "generator_name")
//    @GenericGenerator(name = "generator_name",
//            strategy = "uuid2")
//    @Column(name = "id", columnDefinition = "binary(16)",
//            updatable = false, nullable = false)
    private Long id;
}
