package com.mario.designPatterns.dividually.strategy;

public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
