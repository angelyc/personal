package com.mario.algorithms.sort;

import com.mario.utils.ArrayPrints;
import com.mario.utils.Randoms;
import com.mario.utils.Swap;

public class FastSort {
    private static int SIZE = 32;
    private static int fastSortMethod(int[] a, int start, int end) {
        int lessLeftIndex, moreRightIndex, newPosForFlag;
        lessLeftIndex = start;
        moreRightIndex = end - 1;
        newPosForFlag = lessLeftIndex;
        int flagValue = a[start];
        while (lessLeftIndex < moreRightIndex) {
            while(lessLeftIndex < moreRightIndex) {
                if (a[moreRightIndex] < flagValue) {
                    break;
                }
                moreRightIndex--;
            }
            while(lessLeftIndex < moreRightIndex) {
                if (a[lessLeftIndex] > flagValue) {
                    break;
                }
                lessLeftIndex++;
            }

            Swap.swapInt(a, lessLeftIndex, moreRightIndex);
            System.out.printf("%d, %d\n", lessLeftIndex, moreRightIndex);
            // 哨兵的新位置取决于升降序，升序取 左区间最后一个， 降序取右区间第一个？？
            // 还是跟while里面的判断也有关系？
            newPosForFlag = lessLeftIndex;
        }

        Swap.swapInt(a, newPosForFlag, start);
        ArrayPrints.out(a, SIZE, newPosForFlag);
        return newPosForFlag;
    }

    private static void fastSort(int[] a, int start, int end) {
        if (start == end) return;
        int nextFlag = fastSortMethod(a, start, end);
        fastSort(a, start, nextFlag);
        fastSort(a, nextFlag + 1, end);
    }

    public static void main(String[] args) {
        int[] a = new int[SIZE];
        Randoms.random(a, SIZE);
        ArrayPrints.out(a, SIZE, SIZE);
        fastSort(a, 0, SIZE);
        ArrayPrints.out(a, SIZE, SIZE);
    }
}
