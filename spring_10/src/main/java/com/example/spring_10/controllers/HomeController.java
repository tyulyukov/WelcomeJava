package com.example.spring_10.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "<h1>Hello Home Page</h1>";
    }
}
