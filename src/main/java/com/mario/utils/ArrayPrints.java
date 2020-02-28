package com.mario.utils;

public class ArrayPrints {
    public static void out(int[] a, int size, int index) {
        System.out.println("第" + index + "次");
        String output = "";
        for (int i = 0; i < size; i++) {
            if (i == index) {
                output += ", ";
            }
            output = output + " " + a[i];

        }
        System.out.println(output);
    }
}
