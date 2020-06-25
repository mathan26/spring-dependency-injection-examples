package com.github.mathan26.springdependencyinjectionexamples.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimayGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - @Primary Impl";
    }
}
