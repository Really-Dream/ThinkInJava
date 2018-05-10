package IO.IO_directory;


import java.io.File;


/**
 * Created by H.J
 * 2018/4/28
 */
public class DirectoryDemo {

    public static void main(String[] args){
        PPrint.pprint(Directory.walk(".").dirs);

        for(File file : Directory.local(".",".*")){
            System.out.println(file);
        }

        for(File file : Directory.walk(".",".*\\.iml")){
            System.out.println(file);
        }

        for(File file : Directory.walk(".",".*[Zz].*\\.out")){
            System.out.println(file);
        }
    }
}
