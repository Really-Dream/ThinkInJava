package initAndCleanup;

/**
 * Created by H.J
 * 2018/5/20
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals){
        petalCount = petals;
        System.out.println("Constructor w/ int arg only,petalCount = "+petalCount);
    }
    Flower(String ss){
        System.out.println("Constructor w/ String arg only, s = "+ss);
        s = ss;
    }
    Flower(String s,int petals){
        this(petals);
//        this(s); 使用this可以条用一个构造器，但却不能调用两个，且必须将构造器调用置于起始处
        this.s = s;
        System.out.println("String & int args");
    }
    Flower(){
        this("hi",47);
        System.out.println("default constructor (no args)");
    }
    void printPetalCount(){
//        this(11);出构造器之外，其他地方禁止使用this方法
        System.out.println("petalCount = "+petalCount + " s = "+s);
    }
    public static void main(String args[]){
        Flower x = new Flower();
        x.printPetalCount();
    }
}
