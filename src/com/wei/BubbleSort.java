package com.wei;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {3, 1, 10, 4, 5, 8, 2, 9, 7, 6};
        // 交换的最大次数
        int len = arr.length - 1;

        do {
            int last = 0; // 最后一次交换位置的索引值
            for (int i = 0; i < len; i++) {
                System.out.println("第 " + i + " 次比较");
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    last = i;
                }
            }
            len = last;
            System.out.println(Arrays.toString(arr));
        } while (len != 1);
    }

    // 交换位置
    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
