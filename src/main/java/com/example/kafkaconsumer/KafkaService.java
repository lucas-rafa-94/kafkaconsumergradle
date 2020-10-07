package com.example.kafkaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class KafkaService {
    @Autowired
    Sender kafkaSender;

    @Async
    public void inicioKafka(){
        System.out.println("Inicio kafka :" + new Date());
        try{
            for(int i = 0 ; i < 100000; i++){
                kafkaSender.send("Teste Kafka " + i);
            }
            System.out.println("Fim kafka :" + new Date());
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
