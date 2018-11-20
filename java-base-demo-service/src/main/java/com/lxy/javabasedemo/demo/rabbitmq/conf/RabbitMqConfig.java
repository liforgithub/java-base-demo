package com.lxy.javabasedemo.demo.rabbitmq.conf;


import com.lxy.javabasedemo.demo.rabbitmq.constans.TopicConstants;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue Queue() {
        return new Queue(TopicConstants.RABBIT_TEST_TOPIC);
    }
}
