package concurrency;

/**
 * Created by H.J
 * 2018/6/1
 */
class DualSynch{
    private Object syncObject = new Object();
    public synchronized void f(){
        for(int i = 0; i < 5; i++){
            System.out.println("f()");
            Thread.yield();
        }
    }
    public void g(){
        synchronized (syncObject){
            for(int i = 0; i < 5; i++){
                System.out.println("G()");
                Thread.yield();
            }
        }
    }
}

public class SyncObject {
    public static void main(String[] args){
        final DualSynch ds = new DualSynch();
        new Thread(){
            @Override
            public void run() {
                ds.f();
            }
        }.start();
        ds.g();
    }
}

