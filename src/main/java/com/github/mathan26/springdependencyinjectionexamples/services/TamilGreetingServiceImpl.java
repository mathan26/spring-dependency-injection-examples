package com.github.mathan26.springdependencyinjectionexamples.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("TA")
@Service("i18nService")
public class TamilGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Vanakkam - TA @Profile Annotation Used";
    }
}
