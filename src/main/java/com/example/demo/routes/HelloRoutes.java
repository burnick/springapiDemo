package com.example.demo.routes;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRoutes {

    @GetMapping
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @PostMapping
    public String postHello() {
        return "POST request to hello";
    }

    @PutMapping
    public String putHello() {
        return "PUT request to hello";
    }

    @DeleteMapping
    public String deleteHello() {
        return "DELETE request to hello";
    }
}
