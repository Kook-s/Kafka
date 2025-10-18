package io.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageConsumer {

    @KafkaListener(topics = "test-topic", groupId = "concert-group")
    public void consume(String message) {
        log.info("Received message from Kafka: {}", message);
    }
}
