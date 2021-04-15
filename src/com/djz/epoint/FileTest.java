package com.djz.epoint;

import java.io.File;

/**
 * @author djz
 * @date 2021/4/15 -7:21
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("D:\\Java_Program\\aa\\bb");
        File file1 = new File(file.getPath() + File.separator + "c.txt");

        System.out.println(getFullPath(file1));
        System.out.println(getFileName(file1));
        System.out.println(getPath(file1));
        System.out.println(getExtension(file1));

    }

    public static String getFullPath(File file) {

        return file.getAbsolutePath();
    }

    public static String getPath(File file) {

        String strPath = file.getAbsolutePath();
        int lastIndexOf = strPath.lastIndexOf("\\");
        if (lastIndexOf > 0) {
            strPath = strPath.substring(0, lastIndexOf);
        }
        return strPath;
    }

    public static String getFileName(File file) {
        if (file.isDirectory()) {
            return null;
        }
        return file.getName();
    }

    public static String getExtension(File file) {
        String strPath = file.getAbsolutePath();
        int lastIndexOf = strPath.lastIndexOf(".");
        //获取文件的后缀名
        if (lastIndexOf > 0) {
            String suffix = strPath.substring(lastIndexOf);
            return suffix;
        }
        return null;
    }

}
