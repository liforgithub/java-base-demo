package com.lxy.javabasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@PropertySources({
        @PropertySource("classpath:/rabbitmq.properties")
})
@EnableAsync
@SpringBootApplication
@EnableSwagger2
public class JavaBaseDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaBaseDemoApplication.class, args);
    }
}
