package com.anastasiiaTkachuk.spring6DI.services.i18n;

import com.anastasiiaTkachuk.spring6DI.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
