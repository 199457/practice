package com.wei;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {11, 1, 3, 10, 4, 5, 8, 2, 9, 7, 6};
        /**
         * 升序为例:
         * 1、将数组分为两个子集，排序的和未排序的，每一轮从未排序的子集中
         *  选出最小元素，放入排序子集中
         * 2、重复以上步骤，直到整个数组有序
         */
        for (int i = 0; i < arr.length; i++) {
            int min = i; // 最小值的索引
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // 交换位置
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
                System.out.println("交换次数: " + i);
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
