package com.mario.designPatterns.generateInstance.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton sin1 = Singleton.getInstance();
        Singleton sin2 = Singleton.getInstance();
        if (sin1 == sin2) {
            System.out.println("两个实例相同");
        } else {
            System.out.println("两个实例不相同");
        }
        System.out.println("End");
    }
}
