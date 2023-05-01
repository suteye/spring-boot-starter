package com.example.demo.broker.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.Order;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {
    @Value("${topic.name.producer}")
    private String topicName;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(Order order) {
        ObjectMapper objectMapper = new ObjectMapper();
        String orderJson = null;
        try {
            orderJson = objectMapper.writeValueAsString(order);
        } catch (JsonProcessingException e) {
            log.error("Error in TopicProducer.sendMessage()");
            log.error(e.getMessage());
            e.printStackTrace();
        }
        log.info("Produced Order Detail {}", orderJson);
        System.out.println(
            String.format("##########\nProduced Order Recieved -> %s\n##########", orderJson));
        this.kafkaTemplate.send(topicName, "Produced Order Recieved -> ",orderJson);
    }
}
