package com.djz;

/**
 * @author djz
 * @date 2021/3/22 -16:00
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 6, 8, 4, 55, 67, -4, 65, -8};

        bubbleSort(numberArray);
    }

    /**
     * 冒泡排序
     *
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        int temp;
        int len = array.length;
        //第一层for循环控制所有数比较的次数
        for (int i = 0; i < len - 1; i++) {
            //第二次for循环控制，每次比较的次数，通过-1让下标长度最大达到数组的长度，通过-i，控制每次循环进行比较的个数
            for (int j = 0; j < len - 1 - i; j++) {
                //通过if语句，比较两个数的大小,交换它们的位置。通过一个空数据，来进行数的交换
                if (array[j] > array[j + 1]) {
                    // 交换位置
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;


                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

}
