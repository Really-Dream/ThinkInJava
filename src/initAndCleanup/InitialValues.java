package initAndCleanup;

/**
 * Created by H.J
 * 2018/5/21
 * 成员初始化
 */
public class InitialValues {
    boolean t;
    char c ;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
    void printInitiaValues(){
        System.out.println("Data type Initial value");
        System.out.println("boolean: "+t);
        System.out.println("char: "+c);
        System.out.println("byte: "+b);
        System.out.println("short: "+s);
        System.out.println("int: "+i);
        System.out.println("long: "+l);
        System.out.println("float: "+f);
        System.out.println("double: "+d);
        System.out.println("InitialValues: "+reference);
    }

    public static void main(String[] args){
        InitialValues iv = new InitialValues();
        iv.printInitiaValues();
    }
}
