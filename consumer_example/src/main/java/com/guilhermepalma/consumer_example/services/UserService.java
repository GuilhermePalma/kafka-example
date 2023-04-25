package com.guilhermepalma.consumer_example.services;

import com.guilhermepalma.consumer_example.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    @KafkaListener(topics = "${mykafka.topics.change-user}", groupId = "group-id")
    private void consumeEvents(ConsumerRecord<String, User> event) {
        log.info(String.format("Topic: [%s], Key: [%s], Headers: [%s], Payload: [ %s ]", event.topic(), event.key(),
                event.headers(), event.value()));
    }

}
