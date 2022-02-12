package com.iAKIN.rabbitmq.messaging;

import com.iAKIN.rabbitmq.config.RabbitMQConfig;
import com.iAKIN.rabbitmq.model.Comment;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class CommentConsumer {
    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(Comment comment) {
        System.out.println("Passenger message received & consumed from queue : " + comment);
    }
}