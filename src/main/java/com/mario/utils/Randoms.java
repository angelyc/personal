package com.mario.utils;

import java.util.Random;

public class Randoms {
    public static int random1() {
        Random r = new Random(1);
        for (int i = 0; i < 5; i++){
            int ran1 = r.nextInt();
        }

        return  r.nextInt();
    }

    public static int random2() {
        int max = 100, min = 1;
        int ran2 = (int) (Math.random()*(max - min)+min);

        return ran2;
    }

    public static int random3() {
        int max = 100, min = 1;
        long randomNum = System.currentTimeMillis();
        int ran3 = (int) (randomNum % (max - min) + min);

        return ran3;
    }

    public static void random(int[] a, int len) {
        for (int i = 0; i < len; i++) {
            Integer integer = random2();
            a[i] = integer;
        }
    }
}
