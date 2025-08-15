package com.example.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    @GetMapping("/api/greet")
    public String greet() {
        return "Hello from DemoApp!";
    }

    @PutMapping("/api/modify")
    public String modify() {
        return "Welcome to the Demo Application Modify method!";
    }
}
