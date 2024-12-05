package com.example.demo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class OfflineOrder implements Order{
    public OfflineOrder() {
        System.out.println("This is an offline Order");
    }
}
