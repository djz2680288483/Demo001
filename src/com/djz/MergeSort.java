package com.djz;

import java.util.Arrays;

/**
 * @author djz
 * @date 2021/3/23 -10:17
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 3, 6, 8, 2, 5};
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 归并排序
     */
    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            //中间索引
            int mid = (left + right) / 2;
            //递归左边进行分解
            mergeSort(arr, left, mid, temp);
            //递归右边进行分解
            mergeSort(arr, mid + 1, right, temp);
            //到合并
            merge(arr, left, mid, right, temp);
        }
    }


    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        //左边有序序列的初始索引
        int i = left;
        //右边有序序列的初始索引
        int j = mid + 1;
        //指向temp的当前索引
        int t = 0;
        //先把左右两边的有序元素有序的拷贝到temp数组中
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                t++;
                i++;
            } else {
                temp[t] = arr[j];
                t++;
                j++;
            }
        }
        //把一边剩余的元素拷贝到temp数组中
        while (i <= mid) {
            temp[t] = arr[i];
            t++;
            i++;
        }
        while (j <= right) {
            temp[t] = arr[j];
            t++;
            j++;
        }

        //将temp数组中元素拷贝到arr数组中
        t = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            arr[tempLeft] = temp[t];
            tempLeft++;
            t++;
        }
    }
}
