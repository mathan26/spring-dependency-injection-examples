package com.github.mathan26.springdependencyinjectionexamples.controllers;

import com.github.mathan26.springdependencyinjectionexamples.services.ConstructorGreetingServiceImpl;
import com.github.mathan26.springdependencyinjectionexamples.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    public GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl")  GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
       return greetingService.sayGreeting();
   }
}
