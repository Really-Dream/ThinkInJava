package initAndCleanup;

/**
 * Created by H.J
 * 2018/5/21
 * 可变参数列表
 */
class A{}

public class VarArgs {
    static void pringArray(Object[] args){
        for(Object obj : args){
            System.out.println(obj + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        pringArray(new Object[]{
                new Integer(47),
                new Float(3.14),
                new Double(11.11)
        });
        pringArray(new Object[]{
                "one","two","three"
        });
        pringArray(new Object[]{
                new A(),new A(),new A()
        });
    }
}
