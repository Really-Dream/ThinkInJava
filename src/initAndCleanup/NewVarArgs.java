package initAndCleanup;

/**
 * Created by H.J
 * 2018/5/21
 */
public class NewVarArgs {

    static void printArray(Object... args){
        for(Object obj : args){
            System.out.println(obj + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        printArray(new Integer(47),new Integer(34));
        printArray("a","b","c");
        printArray(new A(),new A(),new A());

        printArray((Object[])new Integer[]{1,1,2,3,4});
        printArray();
    }
}
