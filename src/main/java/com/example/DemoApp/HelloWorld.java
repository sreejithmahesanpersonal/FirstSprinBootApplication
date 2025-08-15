package com.example.DemoApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello, World! Welcome to Spring Boot! - Created by Sreejith Java";
    }

}
