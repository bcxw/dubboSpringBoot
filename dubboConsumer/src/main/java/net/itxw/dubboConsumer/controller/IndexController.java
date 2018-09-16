package net.itxw.dubboConsumer.controller;

import net.itxw.dubboConsumer.api.ConsumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/say")
public class IndexController {

    @Resource
    private ConsumerService consumerService;

    @RequestMapping("/hello")
    public String sayHello(){
        return consumerService.sayHello("我是消费者");
    }
}
