package com.lxy.javabasedemo.controller;

import com.lxy.javabasedemo.base.ResponseEntity;
import com.lxy.javabasedemo.demo.rabbitmq.sender.MQSender;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController extends BaseController {

    @Autowired
    private MQSender mqSender;

    @ApiOperation(value = "测试rabbitMQ", notes = "测试rabbitMQ", httpMethod = "GET")
    @GetMapping(value = "/testRabbitMQ")
    public ResponseEntity testRabbitMQ(String sendStr) throws Exception {

        System.out.println("测试开始");
        mqSender.send(sendStr);
        return this.getSuccessResult(sendStr + "发送成功");
    }
}
