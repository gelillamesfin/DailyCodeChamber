package com.meInJava.practice_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.meInJava.practice_spring_framework.game.GameRunner;
import com.meInJava.practice_spring_framework.game.GamingConsole;

public class App03GamingSpring {
    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }

    }

}
