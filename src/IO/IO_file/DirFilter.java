package IO.IO_file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Created by H.J
 * 2018/4/28
 */
public class DirFilter implements FilenameFilter {
    private Pattern pattern;

    public DirFilter(String regex){
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name){
        return pattern.matcher(name).matches();
    }
}
