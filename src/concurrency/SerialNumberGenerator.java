package concurrency;

/**
 * Created by H.J
 * 2018/6/1
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public static int nextSerialNumber(){
        return serialNumber++;
    }
}
