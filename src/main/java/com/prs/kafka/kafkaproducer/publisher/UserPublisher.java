package com.prs.kafka.kafkaproducer.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prs.kafka.kafkaproducer.model.User;


@RestController
@RequestMapping("kafka")
public class UserPublisher {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;
    private static final String TOPIC = "kafka_sample_topic";

    @PostMapping("publish")
    public String publish(@RequestBody  User user){
        kafkaTemplate.send(TOPIC, user);
        return "Published successfully";
    }
}
