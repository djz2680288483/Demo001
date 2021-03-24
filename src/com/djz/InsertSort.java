package com.djz;

/**
 * @author djz
 * @date 2021/3/22 -16:51
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 8, 6, 45, -4, 4, 5, 6};
        insertSort(arr);

    }

    /**
     * 插入排序
     *
     * @param array
     */
    public static void insertSort(int[] array) {
        // 要插入的数据
        int i, j, insertNote;
        // 从数组的第二个元素开始循环将数组中的元素插入
        for (i = 1; i < array.length; i++) {
            // 设置数组中的第2个元素为第一次循环要插入的数据
            insertNote = array[i];
            j = i - 1;
            while (j >= 0 && insertNote < array[j]) {
                // 如果要插入的元素小于第j个元素,就将第j个元素向后移动
                array[j + 1] = array[j];
                j--;
            }
            // 直到要插入的元素不小于第j个元素,将insertNote插入到数组中
            array[j + 1] = insertNote;
        }

        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
