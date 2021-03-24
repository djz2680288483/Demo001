package com.djz;

import java.util.*;

/**
 * @author djz
 * @date 2021/3/22 -15:29
 */
public class Test {


    public static void main(String[] args) {
        int[] array = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(getMaxArea(array));

    }

    public static int getMaxArea(int[] array) {
        List<Integer> list = new ArrayList<>();
        int arrayLength = array.length;
        int left = 0;
        int right = arrayLength - 1;
        //寻找最大面积
        int x = right - left + 1;
        //长方形的长度
        int y = Math.min(array[left], array[right]);
        int area = x * y;
        while (left != right) {
            //左边大于右边 每次要移动高度比较小的那个 才有可能让面积增大
            if (array[right] >= array[left]) {
                left = left + 1;
            } else {
                right = right - 1;
            }
            x = right - left;
            y = Math.min(array[left], array[right]);
            int temp = x * y;
            //每次循环的面积加入到集合里
            list.add(temp);
        }
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
}