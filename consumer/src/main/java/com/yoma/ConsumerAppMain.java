package com.yoma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class ConsumerAppMain {

    public static final String HELLO_CONSUMER = "Hello Consumer!!!";

    public static void main(String[] args) {
        SpringApplication.run(ConsumerAppMain.class, args);
        System.out.println(HELLO_CONSUMER);


    }

    @Bean
    public Consumer<String> consumer() {
        return System.out::println;
    }
}