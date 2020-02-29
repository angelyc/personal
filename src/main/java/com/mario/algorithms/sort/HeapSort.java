package com.mario.algorithms.sort;

import com.mario.utils.ArrayPrints;
import com.mario.utils.Randoms;
import com.mario.utils.Swap;

public class HeapSort {
    private static int SIZE = 16;
    // 构建最小堆，较大值往下沉
    private static void buildMinHeapMethod(int[] a, int startIndex, int len) {
        int i = startIndex;
        int j = i * 2 + 1;
        while (j < len) {
            if ((j + 1 < len) && (a[j] > a[j + 1])){
                j++;
            }
            if (a[i] <= a[j]) {
                break;
            }
            Swap.swapInt(a, j, i);
            i = j;
            j = i * 2 + 1;
        }
    }

    private static void buildMinHeap(int[] a, int len) {
        for (int i = len /2; i >= 0; i--) {
            buildMinHeapMethod(a, i, len);
        }
    }

    private static void minHeapSort(int[] a, int len) {
        buildMinHeap(a, len);
        ArrayPrints.out(a, len, len);
        for (int i = len - 1 ; i >= 0; i--) {
            Swap.swapInt(a, 0, i);
            buildMinHeapMethod(a, 0, i);
        }
        ArrayPrints.out(a, len, len);
    }

    public static void main(String[] args) {
        int[] a = new int[SIZE];
        Randoms.random(a, SIZE);
        minHeapSort(a, SIZE);
        int[] b = new int[SIZE];
        Randoms.random(b, SIZE);
        maxHeapSort(b, SIZE);
    }

    private static void maxHeapSort(int[] a, int len){
        maxHeapBuild(a, len);
        ArrayPrints.out(a, len, len);
        for(int i = len - 1; i >= 0; i--) {
            Swap.swapInt(a, 0, i);
            maxHeapBuildMethod(a, 0, i);
        }
        ArrayPrints.out(a, len, len);
    }
    private static void maxHeapBuild(int[] a, int len){
        for(int i = len / 2; i >= 0; i--) {
            maxHeapBuildMethod(a, i, len);
        }
    }

    private static void maxHeapBuildMethod (int[] a, int start, int len) {
        int i = start;
        int j = 2 * i + 1;

        while ( j < len) {
            if (j + 1 < len && a[j] < a[j+1]) {
                j++;
            }
            if (a[i] > a[j]) {
                break;
            }
            Swap.swapInt(a, i, j);
            i = j;
            j = i * 2 + 1;
        }
    }
}