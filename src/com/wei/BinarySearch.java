package com.wei;

/**
 * 二分查找
 */
public class BinarySearch {

    public static void main(String[] args) {
        /**
         * 1、前提：已有排好序的数组 A
         * 2、定义左边界 L，有边界 R，确定搜索范围，循环执行二分查找 (3、4两步)
         * 3、获取中间索引 M = Floor((L+R) / 2)
         * 4、中间索引的 A[M] 与待搜索的值 T 进行比较
         *  ① A[M] == T 表示找到，返回中间索引
         *  ② A[M] > T 则表示中间值的右侧都无需比较，从左边开始继续二分查找，M-1 设置为右边界值
         *  ③ A[M] < T 则表示中间值的左侧都无需比较，从右边开始继续二分查找，M+1 设置为左边界值
         * 5、当 L > R 时，表示没有找到
         */

        // 排好序的数组
        int[] array = {2, 6, 8, 9, 12, 15, 26, 28, 31, 34, 48, 57};
        // 查找的目标值
        int target = 28;
        // 执行二分查找
        int i = binarySearch(array, target);

        System.out.println(i);

    }

    private static int binarySearch(int[] array, int target) {
        // 定义左边界 L，有边界 R，索引 M
        int l = 0, r = array.length - 1, m;

        while (l <= r) {
            // m = (l + r) / 2; // 存在整数溢出的 bug
            // m = l + (r - l) / 2;
            m = (r + l) >>> 1; // 位运算
            if (array[m] == target) {
                return m;
            } else if (array[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -1;
    }
}
