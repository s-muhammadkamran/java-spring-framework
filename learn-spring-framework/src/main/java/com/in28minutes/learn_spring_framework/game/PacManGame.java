package com.in28minutes.learn_spring_framework.game;

public class PacManGame implements IGamingConsole{

    @Override
    public void up() {
        System.out.println("Run upwards...");
    }

    @Override
    public void down() {
        System.out.println("Run downwards...");
    }

    @Override
    public void left() {
        System.out.println("Run left...");
    }

    @Override
    public void right() {
        System.out.println("Run right...");
    }
}
