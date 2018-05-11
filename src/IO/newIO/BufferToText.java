package IO.newIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Properties;

/**
 * Created by H.J
 * 2018/5/11
 */
public class BufferToText {
    private static final int BSIZE = 1024;
    public static void main(String args[]) throws Exception{
        FileChannel fc = new FileOutputStream("data2.txt").getChannel();
        fc.write(ByteBuffer.wrap("some text".getBytes()));
        fc.close();
        fc = new FileInputStream("data2.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();

        System.out.println(buff.asCharBuffer());

        buff.rewind();
        Properties props=System.getProperties();
        String encoding = System.getProperty("file.encoding");
        System.out.println("Decoded using " + encoding + ":"
            + Charset.forName(encoding).decode(buff));

        fc = new FileOutputStream("data2.txt").getChannel();
        fc.write(ByteBuffer.wrap("some text".getBytes("UTF-16BE")));
        fc.close();

        fc = new FileInputStream("data2.txt").getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());

        fc = new FileOutputStream("data2.txt").getChannel();
        buff = ByteBuffer.allocate(24);
        buff.asCharBuffer().put("some text");
        fc.write(buff);
        fc.close();

        fc = new FileInputStream("data2.txt").getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
    }
}
