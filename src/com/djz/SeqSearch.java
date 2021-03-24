package com.djz;

/**
 * @author djz
 * @date 2021/3/24 -8:01
 */
public class SeqSearch {

    public static void main(String[] args) {

    }

    /**
     * 线性查找
     *
     * @param arr
     * @param val
     * @return
     */
    public static int seqSearch(int[] arr, int val) {
        //线性查找、逐一比对
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
