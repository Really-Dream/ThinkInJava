package IO.FileOutput;

import IO.BufferedInput.BufferedInputFile;
import util.Property;

import java.io.*;
/**
 * Created by H.J
 * 2018/5/8
 * 文本文件输出的快捷方式
 */
public class FileOutputShortcut {
    static String file = "FileOutputShortcut.out";
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(
            new StringReader(
                    BufferedInputFile.read(Property.getProperties("IOPath") + "FileOutput\\FileOutputShortcut.java")));

        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null){
            out.println(lineCount++ + ": " + s);
        }
        out.close();

        System.out.println(BufferedInputFile.read(file));
    }
}
