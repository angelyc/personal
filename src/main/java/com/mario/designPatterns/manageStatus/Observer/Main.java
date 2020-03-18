package com.mario.designPatterns.manageStatus.Observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        numberGenerator.addObserver(observer1);
        numberGenerator.addObserver(observer2);
        numberGenerator.execute();

        NumberGenerator incrementNumberGenerator = new IncrementNumberGenerator(10, 50, 5);
        incrementNumberGenerator.addObserver(observer1);
        incrementNumberGenerator.addObserver(observer2);
        incrementNumberGenerator.execute();
    }
}
