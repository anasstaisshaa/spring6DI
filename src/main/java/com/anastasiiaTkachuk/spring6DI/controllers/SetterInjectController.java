package com.anastasiiaTkachuk.spring6DI.controllers;

import com.anastasiiaTkachuk.spring6DI.services.GreetingService;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectController {

    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterGreetingBean")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
