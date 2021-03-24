package com.djz;

/**
 * @author djz
 * @date 2021/3/24 -8:06
 */
public class InsertSearch {
    public static void main(String[] args) {

    }

    /**
     * 插值查找算法【要求数组有序】
     * arr有序数组, left 左索引(0), right 右索引(arr.length-1), findVal(需要查找的值)]
     *
     * @param arr
     * @param left
     * @param right
     * @param findVal
     * @return
     */
    public static int insertValSearch(int[] arr, int left, int right, int findVal) {
        //退出条件
        if (left > right || findVal < arr[0] || findVal > arr[arr.length - 1]) {
            return -1;
        }
        //得出mid、自适应
        int mid = left + (right - left) * (findVal - arr[left]) / (arr[right] - arr[left]);
        int midVal = arr[mid];


        if (findVal > midVal) {
            //右递归
            return insertValSearch(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            //向左递归查询
            return insertValSearch(arr, left, mid - 1, findVal);
        } else {
            //找到值
            return mid;
        }
    }
}
