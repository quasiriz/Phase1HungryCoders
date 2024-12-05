package com.example.demo.model;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


// Order as a Class
//@Component
//@Lazy
//public class Order {
//    private String order;
//
//    public Order(){
//        this.order = "QuasiOrder";
//        System.out.println("Lazy Initializing");
//    }
//
//    @PostConstruct
//    public void initialize(){
//        System.out.println("Order Bean has been constructed and injected");
//    }
//
//    public String getOrder() {
//        return order;
//    }
//
//    public void setOrder(String order) {
//        this.order = order;
//    }
//}

//Order as an Interface

public interface Order {
}