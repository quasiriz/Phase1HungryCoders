package com.example.demo;

import com.example.demo.model.Order;
import com.example.demo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private User user;

    @Autowired
    private Order order;

    @Test
    void contextLoads() {
        assertEquals("QuasiRiz", user.getUsername());
        assertEquals("quasim.rizvi@gmail.com", user.getEmail());
        System.out.println("Done Asserting User");
//        assertEquals("QuasiOrder", order.getOrder()); uncomment with Order Class
    }

}
