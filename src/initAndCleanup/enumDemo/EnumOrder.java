package initAndCleanup.enumDemo;

/**
 * Created by H.J
 * 2018/5/21
 */
public class EnumOrder {
    public static void main(String args[]){
        for(Spiciness s : Spiciness.values()){
            System.out.println(s + ",ordinal " + s.ordinal());
        }
    }
}
