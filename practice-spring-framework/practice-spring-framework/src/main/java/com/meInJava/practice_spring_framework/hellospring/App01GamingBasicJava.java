package com.meInJava.practice_spring_framework.hellospring;

import com.meInJava.practice_spring_framework.game.MarioGame;
import com.meInJava.practice_spring_framework.game.Pacman;
import com.meInJava.practice_spring_framework.game.SuperContraGame;
import com.meInJava.practice_spring_framework.game.GameRunner;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        // var game = new MarioGame();
        var game = new Pacman();
        // var game= new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
