package com.djz.define;

/**
 * 一. 单例模式
 * 所谓的单例设计指的是一个类只允许产生一个实例化对象。
 * 最好理解的一种设计模式，分为懒汉式和饿汉式。
 * 饿汉式：构造方法私有化，外部无法产生新的实例化对象，只能通过static方法取得实例化对象
 * 懒汉式：当第一次去使用Singleton对象的时候才会为其产生实例化对象的操作
 *
 * @author djz
 * @date 2021/3/24 -9:32
 * 懒汉式单列模式
 */
public class Singleton {
    /**
     * 声明变量 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static volatile Singleton singleton = null;

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton() {

    }

    /**
     * 提供对外方法
     *
     * @return
     */
    public static Singleton getInstance() {
        // 还未实例化
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}

