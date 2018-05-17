package IO.newIO;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * Created by H.J
 * 2018/5/17
 * 字节存放次序
 * big endian(高位优先) 将最重要的字节存放在地址最低的存储器单元
 * little endian(低位优先) 将最重要的字节放在地址最高的存储器单元
 */
public class Endians {
    public static void main(String[] args){
        ByteBuffer bb = ByteBuffer.wrap(new byte[12]);
        bb.asCharBuffer().put("abcdef");
        System.out.println(Arrays.toString(bb.array()));
        bb.rewind();

        bb.order(ByteOrder.BIG_ENDIAN);
        bb.asCharBuffer().put("abcdef");
        System.out.println(Arrays.toString(bb.array()));

        bb.rewind();
        bb.order(ByteOrder.LITTLE_ENDIAN);
        bb.asCharBuffer().put("abcdef");
        System.out.println(Arrays.toString(bb.array()));
    }
}
