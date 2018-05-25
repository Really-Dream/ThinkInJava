package innerclasses.controller;

/**
 * Created by H.J
 * 2018/5/25
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long dalayTime){
        this.delayTime = dalayTime;
        start();
    }

    public void start(){
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}
