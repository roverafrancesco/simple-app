package com.example.simpleapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
class SimpleAppApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test1() {
        boolean exp = Math.random() > 0;
        assertTrue("Error", exp);
    }

}
