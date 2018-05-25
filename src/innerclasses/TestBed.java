package innerclasses;

/**
 * Created by H.J
 * 2018/5/25
 */
public class TestBed {
    public void f(){
        System.out.println("f()");
    }
    public static class Tester{
        public static void main(String[] args){
            TestBed t = new TestBed();
            t.f();
        }
    }
}
