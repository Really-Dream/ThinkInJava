package concurrency;

/**
 * Created by H.J
 * 2018/6/1
 */
public abstract class IntGeneratior {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel(){canceled = true;}

    public boolean isCanceled() {
        return canceled;
    }
}
