package concurrency;

import net.mindview.util.DaemonThreadFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by H.J
 * 2018/5/31
 */
public class DaemonFromFactory implements Runnable {
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws Exception{
        ExecutorService exec = Executors.newCachedThreadPool(
                new DaemonThreadFactory()
        );
        for(int i = 0; i < 10; i++){
            exec.execute(new DaemonFromFactory());
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}

