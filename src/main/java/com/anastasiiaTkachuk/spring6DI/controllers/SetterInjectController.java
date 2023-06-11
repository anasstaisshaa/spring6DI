package com.anastasiiaTkachuk.spring6DI.controllers;

import com.anastasiiaTkachuk.spring6DI.services.GreetingService;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
public class SetterInjectController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
