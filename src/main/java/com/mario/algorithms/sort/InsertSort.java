package com.mario.algorithms.sort;

import com.mario.utils.Randoms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InsertSort {
    private static int SIZE = 32;
    private static int[] sorts = new int[SIZE];

    private static void randoms() {
        for (int i = 0; i < SIZE; i++) {
            Integer integer = Randoms.random2();
            sorts[i] = integer;
        }
    }

    private static int sort(int[] array, int insertIndex) {
        int flag = array[insertIndex];
        int position = insertIndex;
        for (int i = insertIndex - 1; i >= 0; i--) {
            int curr = sorts[i];
            if (curr > flag) {
                sorts[i+1] = curr;
                position = i;
            } else {
                break;
            }
        }
        sorts[position] = flag;
        out(insertIndex);
        return position;
    }
    private static void insertSort() {
        for(int i = 1; i < sorts.length; i++) {
            int j = sort(sorts, i);
        }
    }

    private static void out(int index) {
        System.out.println("第" + index + "次");
        String output = "";
        for (int i = 0; i < SIZE; i++) {
            if (i - 1 == index) output += ", ";
            output = output + " " + sorts[i];

        }
        System.out.println(output);
    }
    public static void main(String[] args) {
        randoms();
        out(0);
        insertSort();
        out(SIZE);
    }
}
