package com.chengze.learning;

public class MyShip implements Ship {
    @Override
    public void shipspeed() {
        System.out.println("I am the fastest");
    }

    @Override
    public void move() {
        System.out.println("I move 10 miles");
    }
}
