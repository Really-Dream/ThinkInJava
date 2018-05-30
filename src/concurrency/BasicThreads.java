package concurrency;

/**
 * Created by H.J
 * 2018/5/30
 */
public class BasicThreads {
    public static void main(String[] args){
        Thread t = new Thread(new Liftoff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
