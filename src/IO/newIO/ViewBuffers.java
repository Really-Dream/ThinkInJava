package IO.newIO;

import java.nio.*;

/**
 * Created by H.J
 * 2018/5/17
 * 一旦底层的ByteBuffer 通过视图缓冲器填满了证书或其他基本类型时
 * 就可以直接被写到通道中了，正像从通道中读取的那样容易，
 * 然后使用视图缓冲器可以把任何数据都转化成某一特定的基本类型
 *  ----------------------------------------------
 *  丨0  丨0  丨0  丨0  丨0  丨0  丨0  丨97  丨bytes
 *  丨        丨        丨        丨a        丨chars
 *  丨0       丨0       丨0       丨97       丨shorts
 *  丨0                 丨97                 丨ints
 *  丨0.0               丨1.36E-43           丨floats
 *  丨97                                     丨longs
 *  丨4.8E-322                               丨doubles
 *
 */
public class ViewBuffers {

    public static void main(String[] args){
        ByteBuffer bb = ByteBuffer.wrap(new byte[]{0,0,0,0,0,0,0,'a'});
        bb.rewind();

        System.out.print("Byte Buffer ");
        while (bb.hasRemaining())
            System.out.print(bb.position() + "-> " + bb.get() + ", ");
        System.out.println();

        CharBuffer cb = ((ByteBuffer)bb.rewind()).asCharBuffer();
        System.out.print("Char Buffer ");
        while (cb.hasRemaining())
            System.out.print(cb.position() + "-> " + cb.get() + ", ");
        System.out.println();

        FloatBuffer fb = ((ByteBuffer)bb.rewind()).asFloatBuffer();
        System.out.print("Float Buffer ");
        while (fb.hasRemaining())
            System.out.print(fb.position() + "-> " + fb.get() + ", ");
        System.out.println();

        IntBuffer ib = ((ByteBuffer)bb.rewind()).asIntBuffer();
        System.out.print("Int Buffer ");
        while (ib.hasRemaining())
            System.out.print(ib.position() + "-> " + ib.get() + ", ");
        System.out.println();

        LongBuffer lb = ((ByteBuffer)bb.rewind()).asLongBuffer();
        System.out.print("Long Buffer ");
        while (lb.hasRemaining())
            System.out.print(lb.position() + "-> " + lb.get() + ", ");
        System.out.println();

        ShortBuffer sb = ((ByteBuffer)bb.rewind()).asShortBuffer();
        System.out.print("Short Buffer ");
        while (sb.hasRemaining())
            System.out.print(sb.position() + "-> " + sb.get() + ", ");
        System.out.println();

        DoubleBuffer db = ((ByteBuffer)bb.rewind()).asDoubleBuffer();
        System.out.print("Double Buffer ");
        while (db.hasRemaining())
            System.out.print(db.position() + "-> " + db.get() + ", ");
        System.out.println();
    }
}
