package com.mario.designPatterns.dividually.bridge;

public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;
    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.length();
    }
    public void rawOpen() {
        printLine();
    }
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }
    public void rawClose() {
        printLine();
    }
    private void printLine() {
        System.out.printf("+");
        for (int i = 0; i < width; i++) {
            System.out.printf("-");
        }
        System.out.println("+");
    }
}
