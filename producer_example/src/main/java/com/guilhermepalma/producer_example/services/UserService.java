package com.guilhermepalma.producer_example.services;

import com.guilhermepalma.producer_example.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    @Value("${mykafka.topics.change-user}")
    private final String CREATE_USER_TOPIC;

    private final KafkaTemplate<String, User> kafkaTemplate;

    public String createUser(User user){
        String idTransaction = UUID.randomUUID().toString();

        log.info(String.format("ID Transaction: [%s]\nPayload: [ %s ]", idTransaction, user.toString()));
        kafkaTemplate.send(CREATE_USER_TOPIC, idTransaction, user);

        return idTransaction;
    }

}
