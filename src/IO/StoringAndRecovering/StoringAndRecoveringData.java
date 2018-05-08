package IO.StoringAndRecovering;

import java.io.*;

/**
 * Created by H.J
 * 2018/5/8
 * 存储和恢复数据
 */
public class StoringAndRecoveringData {
    public static void main(String args[]) throws IOException {
        DataOutputStream out = new DataOutputStream(
            new BufferedOutputStream(
                new FileOutputStream("Data.txt")));
        out.writeDouble(3.1415926);
        out.writeUTF(" 呵呵");
        out.writeDouble(1.41413);
        out.writeUTF("Square root of 2");
        out.close();
        DataInputStream in = new DataInputStream(
            new BufferedInputStream(
                new FileInputStream("E:\\JAVA_space\\ThinkInJava\\Data.txt")));
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
    }
}
