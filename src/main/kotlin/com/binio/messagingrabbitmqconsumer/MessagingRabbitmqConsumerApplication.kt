package com.binio.messagingrabbitmqconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MessagingRabbitmqConsumerApplication

fun main(args: Array<String>) {
    runApplication<MessagingRabbitmqConsumerApplication>(*args)
}
