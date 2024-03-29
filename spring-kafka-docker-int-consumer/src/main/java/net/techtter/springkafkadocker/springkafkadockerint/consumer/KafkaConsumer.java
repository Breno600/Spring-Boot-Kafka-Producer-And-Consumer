package net.techtter.springkafkadocker.springkafkadockerint.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "my_topic", groupId = "my_group_id")
    public void consume(String message){
        System.out.println(message);
    }
}
