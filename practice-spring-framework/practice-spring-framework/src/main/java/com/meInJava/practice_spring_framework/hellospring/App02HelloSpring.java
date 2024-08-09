package com.meInJava.practice_spring_framework.hellospring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.meInJava.practice_spring_framework.HelloSpringConfig;

public class App02HelloSpring {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(HelloSpringConfig.class)) {

            context.getBean("name");
            System.out.println(context.getBean("name"));
            System.out.println((context.getBean("age")));
            System.out.println(context.getBean("person2"));
            System.out.println(context.getBean("person"));
            // System.out.println(context.getBean(Address.class));
            System.out.println(context.getBeanDefinitionCount());
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBeanDefinitionNames());
        }
    }

}
