package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by H.J
 * 2018/6/1
 */
public class EvenChecker implements Runnable {
    private IntGeneratior generatior;
    private final int id;
    public EvenChecker(IntGeneratior g,int ident){
        generatior = g;
        id = ident;
    }

    @Override
    public void run() {
        while (!generatior.isCanceled()){
            int val = generatior.next();
            if(val %2 != 0){
                System.out.println(val + " not even!");
                generatior.cancel();
            }
        }
    }

    public static void test(IntGeneratior gp,int count){
        System.out.println("Press control.C to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < count; i++){
            exec.execute(new EvenChecker(gp,i));
        }
        exec.shutdown();
    }

    public static void test(IntGeneratior gp){
        test(gp,10);
    }
}
