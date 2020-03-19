package com.mario.designPatterns.manageStatus.State;

public class Main {
    public static void main(String[] args) {
        SafeFrame safeFrame = new SafeFrame("State example");
        while(true) {
            int hour = 0;
            for (; hour < 24; hour++) {
                safeFrame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
            hour = 0;
        }
    }
}
