package com.yoma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

@SpringBootApplication
public class SupplierAppMain {

    public static final String HELLO_SUPPLIER = "Hello Supplier!!!";

    public static void main(String[] args) {
        SpringApplication.run(SupplierAppMain.class, args);
        System.out.println(HELLO_SUPPLIER);
    }

    @Bean
    public Supplier<String> supplier() {
        return () -> HELLO_SUPPLIER;
    }
}