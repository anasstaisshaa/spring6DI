package com.anastasiiaTkachuk.spring6DI.services.i18n;

import com.anastasiiaTkachuk.spring6DI.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}