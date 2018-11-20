package com.lxy.javabasedemo.demo.rabbitmq.receiver;

import com.lxy.javabasedemo.demo.rabbitmq.constans.TopicConstants;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = TopicConstants.RABBIT_TEST_TOPIC)
public class MQReceiver {

    @RabbitHandler
    public void receiver(String msg) {
        System.out.println(TopicConstants.RABBIT_TEST_TOPIC + " receiver1:" + msg);
    }

}
