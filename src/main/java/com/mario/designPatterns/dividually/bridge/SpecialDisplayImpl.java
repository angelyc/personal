package com.mario.designPatterns.dividually.bridge;

public class SpecialDisplayImpl extends DisplayImpl{
    private char start;
    private char finish;
    private char middle;

    public SpecialDisplayImpl(char start, char middle, char finish) {
        this.start = start;
        this.middle = middle;
        this.finish = finish;

    }

    public void rawOpen() {
        System.out.printf("%c", start);
    }

    public void rawPrint() {
        System.out.printf("%c", middle);
    }

    public void rawClose() {
        System.out.printf("%c%n", finish);
    }
}
