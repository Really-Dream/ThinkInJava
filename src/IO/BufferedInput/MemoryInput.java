package IO.BufferedInput;

import util.Property;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by H.J
 * 2018/5/8
 * 从内存输入
 */
public class MemoryInput {

    public static void main(String args[]) throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read(Property.getProperties("IOPath") + "BufferedInput\\MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1){
            System.out.println((char)c);
        }
    }

}
