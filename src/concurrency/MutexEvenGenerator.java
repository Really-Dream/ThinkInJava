package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by H.J
 * 2018/6/1
 */
public class MutexEvenGenerator extends IntGeneratior{
    private int currentEvenValue = 0;
    private Lock lock = new ReentrantLock();
    public int next(){
        lock.lock();
        try{
            ++currentEvenValue;
            Thread.yield();
            ++currentEvenValue;
            return currentEvenValue;
        }finally {
            lock.unlock();
        }
    }
    public static void main(String[] args){
        EvenChecker.test(new MutexEvenGenerator());
    }
}
