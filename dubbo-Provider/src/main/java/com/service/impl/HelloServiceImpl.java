package com.service.impl;

import com.service.HelloService;
import org.springframework.stereotype.Service;
@Service("helloServiceImpl")
public class HelloServiceImpl implements HelloService{
    public String sayHello(String name) {
        System.out.println("我是1");
        return "hello,"+name+"!";
    }
}
