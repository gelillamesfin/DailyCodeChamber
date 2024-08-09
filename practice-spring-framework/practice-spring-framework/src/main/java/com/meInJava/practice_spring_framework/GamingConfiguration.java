package com.meInJava.practice_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.meInJava.practice_spring_framework.game.GameRunner;
import com.meInJava.practice_spring_framework.game.GamingConsole;
import com.meInJava.practice_spring_framework.game.Pacman;

@Configuration
public class GamingConfiguration {
@Bean 
public GamingConsole game(){
    var game= new Pacman();
    return game;
}

@Bean
public GameRunner gameRunner(GamingConsole game) {
    var gameRunner = new GameRunner(game);
    return gameRunner;
}
}
