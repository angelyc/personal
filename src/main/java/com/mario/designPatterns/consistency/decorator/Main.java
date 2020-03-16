package com.mario.designPatterns.consistency.decorator;

public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello design pattern");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();

        Display d4 =
                new SideBorder(
                        new FullBorder(
                                new UpDownBorder(
                                        new SideBorder(
                                                new UpDownBorder(
                                                        new StringDisplay("Hello design pattern"), '='
                                                ), '*'
                                        ), '&'
                                )
                        ), '/'
        );
        d4.show();
    }
}
