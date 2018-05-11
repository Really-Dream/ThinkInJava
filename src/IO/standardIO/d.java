package IO.standardIO;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Date;

/**
 * Created by H.J
 * 2018/5/11
 */
public class d {
    public static void main(String[] args) {

        try{

            PrintStream mytxt=new PrintStream("./log.txt");

            PrintStream out=System.out;

            System.setOut(mytxt);

            System.out.println("文档执行的日期是："+new Date());

            System.setOut(out);

            System.out.println("日期保存完毕。");

        }catch(FileNotFoundException e){

            e.printStackTrace();

        }

    }
}
