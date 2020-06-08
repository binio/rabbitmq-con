package com.binio.messagingrabbitmqconsumer

import com.example.messagingrabbitmq.Employee
import org.springframework.amqp.core.Message
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service
import java.nio.charset.StandardCharsets

@Service
class RabbitMQConsumer {

    @RabbitListener(queues = ["spring-boot-thomas"])
    fun recievedMessage(employee: Employee) {
        //var body: String  = String(employee.body, StandardCharsets.UTF_8)
        println("EMPLOYEE ID: ${employee.empId}")
        println("EMPLOYEE NAME: ${employee.empName}")
        println("Recieved Message From RabbitMQ: $employee")
    }
}