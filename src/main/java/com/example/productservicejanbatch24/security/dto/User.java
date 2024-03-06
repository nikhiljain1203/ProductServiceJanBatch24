package com.example.productservicejanbatch24.security.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {
    private String name;
    private String email;
    private String hashedPassword;
    private List<Role> roles;
    private boolean isEmailVerified;
}
