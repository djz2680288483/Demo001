package com.djz.pojo;

/**
 * @author djz
 * @date 2021/3/24 -16:32
 */
public class Apple {

    private String name;

    public Apple() {
    }

    public Apple(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("你好 反射");
    }
}
