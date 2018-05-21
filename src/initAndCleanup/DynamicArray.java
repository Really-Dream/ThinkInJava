package initAndCleanup;

/**
 * Created by H.J
 * 2018/5/21
 */
public class DynamicArray {
    public static void main(String args[]){
        Other.main(new String[]{"fff","sss","aaa"});
    }
}

class Other{
    public static void main(String args[]){
        for(String s : args){
            System.out.println(s + " ");
        }
    }
}