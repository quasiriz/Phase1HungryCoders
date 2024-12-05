package com.example.demo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("onlineOrder")
public class OnlineOrder implements Order{
    public OnlineOrder() {
        System.out.println("This is an Online Order");
    }
}
