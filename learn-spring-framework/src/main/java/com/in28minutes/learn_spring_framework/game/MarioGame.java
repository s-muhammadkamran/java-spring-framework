package com.in28minutes.learn_spring_framework.game;

public class MarioGame implements IGame {

    public void up() {
        System.out.println("Jump up");
    }

    public void down() {
        System.out.println("Duck down");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Accelerate");
    }
}
