package com.github.mathan26.springdependencyinjectionexamples.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello World");
        return "Hello folks!";
    }
}
