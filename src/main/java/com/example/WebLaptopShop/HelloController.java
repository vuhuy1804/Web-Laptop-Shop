package com.example.WebLaptopShop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/user")
    public String userPage() {
        return "Only user can access this page!";
    }

    @GetMapping("/admin")
    public String adninPage() {
        return "Only admin can access this page!";
    }
}