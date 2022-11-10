package com.rockhill.rmqconsumer.RabbitMQ;



import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = Constants.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println(message);
    }

}