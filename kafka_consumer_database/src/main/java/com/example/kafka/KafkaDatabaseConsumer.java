package com.example.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaDatabaseConsumer {

    @KafkaListener(topics = "wikimediaRecentChange", groupId = "myGroup")
    public void consume(String eventMessage) {
        log.info("Event message received -> {}", eventMessage);
    }

}