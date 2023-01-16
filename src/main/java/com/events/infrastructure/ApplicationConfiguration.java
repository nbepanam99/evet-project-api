package com.events.infrastructure;

import com.events.services.CurrencyTools;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class ApplicationConfiguration {

    @Bean
    public String getName(){
        return "AnyNameTest";
    }

    @Bean
    public CurrencyTools getCurrencyTools(){
        return new CurrencyTools();
    }

}
