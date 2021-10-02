package com.wei;

import java.util.Arrays;

/**
 * 插入排序
 * 1、将数组分为两个区域，排序区域和未排序区域，每一轮从未排序
 *  区域中取出第一个元素，插入到排序区域
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {11, 1, 3, 10, 4, 5, 8, 2, 9, 7, 6};
        // 从下标为 1 的元素开始选择合适的位置插入，因为下标为 0 的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i]; // 待插入的值
            int j = i - 1; // 已排序区的元素索引
            while (j >= 0) {
                if (tmp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break; // 退出循环，减少比较次数
                }
                j--;
            }
            arr[j + 1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
