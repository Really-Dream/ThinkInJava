package concurrency;

/**
 * Created by H.J
 * 2018/6/1
 */
public class Atomicity {
    int i;
    void f1(){i++;}
    void f2(){i += 3;}
}
