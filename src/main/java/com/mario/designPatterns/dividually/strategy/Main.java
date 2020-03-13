package com.mario.designPatterns.dividually.strategy;

public class Main {
    public static void main(String[] args) {
        Player a = new Player("Taro", new WinnerStrategy(314));
        Player b = new Player("Hana", new ProbStrategy(15));

        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = a.nextHand();
            Hand nextHand2 = b.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + a);
                a.win();
                b.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner: " + b);
                b.win();
                a.lose();
            } else {
                System.out.println("Even... ");
                a.even();
                b.even();
            }
        }
        System.out.println("Total result: ");
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
