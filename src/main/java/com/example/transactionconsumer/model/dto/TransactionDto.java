package com.example.transactionconsumer.model.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {
    private UUID id;
    private BigDecimal amount;
    private Date createdAt;
    private String description;
    private boolean isVisible;
}
