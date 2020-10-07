package com.example.kafkaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/kafka")
public class RestController {

    @Autowired
    KafkaService kafkaService;

    @PostMapping
    public void inicioKafka(){
        kafkaService.inicioKafka();
    }
}
