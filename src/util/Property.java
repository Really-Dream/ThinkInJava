package util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by H.J
 * 2018/5/8
 * 读取配置文件数据
 */
public class Property {

    public static String getProperties(String key){
        Properties properties = new Properties();
        try{
            InputStream in = new BufferedInputStream(
                new FileInputStream("E:\\JAVA_space\\ThinkInJava\\src\\application.properties"));
            properties.load(in);
            return properties.getProperty(key);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String args[]){
        System.out.println(getProperties("IOPath"));
    }
}
