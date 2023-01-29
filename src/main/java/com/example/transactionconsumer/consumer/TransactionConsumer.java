package com.example.transactionconsumer.consumer;


import com.example.transactionconsumer.model.Transaction;
import com.example.transactionconsumer.model.dto.TransactionDto;
import com.example.transactionconsumer.repo.TransactionRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;


import static com.example.transactionconsumer.enums.TransactionType.DEBIT;

@Slf4j
@Service
public class TransactionConsumer {

    private final TransactionRepository transactionRepository;
    private final ModelMapper modelMapper;

    public TransactionConsumer(TransactionRepository transactionRepository, ModelMapper modelMapper) {
        this.transactionRepository = transactionRepository;
        this.modelMapper = modelMapper;
    }

    @KafkaListener(
            topics= "${example.kafka.topic.transaction}",
            groupId = "${example.kafka.group.id}",
            containerFactory = "kafkaListenerContainerFactory")
    public void consumeMcTransaction(@Payload TransactionDto transactionDto) {
        log.info("Transaction Consuming from transaction... id:{}" , transactionDto.getId());
        Transaction transaction = modelMapper.map(transactionDto, Transaction.class);
        transactionRepository.save(transaction);
    }
}