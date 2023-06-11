package com.anastasiiaTkachuk.spring6DI.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service!!!";
    }
}
