package com.sametakgul.rabbitmq_demo.service;

import com.sametakgul.rabbitmq_demo.model.LogMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Service
public class LogService {

    @Value("${log.file.path}")
    private String logFilePath;

    public void writeLog(LogMessage logMessage) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(logFilePath, true))) {
            writer.println("Received Log for LOG_QUEUE: " + logMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
