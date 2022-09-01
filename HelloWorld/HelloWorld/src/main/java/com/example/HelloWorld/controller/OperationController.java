package com.example.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hh")
public class OperationController {
    @GetMapping("hello")
    public String Hello(){
        return "Say hello to everyone.";
    }
}
