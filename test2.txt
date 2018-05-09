package IO.readWriteTool;

import util.Property;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by H.J
 * 2018/5/9
 */
public class TextFile extends ArrayList<String> {

    public static String read(String fileName){
        StringBuilder sb = new StringBuilder();
        try{
            BufferedReader in = new BufferedReader(
                new FileReader(
                    new File(fileName).getAbsoluteFile()));
            try{
                String s;
                while ((s = in.readLine()) != null){
                    sb.append(s);
                    sb.append("\n");
                }
            }finally {
                in.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void write(String fileName,String text){
        try{
            PrintWriter out = new PrintWriter(
                new File(fileName).getAbsoluteFile());
            try{
                out.print(text);
            }finally {
                out.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public TextFile(String fileName,String splitter){
        super(Arrays.asList(read(fileName).split(splitter)));
        if(get(0).equals("")){
            remove(0);
        }
    }

    public TextFile(String fileName){
        this(fileName,"\n");
    }

    public void write(String fileName){
        try{
            PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile()
            );
            try{
                for(String item : this){
                    out.println(item);
                }
            }finally {
                out.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        String file = read(Property.getProperties("IOPath")+"readWriteTool\\TextFile.java");
        write("text.txt",file);
        TextFile text = new TextFile("text.txt");
        text.write("test2.txt");
        TreeSet<String> words = new TreeSet<>(new TextFile(
                Property.getProperties("IOPath")+"readWriteTool\\TextFile.java","\\W+"));
        System.out.println(words.headSet("a"));
    }
}
