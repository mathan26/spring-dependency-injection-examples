package com.github.mathan26.springdependencyinjectionexamples.controllers;

import com.github.mathan26.springdependencyinjectionexamples.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

   public String getGreeting(){
       return greetingService.sayGreeting();
   }
}
