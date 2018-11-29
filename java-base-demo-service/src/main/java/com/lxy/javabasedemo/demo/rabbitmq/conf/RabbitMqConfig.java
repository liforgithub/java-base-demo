package com.lxy.javabasedemo.demo.rabbitmq.conf;


import com.lxy.javabasedemo.demo.rabbitmq.constans.TopicConstants;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue queue() {
        return new Queue(TopicConstants.RABBIT_TEST_TOPIC);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("rabbit");
    }

    //rabbit.#  匹配rabbit.s   rabbit.s.3 ....
    //rabbit.*  只能匹配rabbit.s一层
    @Bean
    Binding bindingExchangeAll(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("rabbit.#");
    }
}
