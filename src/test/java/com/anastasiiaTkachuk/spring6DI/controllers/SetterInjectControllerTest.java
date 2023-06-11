package com.anastasiiaTkachuk.spring6DI.controllers;

import com.anastasiiaTkachuk.spring6DI.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectControllerTest {

    @Autowired
    SetterInjectController setterInjectController;

    @Test
    void sayHello() {
        System.out.println(setterInjectController.sayHello());
    }
}