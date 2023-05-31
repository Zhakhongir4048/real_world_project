package com.example.kafka;

import com.example.entity.WikimediaData;
import com.example.repository.WikimediaDataJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class KafkaDatabaseConsumer {

    private final WikimediaDataJpaRepository wikimediaDataJpaRepository;

    @KafkaListener(topics = "wikimediaRecentChange", groupId = "myGroup")
    public void consume(String eventMessage) {
        log.info("Event message received -> {}", eventMessage);
        WikimediaData entity = new WikimediaData();
        entity.setWikiEventData(eventMessage);
        wikimediaDataJpaRepository.save(entity);
    }

}