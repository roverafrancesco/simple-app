package com.example.simpleapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SimpleAppApplicationTests {

    @Test
    void contextLoads() {
        Assert.isTrue(Math.random() > 0.9);
    }

}
