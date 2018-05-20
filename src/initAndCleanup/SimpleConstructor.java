package initAndCleanup;

/**
 * Created by H.J
 * 2018/5/20
 */
class Rock{
    Rock(){
        System.out.println("Rock ");
    }
}

public class SimpleConstructor {
    public static void main(String args[]){
        for(int i = 0; i < 10; i++){
            new Rock();
        }
    }
}
