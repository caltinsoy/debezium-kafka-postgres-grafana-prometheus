package com.example.transactionconsumer.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"main_transaction\"")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "\"amount\"")
    private BigDecimal amount;

    @Column(name = "\"createdAt\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "\"description\"")
    private String description;

    @Column(name = "\"isVisible\"")
    private boolean isVisible;

}