package com.anastasiiaTkachuk.spring6DI.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("uat")
public class EnvironmentServiceUat implements EnvironmentService{
    @Override
    public String getEnv() {
        return "uat";
    }
}
