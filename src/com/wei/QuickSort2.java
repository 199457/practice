package com.wei;

import java.util.Arrays;

/**
 * 双边快速排序
 * 1、选择最左元素作为基准点元素
 * 2、j 指针负责从右向左找到比基准点小的元素，i 指针负责从左向右找比基准点大的元素
 *  一旦找到二者交换，知道 i，j相交
 * 3、最后基准点与 i (此时 i 与 j 相等)交换，i 即为分区位置
 */
public class QuickSort2 {
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
        int pv = a[l]; // 基准点元素
        int i = l; // 左指针
        int j = h; // 右指针

        while (i < j) {
            // 一定要先 j 开始执行查找，再到 i 执行查找
            // 从右到左找小的值
            while (i < j && a[j] > pv) {
                j--;
            }
            // 从左到右找大的值
            while (i < j && a[i] <= pv) {
                i++;
            }
            swap(a, i, j);
        }
        swap(a, l, j);

        System.out.println(Arrays.toString(a) + " j=" + j);
        return j;
    }

    private static void swap(int[] a, int j, int i) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
