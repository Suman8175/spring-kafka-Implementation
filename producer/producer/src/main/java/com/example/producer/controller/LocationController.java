package com.example.producer.controller;

import com.example.producer.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
@RequiredArgsConstructor
public class LocationController {
    private final MessageService messageService;

    @PostMapping
    public ResponseEntity<?> updateLocation(){
        boolean b = messageService.updateLocation(Math.round(Math.random() * 100) + "");
        return new ResponseEntity<>(Map.of("msg","Location Updated","hi","hello"), HttpStatus.CREATED);
    }
}
