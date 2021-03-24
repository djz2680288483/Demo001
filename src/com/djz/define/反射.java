package com.djz.define;

import com.djz.pojo.Apple;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author djz
 * @date 2021/3/24 -16:29
 */
public class 反射 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class c1 = Apple.class;
        Class c2 = Class.forName("com.djz.pojo.Apple");
        Apple apple = new Apple();
        Class c3 = apple.getClass();
        System.out.println(c3.getName());

        Method[] methods = c1.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println(m);
        }



    }
}