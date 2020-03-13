package com.mario.designPatterns.dividually.bridge;

import com.mario.utils.Randoms;

public class RandomDisplay extends CountDisplay {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay() {
        int times = Randoms.random2();
        System.out.printf("random display %d%n", times);
        multiDisplay(times);
    }
}
