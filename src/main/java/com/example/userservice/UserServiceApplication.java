package com.example.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class UserServiceApplication {

    private Map<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    public UserServiceApplication() {
        // Initialize with some demo users
        users.put("1", "Alice");
        users.put("2", "Bob");
        users.put("3", "Charlie");
    }

    @GetMapping("/")
    public String home() {
        return "User Service v1.0 - Running with vulnerable dependencies for demo purposes";
    }

    @GetMapping("/health")
    public String health() {
        return "{\"status\": \"UP\"}";
    }

    @GetMapping("/users")
    public Map<String, String> getAllUsers() {
        return users;
    }

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable String id) {
        return users.getOrDefault(id, "User not found");
    }
}

