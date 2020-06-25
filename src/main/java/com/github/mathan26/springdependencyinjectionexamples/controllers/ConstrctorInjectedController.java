package com.github.mathan26.springdependencyinjectionexamples.controllers;

import com.github.mathan26.springdependencyinjectionexamples.services.GreetingService;

public class ConstrctorInjectedController {
    public GreetingService greetingService;

    public ConstrctorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
       return greetingService.sayGreeting();
   }
}
