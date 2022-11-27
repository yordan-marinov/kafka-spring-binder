package com.yoma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SupplierAppMain {
    public static void main(String[] args) {
        SpringApplication.run(SupplierAppMain.class, args);
        System.out.println("Hello Supplier!!!");
    }
}