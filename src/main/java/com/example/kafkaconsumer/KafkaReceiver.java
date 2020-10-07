package com.example.kafkaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CountDownLatch;

@Configuration
@EnableKafka
public class KafkaReceiver {


    public static int count = 0;

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }

    @KafkaListener(topics = "${kafka.topic.leitura}")
    public void receive(String payload) throws Exception{
        System.out.println("Msg Recebida : " + (count++));
        latch.countDown();
    }
}
