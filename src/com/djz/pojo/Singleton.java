package com.djz.pojo;

/**
 * @author djz
 * @date 2021/3/24 -9:30
 * 饿汉式单列模式
 */
public class Singleton {
    /**
     * 在类的内部可以访问私有结构，所以可以在类的内部产生实例化对象
     */
    private static Singleton instance = new Singleton();
    /**
     * private 声明构造
     */
    private Singleton() {

    }
    /**
     * 返回对象实例
     */
    public static Singleton getInstance() {
        return instance;
    }


}
