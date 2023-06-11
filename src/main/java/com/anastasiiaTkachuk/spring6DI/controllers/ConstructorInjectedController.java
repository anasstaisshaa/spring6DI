package com.anastasiiaTkachuk.spring6DI.controllers;

import com.anastasiiaTkachuk.spring6DI.services.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

