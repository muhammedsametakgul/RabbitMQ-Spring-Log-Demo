package com.sametakgul.rabbitmq_demo.service;

import com.sametakgul.rabbitmq_demo.config.RabbitMQConfig;
import com.sametakgul.rabbitmq_demo.model.LogMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogReceiver {

    private final LogService logService;

    public LogReceiver(LogService logService) {
        this.logService = logService;
    }

    @RabbitListener(queues = RabbitMQConfig.LOG_QUEUE)
    public void receiveLog(LogMessage logMessage) {
        logService.writeLog(logMessage);
    }
}
