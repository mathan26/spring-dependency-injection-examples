package com.github.mathan26.springdependencyinjectionexamples.controllers;

import com.github.mathan26.springdependencyinjectionexamples.services.GreetingService;
import com.github.mathan26.springdependencyinjectionexamples.services.PropertyGreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyGreetingServiceImpl")
    public GreetingService greetingService;

   public String getGreeting(){
       return greetingService.sayGreeting();
   }
}
