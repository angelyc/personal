package com.mario.designPatterns.manageStatus.Observer;

public class IncrementNumberGenerator extends NumberGenerator {
    private int start;
    private int end;
    private int step;

    public IncrementNumberGenerator(int start, int end, int step) {
        super();
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public int getNumber(){
        return start;
    }

    public void execute() {
        while(start < end) {
            notifyObservers();
            start = start + step;
        }
    }
}
