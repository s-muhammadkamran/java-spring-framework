package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();

        var gameRunner1 = new GameRunner(superContraGame);
        var gameRunner2 = new GameRunner(superContraGame);

        gameRunner1.run();
        gameRunner2.run();
    }
}