package com.mario.designPatterns.manageStatus.Memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int money;
    ArrayList<String> fruits;
    public int getMoney() {
        return money;
    }
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit) {
        this.fruits.add(fruit);
    }

    List getFruits() {
        return (List)fruits.clone();
    }
}
