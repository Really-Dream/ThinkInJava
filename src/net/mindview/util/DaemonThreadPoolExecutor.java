package net.mindview.util;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by H.J
 * 2018/5/31
 */
public class DaemonThreadPoolExecutor extends ThreadPoolExecutor {
    public DaemonThreadPoolExecutor(){
        super(0,Integer.MAX_VALUE,60L,TimeUnit.SECONDS,
                new SynchronousQueue<>(),
                new DaemonThreadFactory());
    }
}
