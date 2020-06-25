package com.github.mathan26.springdependencyinjectionexamples.controllers;

import com.github.mathan26.springdependencyinjectionexamples.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstrctorInjectedControllerTest {

    ConstrctorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller=new ConstrctorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}