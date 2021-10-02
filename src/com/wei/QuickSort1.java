package com.wei;

import java.util.Arrays;

/**
 * 单边快速排序
 * 1、选择最右元素作为基准点元素
 * 2、j 指针负责找到比基准点小的元素，一旦找到则与 i 进行交换
 */
public class QuickSort1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 10, 4, 5, 8, 2, 9, 7, 6};
        quick(arr, 0, arr.length - 1);
    }

    private static void quick(int[] a, int l, int h) {
        if (l >= h) {
            return;
        }
        int p = partition(a, l, h);
        quick(a, l, p - 1); // 左边分区的范围确定
        quick(a, p + 1, h); // 右边分区的范围确定
    }

    private static int partition(int[] a, int l, int h) {
        int pv = a[h]; // 基准点元素
        int i = l;
        for (int j = l; j < h; j++) {
            if (a[j] < pv) {
                if (i != j) {
                    swap(a, i, j);
                }
                i++;
            }
        }

        if (i != h) {
            swap(a, h, i);
        }

        System.out.println(Arrays.toString(a));

        return i;
    }

    private static void swap(int[] a, int j, int i) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
