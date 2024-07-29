package com.example.consumer.config;

import com.example.consumer.constants.AppConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class Kafkaconfig {

    @KafkaListener(topics = AppConstants.TOPIC,groupId = AppConstants.GROUP)
    public void updateLocation (String location){
        System.out.println("Kafka value is: "+location);
    }


}
