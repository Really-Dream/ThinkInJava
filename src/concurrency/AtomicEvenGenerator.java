package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by H.J
 * 2018/6/1
 */
public class AtomicEvenGenerator extends IntGeneratior {
    private AtomicInteger currentEvenVlaue = new AtomicInteger(0);
    public int next(){
        return currentEvenVlaue.addAndGet(2);
    }
    public static void main(String[] args){
        EvenChecker.test(new AtomicEvenGenerator());
    }
}
