package com.sametakgul.rabbitmq_demo.model;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LogMessage implements Serializable {
    private String level;
    private String message;
    private String timestamp;
}