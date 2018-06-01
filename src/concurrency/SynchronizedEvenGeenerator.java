package concurrency;

/**
 * Created by H.J
 * 2018/6/1
 */
public class SynchronizedEvenGeenerator extends IntGeneratior {
    private int currentEvenValue = 0;
    public synchronized int next(){
        ++ currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }
    public static void main(String[] args){
        EvenChecker.test(new SynchronizedEvenGeenerator());
    }
}
