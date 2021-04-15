package com.djz.epoint;

import java.io.*;

/**
 * @author djz
 * @date 2021/4/15 -7:53
 */
public class FileTest1 {
    public static <bytes> void main(String[] args) throws IOException {
        File file = new File("D:" + File.separator + "test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        InputStream input = null;
        OutputStream output = null;

        output = new FileOutputStream(file);
        byte[] bytes = "“Java是一门面向对象编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念...”".getBytes();
        output.write(bytes);
        output.flush();
        output.close();

        input = new FileInputStream(file);
        byte[] b = new byte[input.available()];
        int data = 0;
        File file1 = new File("D:" + File.separator + "test1.txt");
        if (!file1.exists()) {
            file1.createNewFile();
        }
        output = new FileOutputStream(file1);
        while ((data = input.read(b)) != -1) {
            System.out.println(new String(bytes, 0, data));
            output.write(b);
        }

        output.flush();
        input.close();
        output.close();
    }
}
