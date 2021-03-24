package com.djz;

import java.util.Arrays;

/**
 * @author djz
 * @date 2021/3/23 -12:35
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 33, 1, 22, 4, -4, -44, 332, 5, 32, 21, 656, 77, -8, -9, 11, 45};
        Arrays.sort(arr);

        System.out.println(binarySearch(arr, 5));
    }

    /**
     * 二分查找【要求数组必须有序】、找到返回下标、没有返回-1
     *
     * @param arr
     * @param value
     * @return
     */
    public static int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (value == arr[mid]) {
                return mid;
            }
            if (value > arr[mid]) {
                low = mid + 1;
            }
            if (value < arr[mid]) {
                high = mid - 1;
            }

        }
        //没有找到返回-1
        return -1;
    }

    /**
     * @param array
     * @param low
     * @param high
     * @param key
     * @return
     */
    private static int binarySearch(int[] array, int low, int high, int key) {
        //二分查找需要保证array数组是有序的
        Arrays.sort(array);
        //未查到返回-1，作为索引
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        int midVal = array[mid];
        if (key < midVal) {
            //向左递归查询
            return binarySearch(array, low, mid - 1, key);
        } else if (key > midVal) {
            //向右递归查询
            return binarySearch(array, mid + 1, high, key);
        } else {
            //表示查到了该数
            return mid;
        }
    }


}
