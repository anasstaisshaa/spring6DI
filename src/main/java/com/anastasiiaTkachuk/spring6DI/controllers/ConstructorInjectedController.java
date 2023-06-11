package com.anastasiiaTkachuk.spring6DI.controllers;

import com.anastasiiaTkachuk.spring6DI.services.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
