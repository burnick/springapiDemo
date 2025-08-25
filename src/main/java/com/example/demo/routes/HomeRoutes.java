package com.example.demo.routes;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeRoutes {

    @GetMapping
    public String home(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("welcome to apache maven %s!", name);
    }

    @PostMapping
    public String postHome() {
        return "POST request to home";
    }

    @PutMapping
    public String putHome() {
        return "PUT request to home";
    }

    @DeleteMapping
    public String deleteHome() {
        return "DELETE request to home";
    }
}
