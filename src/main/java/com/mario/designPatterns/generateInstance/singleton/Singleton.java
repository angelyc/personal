package com.mario.designPatterns.generateInstance.singleton;

public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {
        System.out.println("生成一个Singleton instance");
    }
    public static Singleton getInstance() {
        return instance;
    }
}
