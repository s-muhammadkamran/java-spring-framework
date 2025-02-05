package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello World";
    }

    @Bean
    public String name() {
        return "Kamran";
    }

    @Bean
    public int age() {
        return 48;
    }

    @Bean
    public String address() {
        return "King Fahad District, Riyadh, KSA";
    }

}
