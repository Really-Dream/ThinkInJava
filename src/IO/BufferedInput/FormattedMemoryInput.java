package IO.BufferedInput;

import util.Property;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * Created by H.J
 * 2018/5/8
 * 格式化的内存输入
 */
public class FormattedMemoryInput {

    public static void main(String args[]) throws IOException {
        try{
            DataInputStream in = new DataInputStream(
                new ByteArrayInputStream(
                    BufferedInputFile.read(Property.getProperties("IOPath") + "BufferedInput\\FormattedMemoryInput.java").getBytes()));
            while (in.available() != 0){
                System.out.println((char)in.readByte());
            }
        }catch (EOFException e){
            e.printStackTrace();
        }
    }
}
