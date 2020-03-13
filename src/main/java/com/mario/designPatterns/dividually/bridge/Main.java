package com.mario.designPatterns.dividually.bridge;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello China!"));
        CountDisplay d2 = new CountDisplay((new StringDisplayImpl("Hello World!")));
        CountDisplay d3 = new CountDisplay((new StringDisplayImpl("Hello Universe!")));
        d1.display();
        d2.multiDisplay(5);
        d3.multiDisplay(5);
        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello Bridge mode!"));
        d4.randomDisplay();
        Display d5 = new Display(new FileDisplayImpl("Hello China!"));
        d5.display();
        SpecialDisplay display = new SpecialDisplay(new SpecialDisplayImpl('<', '*', '>'), 2);
        display.specialDisplay(4);
        SpecialDisplay display2 = new SpecialDisplay(new SpecialDisplayImpl('|', '#', '-'), 3);
        display2.specialDisplay(10);
    }
}
