package com.sametakgul.rabbitmq_demo.controller;

import com.sametakgul.rabbitmq_demo.model.LogMessage;
import com.sametakgul.rabbitmq_demo.service.LogSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/logs")
public class LogController {

    private final LogSender logSender;

    public LogController(LogSender logSender) {
        this.logSender = logSender;
    }

    @PostMapping
    public void sendLog(@RequestBody LogMessage logMessage) {
        logSender.sendLog(logMessage);
    }
}
