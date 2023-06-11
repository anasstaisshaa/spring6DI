package com.anastasiiaTkachuk.spring6DI.controllers;

import com.anastasiiaTkachuk.spring6DI.services.EnvironmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class EnvironmentController {
    private final EnvironmentService environmentService;

    public String getEnvironment(){
        return "This is a " + environmentService.getEnv() + " Environment";
    }
}
