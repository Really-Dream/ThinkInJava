package IO.RandomAccess;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by H.J
 * 2018/5/8
 * 读写随机访问文件
 */
public class UsingRandomAccessFile {
    static String file = "rtest.dat";
    static void display() throws IOException{
        RandomAccessFile rf = new RandomAccessFile(file,"r");
        for(int i = 0; i < 7; i++){
            System.out.println("Value " + i + ": " + rf.readDouble());
        }
        System.out.println(":"+rf.readUTF());
        rf.close();
    }

    public static void main(String args[]) throws IOException{
        RandomAccessFile rf = new RandomAccessFile(file,"rw");
        for(int i = 0; i < 7; i++){
            rf.writeDouble(i*1.414);
        }
        rf.writeUTF("The end of the file");
        rf.close();
        display();
        rf = new RandomAccessFile(file,"rw");
        //直接将文件指针移到第五个double数据后面
        rf.seek(5 * 8);
        //覆盖第六个double数据
        rf.writeDouble(47.0001);
        rf.close();
        display();
    }
}
