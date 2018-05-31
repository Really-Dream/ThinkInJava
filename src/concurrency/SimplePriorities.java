package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by H.J
 * 2018/5/31
 * 优先级
 */
public class SimplePriorities implements Runnable {
    private int countDown = 5;
    private volatile double d;
    private int priority;
    public SimplePriorities(int priority){
        this.priority = priority;
    }
    public String toString(){
        return Thread.currentThread() + ": " + countDown;
    }

    public void run(){
        Thread.currentThread().setPriority(priority);
        while (true){
            for(int i = 1; i < 100000; i++){
                d += (Math.PI + Math.E) / (double) i;
                if(i % 1000 == 0){
                    // 让出CPU的使用权，给其他线程执行机会、
                    // 让同等优先权的线程运行（但并不保证当前线程会被JVM再次调度、
                    // 使该线程重新进入Running状态），
                    // 如果没有同等优先权的线程，那么yield()方法将不会起作用。
                    Thread.yield();
                }
            }
            System.out.println(this);
            if(--countDown == 0){
                return;
            }
        }
    }

    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++){
            exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
        }
        exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        exec.shutdown();
    }
}
