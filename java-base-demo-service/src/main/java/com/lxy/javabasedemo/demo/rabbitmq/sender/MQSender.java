package com.lxy.javabasedemo.demo.rabbitmq.sender;

import com.lxy.javabasedemo.demo.rabbitmq.constans.TopicConstants;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MQSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    //发送消息，不需要实现任何接口，供外部调用。
    public void send(String msg, String typeName) {

        System.out.println("开始发送消息 : " + msg.toLowerCase());
        rabbitTemplate.convertAndSend("rabbit", typeName, msg);
        System.out.println("消息发送完成");
    }
}
