package com.sametakgul.rabbitmq_demo.service;

import com.sametakgul.rabbitmq_demo.config.RabbitMQConfig;
import com.sametakgul.rabbitmq_demo.model.LogMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogSender {

    private final RabbitTemplate rabbitTemplate;

    public LogSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendLog(LogMessage logMessage) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.LOG_QUEUE, logMessage);
    }
}
