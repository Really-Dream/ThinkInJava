package concurrency;

/**
 * Created by H.J
 * 2018/5/30
 */
public class Liftoff implements Runnable{
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public Liftoff(){}
    public Liftoff(int countDown){
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "Lifroff!") + "), ";
    }

    @Override
    public void run() {
        while (countDown-- > 0){
            System.out.print(status());
            Thread.yield();
        }
    }

    public static void main(String[] args){
        Liftoff launch = new Liftoff();
        launch.run();
    }
}
