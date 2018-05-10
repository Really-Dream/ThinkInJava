package IO.IO_file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by H.J
 * 2018/4/27
 */
public class DirList2 {

    //JDK1.7以下，内部类只能接受final修饰的参数
    //JDK1.8以上，不需要这样的限制
    public static FilenameFilter filter(String regex){
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args){
        File path = new File(".");
        String[] list;
        if(args.length == 0){
            list = path.list();
        }else{
            list = path.list(filter(args[0]));
        }
        if(list != null && list.length > 0){
            Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
            for(String dirItem : list){
                System.out.println(dirItem);
            }
        }
    }
}
