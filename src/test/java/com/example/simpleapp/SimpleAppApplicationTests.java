package com.example.simpleapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.sql.*;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
class SimpleAppApplicationTests {

    @Test
    void test1() {
        assertTrue("msg", true);
    }

    @Test
    void test2() {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "postgres";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connessione al database riuscita!");

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM person");
            connection.close();
        } catch (Exception e) {
            System.out.println("Connessione al database fallita!");
            e.printStackTrace();
            assert false : "Il test di connessione al database è fallito!";
        }
    }

}
