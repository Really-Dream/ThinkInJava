package concurrency;

/**
 * Created by H.J
 * 2018/5/30
 */
public class MoreBasicThreads {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            new Thread(new Liftoff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
