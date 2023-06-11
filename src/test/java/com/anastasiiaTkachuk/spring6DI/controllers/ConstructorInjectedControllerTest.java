package com.anastasiiaTkachuk.spring6DI.controllers;

import com.anastasiiaTkachuk.spring6DI.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}