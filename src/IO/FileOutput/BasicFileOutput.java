package IO.FileOutput;

import IO.BufferedInput.BufferedInputFile;
import util.Property;

import java.io.*;

/**
 * Created by H.J
 * 2018/5/8
 * 基本的文件输出
 */
public class BasicFileOutput {
    static String file = "BasicFileOutput.out";
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(
            new StringReader(
                    BufferedInputFile.read(Property.getProperties("IOPath") + "FileOutput\\BasicFileOutput.java")));
        PrintWriter out = new PrintWriter(
            new BufferedWriter(
                new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null){
            out.println(lineCount++ + ": " + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
