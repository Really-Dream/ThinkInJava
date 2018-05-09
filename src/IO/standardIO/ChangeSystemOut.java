package IO.standardIO;

import java.io.PrintWriter;

/**
 * Created by H.J
 * 2018/5/9
 * System.out是一个PrintStream
 * PrintStream是一个OutputStream
 * PrintStream有一个可以接受OutputStream作为参数的构造器
 */
public class ChangeSystemOut {
    public static void main(String args[]){
        PrintWriter out = new PrintWriter(System.out,true);
        out.println("Hello, world");
    }
}
