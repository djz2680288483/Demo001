package com.djz;

/**
 * @author djz
 * @date 2021/3/23 -9:37
 */
public class SelectSort {
    public static void main(String[] args) {
        int nums[] = {4, 6, 8, 7, 1, 3, 2, 5, 9, 0};
        selectSort(nums);
    }

    /**
     * 选择排序
     *
     * @param nums
     */
    public static void selectSort(int[] nums) {
        int temp;
        if (nums == null || nums.length < 2) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //进行第i+1躺排序
            //假设第i+1个数为最小值（因为i是从0开始要加1）
            int min = nums[i];
            //创建minIndex变量确定min位置
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }//通过for循环比较出最小值，minIndex就是最小值坐标
            temp = nums[i];
            nums[i] = nums[minIndex];
            //最小值与nums[i]交换
            nums[minIndex] = temp;
        }
        System.out.println("排序结果：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}



