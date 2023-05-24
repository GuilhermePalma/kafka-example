package com.guilhermepalma.consumer_example.services;

import com.guilhermepalma.consumer_example.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    @KafkaListener(topics = "${mykafka.topics.change-user}", groupId = "group-id", concurrency = "5",
            topicPartitions = @TopicPartition(
                    topic = "${mykafka.topics.change-user}", partitions = {"0", "1", "2", "3", "4"}))
    private void consumeEvents(ConsumerRecord<String, User> event) throws InterruptedException {
        log.info("start now");
        Thread.sleep(10000);
        log.info(String.format("Topic: [%s], Key: [%s], Headers: [%s], Payload: [ %s ]", event.topic(), event.key(),
                event.headers(), event.value()));
        log.info("finish now");
    }

}
