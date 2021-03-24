package com.djz.define;

/**
 * @author djz
 * @date 2021/3/24 -16:26
 */
public class 递归 {


    public static void main(String[] args) {
        System.out.println(recursion(4));
    }

    /**
     * 递归实现
     *
     * @param n
     * @return
     */
    public static int recursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * recursion(n - 1);
        }
    }
}
