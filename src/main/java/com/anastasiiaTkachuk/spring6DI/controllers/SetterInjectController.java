package com.anastasiiaTkachuk.spring6DI.controllers;

import com.anastasiiaTkachuk.spring6DI.services.GreetingService;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Setter
@Controller
public class SetterInjectController {

    @Autowired
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
