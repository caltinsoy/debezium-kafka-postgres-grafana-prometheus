package com.example.transactionconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TransactionConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TransactionConsumerApplication.class, args);
    }
}
