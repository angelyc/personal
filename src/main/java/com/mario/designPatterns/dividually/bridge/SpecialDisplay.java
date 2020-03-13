package com.mario.designPatterns.dividually.bridge;

public class SpecialDisplay extends CountDisplay {
    private int step;
    public SpecialDisplay(DisplayImpl impl, int step) {
        super(impl);
        this.step = step;
    }
    public void specialDisplay(int level) {
        int count = 0;
        for(int j = 0; j < level; j++) {
            multiDisplay(count);
            count += step;
        }
    }
}
