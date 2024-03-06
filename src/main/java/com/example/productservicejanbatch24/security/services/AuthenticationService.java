package com.example.productservicejanbatch24.security.services;

import com.example.productservicejanbatch24.security.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthenticationService {
//    private RestTemplate restTemplate;
//
//    public AuthenticationService(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//    public boolean authenticate(String token) {
//        ResponseEntity<User> userResponseEntity = restTemplate.postForEntity(("http://localhost:9000/users/validate/" + token),
//                null, User.class);
//        if (userResponseEntity.getBody() != null) {
//            return true;
//        }
//        return false;
//    }
/*
 Client ---> User Service (Auth Server)
 Token ---> Client
 Client ---> Product Service with Token ---> UserService /validate
 */



}
