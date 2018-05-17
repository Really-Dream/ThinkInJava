package IO.newIO;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * Created by H.J
 * 2018/5/17
 * 视图缓冲器
 */
public class IntBufferDemo {

    private static final int BSIZE = 1024;
    public static void main(String[] args){
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        IntBuffer ib = bb.asIntBuffer();

        ib.put(new int[]{11,12,13,14,15,1999});

        System.out.println(ib.get(3));
        ib.put(3,1811);

        ib.flip();
        while (ib.hasRemaining()){
            int i = ib.get();
            System.out.println(i);
        }
    }
}
