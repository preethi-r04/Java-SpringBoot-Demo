package com.backend.controller;

import com.backend.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    // UC1
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // UC2
    @GetMapping("/hello/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC3
    @GetMapping("/hello/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC4
    @PostMapping("/hello/post")
    public String sayHelloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}