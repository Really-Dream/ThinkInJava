package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by H.J
 * 2018/5/31
 */
public class NaiveExceptionHandling {
    public static void main(String[] args){
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            exec.execute(new ExceptionThread());
        }catch (RuntimeException e){
            System.out.println("Exception has been handled!");
        }
    }
}
