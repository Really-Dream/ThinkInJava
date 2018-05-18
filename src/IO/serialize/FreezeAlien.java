package IO.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Created by H.J
 * 2018/5/18
 */
public class FreezeAlien {
    public static void main(String[] args) throws Exception{
        ObjectOutput out = new ObjectOutputStream(
                new FileOutputStream("X.file")
        );
        Alien quellek = new Alien();
        out.writeObject(quellek);
    }
}
