package IO.newIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * Created by H.J
 * 2018/5/11
 */
public class TransferTo {
    public static void main(String args[]) throws Exception{
        if(args.length != 2){
            System.out.println("arguments : sourcefile destfile");
            System.exit(1);
        }
        FileChannel
            in = new FileInputStream(args[0]).getChannel(),
            out = new FileOutputStream(args[1]).getChannel();
        in.transferTo(1,in.size(),out);
    }
}
