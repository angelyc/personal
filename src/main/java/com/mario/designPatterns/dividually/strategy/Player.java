package com.mario.designPatterns.dividually.strategy;

public class Player {
    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }
    public Hand nextHand() {
        return strategy.nextHand();
    }
    public void win() {
        strategy.study(true);
        loseCount++;
        gameCount++;
    }
    public void lose() {
        strategy.study(false);
        winCount++;
        gameCount++;
    }
    public void even() {
        gameCount++;
    }
    @Override
    public String toString() {
        return "[" + name + ":" + gameCount + " games, " + winCount + " win, " + loseCount + " lose]";
    }
}
