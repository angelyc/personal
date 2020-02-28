package com.mario.algorithms.sort;

import com.mario.utils.ArrayPrints;
import com.mario.utils.Randoms;

public class MergeSort {
    private static int SIZE = 32;
    private static int[] sorts = new int[SIZE];

    private static void merge(int[] array1, int len1, int[] array2, int len2, int[] end) {
        int i, j, k;
        i = j = k = 0;
        while (i < len1 && j < len2) {
            if (array1[i] < array2[j]) {
                end[k++] = array1[i++];
            } else {
                end[k++] = array2[j++];
            }
        }

        while (i < len1) {
            end[k++] = array1[i++];
        }

        while (j < len2) {
            end[k++] = array2[j++];
        }
        return;
    }

    private static void merge(int[] a, int first, int middle, int last, int[] end) {
        int i, j, k;
        i = first;
        j = middle + 1;
        k = 0;

        while (i <= middle && j <= last) {
            if (a[i] < a[j]) {
                end[k++] = a[i++];
            } else {
                end[k++] = a[j++];
            }
        }

        while (i <= middle) {
            end[k++] = a[i++];
        }

        while (j <= last) {
            end[k++] = a[j++];
        }
        for (int x = 0; x < k; x++) {
            a[first + x] = end[x];
        }
    }

    private static void mergeArray(int[] array, int begin, int end, int[] result) {
        if (begin < end) {
            int middle = (begin + end) / 2;
            mergeArray(array, begin, middle, result);
            mergeArray(array, middle + 1, end, result);
            merge(array, begin, middle, end, result);
        }
    }

    public static void main(String[] args) {
        int[] temp = new int[SIZE];
        Randoms.random(sorts, SIZE);
        ArrayPrints.out(sorts, SIZE, 0);
        mergeArray(sorts, 0, SIZE - 1, temp);
        ArrayPrints.out(sorts, SIZE, SIZE);
    }
}

