package com.mario.utils;

public class Swap {
    public static void swapInt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
