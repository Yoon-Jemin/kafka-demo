package com.study.kafka.consumer;

import com.study.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "study", groupId = "myGroup")
    public void consumeMessage(String msg){
        log.info(String.format("Consuming the message form study Topic:: %s", msg));
    }

    @KafkaListener(topics = "study", groupId = "myGroup")
    public void consumeJsonMessage(Student student){
        log.info(String.format("Consuming the message form study Topic:: %s", student.toString()));
    }
}
