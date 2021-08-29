package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HunterB4TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello! I am Provider.";
    }

}
