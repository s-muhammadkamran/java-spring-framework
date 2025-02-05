package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasicJava {
    public static void main(String[] args) {
        // Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // Configure the things which we want Spring framework to manage

        // Retrieve the HelloWorld bean defined in the HelloWorldConfiguration class
        var helloWorldBean = context.getBean("helloWorld");

        System.out.println(helloWorldBean);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("address"));
    }
}