package IO.BufferedInput;

import util.Property;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by H.J
 * 2018/5/8
 * 使用available()方法检测还有多少可取的字符
 */
public class TestEOF {

    public static void main(String args[]) throws IOException {
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(Property.getProperties("IOPath") + "BufferedInput\\TestEOF.java")));

        while (in.available() != 0){
            System.out.println((char)in.readByte());
        }
    }
}
