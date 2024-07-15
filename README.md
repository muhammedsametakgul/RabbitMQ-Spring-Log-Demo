# RabbitMQ Logging Project

This project demonstrates a logging application integrated with RabbitMQ message queue system using Spring Boot. The application consumes log messages from RabbitMQ and persists them into a file.

## Project Objectives

My main goal in this project is to use RabbitMQ with Spring Boot and make a simple Log system.

## Requirements

- Java Development Kit (JDK) 11 or higher
- Maven (for managing project dependencies)
- Docker (optional, for using RabbitMQ Docker image)

### Optional Requirements

- Docker: RabbitMQ server can be run using Docker. If you prefer not to use Docker, you may need to install RabbitMQ locally.

## Project Setup and Running

1. **Clone or Download the Project**

   ```bash
   git clone https://github.com/muhammedsametakgul/RabbitMQ-Spring-Log-Demo.git
   
   cd rabbitmq-log-demo
   
2. **Run DOCKER Container**

      ```bash
   docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management

3. **Run the Application**

4. **Test the project with Postman and RabbitMQ Console**


   ```bash
   
   For RabbitMQ Console->
   
   http://localhost:15672
   Username: guest
   Pass : guest

  
    For Postman ->
   
    curl --location --request POST 'http://localhost:8080/logs' \--header 'Content-Type: application/json' \--data-raw '{
    "level": "INFO",
    "message": "This is a test log message",
    "timestamp": "2024-07-15T10:00:00"}' ```



   
