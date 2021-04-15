package com.djz.epoint;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

/**
 * @author djz
 * @date 2021/4/15 -8:16
 */
public class FileTest2 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        String resource = "jdbc.properties";
        InputStream inputStream = FileTest2.class.getClassLoader().getResourceAsStream(resource);
        prop.load(inputStream);
        Set<String> keys = prop.stringPropertyNames();
        for (String str : keys) {
            System.out.println(str + "=" + prop.getProperty(str));
        }
    }
}
