package com.mario.designPatterns.manageStatus.Observer;

public class ConcreteObserver implements Observer {
    public void update(NumberGenerator numberGenerator) {
        System.out.println("DigitObserver:" + numberGenerator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }

}
