package com.meInJava.practice_spring_framework.game;

public class GameRunner {
private GamingConsole game;

public GameRunner(GamingConsole game){
    this.game=game;
}

public void run() {
  System.out.println("Running game: "  + this.game);
  game.down();
  game.up();
  game.left();
  game.right();
}
}
