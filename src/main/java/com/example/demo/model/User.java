package com.example.demo.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User {
    private String username;
    private String email;

    @Autowired
    @Qualifier("onlineOrder")
    Order order;

    public User(String username, String email) {
        this.email = email;
        this.username = username;
        System.out.println("Initializing Bean: User");
    }

    @PostConstruct
    public void initialize() {
        System.out.println("User Bean has been constructed and injected");
        System.out.println(order.getClass());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("User Bean is about to be destroyed");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
