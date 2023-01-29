package com.example.transactionconsumer.repo;

import com.example.transactionconsumer.model.Transaction;
import org.springframework.data.repository.CrudRepository;


import java.util.UUID;


public interface TransactionRepository extends CrudRepository<Transaction, UUID> {
}
