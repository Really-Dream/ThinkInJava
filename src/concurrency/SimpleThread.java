package concurrency;

/**
 * Created by H.J
 * 2018/5/31
 * 编码的变体
 */
public class SimpleThread extends Thread {
    private int countDown = 5;
    private static int threadCount = 0;
    private SimpleThread(){
        super(Integer.toString(++threadCount));
        start();
    }
    public String toString(){
        return "#" + getName() + "(" + countDown + ") ";
    }

    @Override
    public void run() {
        while (true){
            System.out.println(this);
            if(--countDown == 0){
                return;
            }
        }
    }
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            new SimpleThread();
        }
    }
}
