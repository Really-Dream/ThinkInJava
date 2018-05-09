package IO.standardIO;

import util.Property;

import java.io.*;

/**
 * Created by H.J
 * 2018/5/9
 * 标准IO重定向
 */
public class Redirecting {
    public static void main(String args[]) throws IOException {
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(
                new FileInputStream(Property.getProperties("IOPath")+"standardIO\\Redirecting.java")
        );
        PrintStream out = new PrintStream(
                new BufferedOutputStream(new FileOutputStream("test.out"))
        );
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
        System.setOut(console);
    }
}
